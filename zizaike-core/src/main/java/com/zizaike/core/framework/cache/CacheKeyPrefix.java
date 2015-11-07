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
 * ClassName:CacheKeyPrefix <br/>  
 * Function: CacheKey的前缀. <br/>  
 * Reason: 前缀接口  . <br/>  
 * Date:     2015年11月7日 下午5:37:11 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public interface CacheKeyPrefix {
    /**
     * 
     * getPrefix:得到前缀. <br/>  
     *  
     * @author snow.zhang  
     * @return  
     * @since JDK 1.7
     */
    String getPrefix();
}
  
