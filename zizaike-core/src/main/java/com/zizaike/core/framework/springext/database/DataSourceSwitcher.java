package com.zizaike.core.framework.springext.database;



import org.springframework.util.Assert;

/**
 * 
 * ClassName: DataSourceSwitcher <br/>  
 * Function: 数据源选择器, 实现读写分离. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2015年10月15日 下午6:31:02 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class DataSourceSwitcher {
    
    /** userinfo 数据库 主表 */
    public static final String DATASOURCE_MASTER = "master";
    /** userinfo 数据库 从表 */
    public static final String DATASOURCE_SLAVE = "slave";

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();
    
    public DataSourceSwitcher() {}
    
    public static void setDataSource(String dataSource) {
        Assert.notNull(dataSource, "dataSource cannot be null");
        CONTEXT_HOLDER.set(dataSource);
    }
    
    public static String getDataSource() {
        return CONTEXT_HOLDER.get();
    }
    
    public static void clearDataSource() {
        CONTEXT_HOLDER.remove();
    }
    
}
