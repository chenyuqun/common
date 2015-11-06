package com.zizaike.core.framework.springext.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * ClassName: Slave <br/>
 * Function: 
 *  标识是否使用从库 <br/>
 *   自定义注解 默认使用类注解(没有注解, 默认slave)如果方法注解为slave,<br/>
 *   则覆盖类注解, 使用从库 如果注解名称为master, 则覆盖类注解, 使用主库<br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2015年10月15日 下午6:17:53 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Slave {
    /** 默认为slave, 可以配置多从库 */
    String dataSource() default "slave";
}
