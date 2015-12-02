package com.zizaike.core.framework.exception.sign;

import com.zizaike.core.framework.exception.ErrorCodeFields;
import com.zizaike.core.framework.exception.ZZKServiceException;



/**
 * 
 * ClassName: ApiSignErrorException <br/>  
 * Function: 签名异常 <br/>  
 * date: 2015年11月16日 上午11:52:54 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class ApiSignErrorException extends ZZKServiceException {
    private static final long serialVersionUID = -4149773397759899726L;

    public ApiSignErrorException() {
		super(ErrorCodeFields.API_SIGN_ERROR);
	}
	
}
