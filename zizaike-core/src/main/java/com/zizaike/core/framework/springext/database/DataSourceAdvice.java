package com.zizaike.core.framework.springext.database;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.annotation.AnnotationUtils;

import com.zizaike.core.common.util.logger.Logger;

import java.lang.reflect.Method;

/**
 * 
 * ClassName: DataSourceAdvice <br/>  
 * Function: 切面<br/>  
 * Reason: 切面 <br/>  
 * date: 2015年10月15日 下午6:30:14 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class DataSourceAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice, InitializingBean {

    private static final Logger LOG = Logger.getLogger(DataSourceAdvice.class);

    private String defaultSlaveDataSource;

    private String defaultMasterDataSource;

    private String switch2Slave(Slave slave) {
        String dataSource;
        dataSource = slave.dataSource() == null ? defaultMasterDataSource : slave.dataSource();
        DataSourceSwitcher.setDataSource(dataSource);
        return dataSource;
    }

    private String switch2Master(Master master) {
        String dataSource;
        dataSource = master.dataSource() == null ? defaultMasterDataSource : master.dataSource();
        DataSourceSwitcher.setDataSource(dataSource);
        return dataSource;
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
        DataSourceSwitcher.clearDataSource();
    }

    public void before(Method method, Object[] args, Object target) throws Throwable {

        String dataSource = this.defaultSlaveDataSource;
        try {
            // 当方法中有Master或者Slave注解时，直接switch 到对应数据源
            Master master = AnnotationUtils.findAnnotation(method, Master.class);
            if (master != null) {
                dataSource = switch2Master(master);
                return;
            }
            Slave slave = AnnotationUtils.findAnnotation(method, Slave.class);
            if (slave != null) {
                dataSource = switch2Slave(slave);
                return;
            }
            // 方法中无数据源注解时，将到类声明中查找数据源注解
            @SuppressWarnings("rawtypes")
            Class clazz = target.getClass();
            master = AnnotationUtils.findAnnotation(clazz, Master.class);
            if (master != null) {
                dataSource = switch2Master(master);
                return;
            }
            slave = AnnotationUtils.findAnnotation(clazz, Slave.class);
            if (slave != null) {
                dataSource = switch2Slave(slave);
                return;
            }
            // 最终无声明时，使用Slave注解
            LOG.warn("you should declare data source on your method or class,otherwire we will use slave datasource");
            DataSourceSwitcher.setDataSource(defaultSlaveDataSource);
        } finally {
            LOG.debug("DataSource Switch > datasource switch to {}," + " class={}, method: {}", dataSource,
                    target.getClass(), method.getName());
            // DataSourceSwitcher.clearDataSource();
        }

    }

    public void afterPropertiesSet() throws Exception {

        this.defaultSlaveDataSource = (String) Slave.class.getDeclaredMethod("dataSource").getDefaultValue();
        this.defaultMasterDataSource = (String) Master.class.getDeclaredMethod("dataSource").getDefaultValue();

    }

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        DataSourceSwitcher.clearDataSource();

    }

}
