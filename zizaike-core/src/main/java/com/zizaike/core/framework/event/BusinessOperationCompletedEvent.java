package com.zizaike.core.framework.event;

import com.zizaike.core.framework.exception.IllegalParamterException;


/**
 * 
 * ClassName: BusinessOperationCompletedEvent <br/>  
 * Function: 业务处理结束事件 <br/>  
 * date: 2016年4月5日 下午1:37:37 <br/>  
 *  
 * @author snow.zhang  
 * @version @param <S>  
 * @since JDK 1.7
 */
public class BusinessOperationCompletedEvent<S> extends BusinessOperationEvent<S> {

	public BusinessOperationCompletedEvent(BusinessOperation operation , S source) throws IllegalParamterException {
		super(operation,CommonOperationAction.Completed,source);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2955968165155860532L;

}
