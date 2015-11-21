/**  
 * Project Name:zizaike-is  <br/>
 * File Name:LoctypeRedisService.java  <br/>
 * Package Name:com.zizaike.is.redis  <br/>
 * Date:2015年11月18日下午7:47:37  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.is.redis;  

import java.util.List;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.recommend.Loctype;

/**  
 * ClassName:LoctypeRedisService <br/>  
 * Function: 行政级别. <br/>  
 * Date:     2015年11月18日 下午7:47:37 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public interface LoctypeRedisService {
    /**
     * 
     * queryByAreaLevel:查询行政级别:省、市. <br/>  
     *  
     * @author snow.zhang  
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    List<Loctype> queryByAreaLevel ()throws ZZKServiceException;
    /**
     * 
     * save:保存行政级别. 缓存一天<br/>  
     *  
     * @author snow.zhang  
     * @param list
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    void save(List<Loctype> list)throws ZZKServiceException;
}
  
