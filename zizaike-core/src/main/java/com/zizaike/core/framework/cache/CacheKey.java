/**  
 * Project Name:zizaike-core  <br/>
 * File Name:CacheKeyPrefix.java  <br/>
 * Package Name:com.zizaike.core.framework.cache  <br/>
 * Date:2015年11月7日下午5:37:11  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.core.framework.cache;  
/**  
 * ClassName:CacheKey <br/>  
 * Function: CacheKey的前缀. <br/>  
 * Reason: key接口  . <br/>  
 * Date:     2015年11月7日 下午5:37:11 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public interface CacheKey {
   /**
    * 
    * getKey:得到key. <br/>  
    *  
    * @author snow.zhang  
    * @return  
    * @since JDK 1.7
    */
    String getKey();
}
  
