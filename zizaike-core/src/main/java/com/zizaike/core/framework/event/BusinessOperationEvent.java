package com.zizaike.core.framework.event;


import com.zizaike.core.framework.exception.IllegalParamterException;

/**
 * 
 * ClassName: BusinessOperationEvent <br/>  
 * Function: <p>业务操作事件。</p>
 * <p>
 * 一个业务操作事件，需关联预定义一个业务操作类型。<br>
 * 并指出产生该事件的业务动作点，称之为Action。    <br>
 * </p>
 * date: 2016年4月5日 下午1:38:06 <br/>  
 *  
 * @author snow.zhang  
 * @version @param <S>  
 * @since JDK 1.7
 */
public class BusinessOperationEvent<S> implements Event<S> {
	
	public static final String OPERATION_SEPARTOR = "_";
	
	public static final String BUSINESS_OPERATION = "BUSINESS_OPERATION";
	
	protected String type;
	
	protected long occuredTime = System.currentTimeMillis();
	
	protected S source;
	
	protected Action action;
	
	protected BusinessOperation operation;
	
	/****
	 * 产生该事件的业务Action
	 *
	 */
	public static interface Action extends java.io.Serializable{
		
		public String getAction();
	}
	
	public  BusinessOperationEvent(BusinessOperation operation ,Action action, S source) throws IllegalParamterException{
		if(operation == null || action == null || source == null){
			throw new IllegalParamterException("operation,action,source is required ");
		}
		this.source = source;
		this.action = action;
		this.operation = operation;
		this.type = BUSINESS_OPERATION + OPERATION_SEPARTOR + operation.getOperation() + OPERATION_SEPARTOR + action.getAction();
	}
	
	
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 319113704412167072L;



	@Override
	public String getType() {
		return type;
	}



	@Override
	public long getOccuredTime() {
		return occuredTime;
	}



	@Override
	public S getSource() {
		return source;
	}



	public Action getAction() {
		return action;
	}



	public BusinessOperation getOperation() {
		return operation;
	}
	
	
}
