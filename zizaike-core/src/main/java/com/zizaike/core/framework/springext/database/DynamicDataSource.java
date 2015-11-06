package com.zizaike.core.framework.springext.database;



import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 
 * ClassName: DynamicDataSource <br/>  
 * Function: 数据源动态切换. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2015年10月15日 下午6:31:21 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /* (non-Javadoc)
     * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#determineCurrentLookupKey()
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceSwitcher.getDataSource();
    }

}
