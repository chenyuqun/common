/**  
 * Project Name:recommend-service  <br/>
 * File Name:IHotRecommendDao.java  <br/>
 * Package Name:com.zizaike.recommend.service  <br/>
 * Date:2015年11月5日下午2:08:52  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.is.recommend;  

import java.util.List;

import com.zizaike.core.framework.exception.ServiceException;
import com.zizaike.entity.recommend.hot.Recommend;

/**  
 * ClassName:IHotRecommendDao <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年11月5日 下午2:08:52 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public interface HotRecommendService {
    /**
     * 
     * quryHotRecommend:热门推荐. <br/>  
     *  
     * @author snow.zhang  
     * @return
     * @throws ServiceException  
     * @since JDK 1.7
     */
    List<Recommend> quryHotRecommend () throws ServiceException;
}
  
