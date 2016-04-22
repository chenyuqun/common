package com.zizaike.core.framework.event;

import com.zizaike.core.framework.exception.IllegalParamterException;


/**
 * 
 * ClassName: BusinessOperationBeforeEvent <br/>  
 * Function: 业务处理即将开始. <br/>  
 * date: 2016年4月5日 上午11:49:58 <br/>  
 *  
 * @author snow.zhang  
 * @version @param <S>  
 * @since JDK 1.7
 */
public class BusinessOperationBeforeEvent<S> extends BusinessOperationEvent<S> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6570770545271413543L;

	public BusinessOperationBeforeEvent(BusinessOperation operation,S source) throws IllegalParamterException{
		super(operation,CommonOperationAction.Before,source);
	}
}
