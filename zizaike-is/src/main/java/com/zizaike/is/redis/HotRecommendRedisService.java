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

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.recommend.Recommend;
import com.zizaike.entity.solr.ServiceSearchVo;

/**  
 * ClassName:IHotRecommendDao <br/>  
 * Function: 热推服务接口. <br/>  
 * Reason:   interface. <br/>  
 * Date:     2015年11月5日 下午2:08:52 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public interface HotRecommendRedisService {
    /**
     * 
     * quryHotRecommend:热门推荐. <br/>  
     *  
     * @author snow.zhang  
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    List<Recommend> qury () throws ZZKServiceException;
   
    /**
     * 
     * save:设置缓存+seconds. <br/>  
     *  
     * @author snow.zhang  
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    void save (List<Recommend> value) throws ZZKServiceException;
    
}
  
