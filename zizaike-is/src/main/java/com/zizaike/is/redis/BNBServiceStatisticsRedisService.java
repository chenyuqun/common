/**  
 * Project Name:recommend-service  <br/>
 * File Name:IHotRecommendDao.java  <br/>
 * Package Name:com.zizaike.recommend.service  <br/>
 * Date:2015年11月5日下午2:08:52  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.is.redis;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.recommend.BNBServiceSearchStatistics;

/**
 * ClassName:SearchRedisService <br/>
 * Function: 服务接口. <br/>
 * Reason:   interface. <br/>
 * Date:     2015年11月5日 下午2:08:52 <br/>
 * @author   snow.zhang
 * @version
 * @since    JDK 1.7
 * @see
 */
public interface BNBServiceStatisticsRedisService {
   /**
    * 
    * zincrSearch:服务搜索统计. <br/>  
    *  
    * @author snow.zhang  
    * @param bnbServiceSearchStatistics
    * @throws ZZKServiceException  
    * @since JDK 1.7
    */
     void zincrBNBServiceSearch(BNBServiceSearchStatistics bnbServiceSearchStatistics) throws ZZKServiceException;
   

}
  
