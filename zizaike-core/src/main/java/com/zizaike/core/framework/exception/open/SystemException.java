/**  
 * Project Name:zizaike-core  <br/>
 * File Name:UserException.java  <br/>
 * Package Name:com.zizaike.core.framework.exception.open  <br/>
 * Date:2016年1月20日下午3:44:44  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.core.framework.exception.open;  

import com.zizaike.core.framework.exception.ZZKServiceException;

/**  
 * ClassName:UserException <br/>  
 * Date:     2016年1月20日 下午3:44:44 <br/>  
 * @author  snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class SystemException  extends ZZKServiceException {
    private static final long serialVersionUID = -4149773397759899726L;

    public SystemException() {
        super(ErrorCodeFields.SYSTEM_ERROR);
    }
    
}
