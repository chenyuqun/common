package com.zizaike.core.framework.exception.sign;

import com.zizaike.core.framework.exception.ErrorCodeFields;
import com.zizaike.core.framework.exception.ZZKServiceException;


/**
 * 
 * ClassName: ApiSignKeyErrorException <br/>  
 * Function: apiKey 与系统不一致exception. <br/>  
 * date: 2015年11月16日 下午1:40:23 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class ApiSignKeyNotEqulesException extends ZZKServiceException {
	private static final long serialVersionUID = 8516161039269756757L;
	
	public ApiSignKeyNotEqulesException(){
		super(ErrorCodeFields.API_SIGN_KEY_NOT_EQULES);
	}

}
