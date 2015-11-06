package com.zizaike.core.framework.exception;




/**
 * 
 * ClassName: IllegalParamterException <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2015年10月28日 上午11:10:32 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class IllegalParamterException extends ZZKServiceException {

	private static final long serialVersionUID = -9145714915360036533L;

	public IllegalParamterException() {
		this(null);
	}

	public IllegalParamterException(String description) {
	    super(description, ErrorCodeFields.ILLEGAL_ARGUMENTS);
	}

}