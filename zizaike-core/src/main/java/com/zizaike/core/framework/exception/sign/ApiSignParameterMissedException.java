package com.zizaike.core.framework.exception.sign;

import com.zizaike.core.framework.exception.ErrorCodeFields;
import com.zizaike.core.framework.exception.ZZKServiceException;


/**
 * 
 * ClassName: ApiSignParameterMissedException <br/>  
 * Function: 签名参数缺少异常. <br/>  
 * date: 2015年11月16日 上午11:51:46 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class ApiSignParameterMissedException extends ZZKServiceException {
	private static final long serialVersionUID = 8516161039269756757L;
	
	public ApiSignParameterMissedException(){
		super(ErrorCodeFields.API_SIGN_PARAMETER_MISSED);
	}

}
