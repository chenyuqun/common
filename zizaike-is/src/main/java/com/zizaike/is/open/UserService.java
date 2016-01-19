/**  
 * Project Name:zizaike-is  <br/>
 * File Name:UserService.java  <br/>
 * Package Name:com.zizaike.is.open  <br/>
 * Date:2016年1月19日下午6:21:09  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.is.open;  

import com.zizaike.entity.open.User;

/**  
 * ClassName:UserService <br/>  
 * Function: 用户. <br/>  
 * Date:     2016年1月19日 下午6:21:09 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public interface UserService {
    /**
     * 
     * checkUser:校验用户信息. <br/>  
     *  
     * @author snow.zhang  
     * @param user
     * @return  
     * @since JDK 1.7
     */
    boolean checkUser(User user);
}
  
