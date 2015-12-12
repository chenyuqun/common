/**  
 * Project Name:recommend-service  <br/>
 * File Name:IHotRecommendDao.java  <br/>
 * Package Name:com.zizaike.recommend.service  <br/>
 * Date:2015年11月5日下午2:08:52  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.is.redis;

import java.util.List;
import java.util.Set;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.base.ChannelType;
import com.zizaike.entity.recommend.SearchStatistics;
import com.zizaike.entity.recommend.SearchStatisticsSet;

/**
 * ClassName:SearchRedisService <br/>
 * Function: 查询服务接口. <br/>
 * Reason:   interface. <br/>
 * Date:     2015年11月5日 下午2:08:52 <br/>
 * @author   snow.zhang
 * @version
 * @since    JDK 1.7
 * @see
 */
public interface SearchStatisticsRedisService {
    /**
     *  zincrTopSearch 热门搜索member累加
     * @param member
     * @throws ZZKServiceException
     */
     void zincrHotSearch(SearchStatistics searchStatistics) throws ZZKServiceException;
   
    /**
     *
     * getTopSearch:得到top的数据. <br/>
     *
     * @author snow.zhang
     * @throws ZZKServiceException
     * @since JDK 1.7
     */
     List<SearchStatistics> getHotSearch(ChannelType channelType) throws ZZKServiceException;

    /**
     * hot搜索每天更新
     * @param member
     * @throws ZZKServiceException
     */
    void zincrHotSearchEveryDay(SearchStatistics searchStatistics) throws ZZKServiceException;

    /**
     * 
     * getHotSearchEveryDay:得到hot. <br/>  
     *  
     * @author snow.zhang
     * @param channelType
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    List<SearchStatistics>  getHotSearchEveryDay(ChannelType channelType) throws ZZKServiceException;
    /**
     * 
     * zincrResultLessSearch:无结果member 累加. <br/>  
     *  
     * @author snow.zhang  
     * @param channelType
     * @param member
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    void zincrResultLessSearch(SearchStatistics searchStatistics) throws ZZKServiceException;
    /**
     * 
     * getResultLessSearch:得到无结果数据. <br/>  
     *  
     * @author snow.zhang  
     * @param channelType
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    List<SearchStatistics>  getResultLessSearch(ChannelType channelType) throws ZZKServiceException;
    /**
     * 
     * zincrResultLessSearchEveryDay:无结果每天累加. <br/>  
     *  
     * @author snow.zhang  
     * @param channelType
     * @param member
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    void zincrResultLessSearchEveryDay(SearchStatistics searchStatistics) throws ZZKServiceException;
    /**
     * 
     * getResultLessSearchEveryDay:无结果每天信息得到. <br/>  
     *  
     * @author snow.zhang  
     * @param channelType
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    List<SearchStatistics>  getResultLessSearchEveryDay(ChannelType channelType) throws ZZKServiceException;

}
  
