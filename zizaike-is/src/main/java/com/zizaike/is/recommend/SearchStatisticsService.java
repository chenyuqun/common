/**  
 * Project Name:recommend-service  <br/>
 * File Name:LoctypeDao.java  <br/>
 * Package Name:com.zizaike.recommend.dao  <br/>
 * Date:2015年11月10日下午2:00:39  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:recommend-service <br/> 
 * File Name:LoctypeDao.java  <br/>
 * Package Name:com.zizaike.recommend.dao  <br/>
 * Date:2015年11月10日下午2:00:39  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.is.recommend;  

import java.util.List;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.core.framework.springext.database.Master;
import com.zizaike.entity.recommend.SearchStatistics;

/**
 * 
 * ClassName: SearchStatisticsService <br/>  
 * Function:搜索统计服务. <br/>  
 * date: 2015年12月8日 下午6:26:14 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public interface SearchStatisticsService {
    /**
     * 
     * addBatch:批量导入. <br/>  
     *  
     * @author snow.zhang  
     * @param list
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
     void addBatch (List<SearchStatistics> list)throws ZZKServiceException;
     /**
      * 
      * deleteDay:删除如果当天有数据则先删除再同步最新数据. <br/>  
      *  
      * @author snow.zhang  
      * @param list
      * @throws ZZKServiceException  
      * @since JDK 1.7
      */
     void deleteDay (SearchStatistics searchStatistics)throws ZZKServiceException;
 }
  
