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
 * 
 * ClassName: OpenReturnException <br/>  
 * Function: 返回异常. <br/>  
 * date: 2016年3月4日 上午11:05:19 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class OpenReturnException  extends ZZKServiceException {
    private static final long serialVersionUID = -4149773397759899726L;

    public OpenReturnException() {
        super(ErrorCodeFields.OPEN_RETURN_ERROR);
    }
    public OpenReturnException(String description) {
        super(description, ErrorCodeFields.OPEN_RETURN_ERROR);
    }
    
}
