/**  
 * Project Name:zizaike-is  <br/>
 * File Name:LoctypeService.java  <br/>
 * Package Name:com.zizaike.is.loctype  <br/>
 * Date:2015年11月10日下午1:48:03  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  

package com.zizaike.is.recommend;  

import com.zizaike.core.framework.exception.ZZKServiceException;

/**
 * 
 * ClassName: CollectDao <br/>  
 * Function: 收藏. <br/>  
 * date: 2016年4月25日 下午2:44:47 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public interface CollectService {
    /**
     * 
     * bnbCollection: 用户收藏的民宿  hid以,分割. <br/>  
     *  
     * @author snow.zhang  
     * @param userId
     * @return  
     * @since JDK 1.7
     */
    String bnbCollection(Integer userId) throws ZZKServiceException;
    
}
  
