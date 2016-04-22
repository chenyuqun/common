package com.zizaike.core.framework.event;


import com.zizaike.core.framework.event.BusinessOperationEvent.Action;

/**
 * 
 * ClassName: CommonOperationAction <br/>  
 * Function:通用业务操作Action. <br/>  
 * date: 2016年4月5日 下午1:38:50 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public enum CommonOperationAction implements Action {
	
	/****
	 * 业务动作即将开始执行
	 */
	Before("Before"),
	
	/****
	 * 业务处理完成
	 */
	Completed("Completed"),
	
	/****
	 * 业务处理失败
	 */
	Failed("Failed"),
	;

	@Override
	public String getAction() {
		return this.action;
	}
	
	private String action;

	private CommonOperationAction(String action) {
		this.action = action;
	}
	
	
}
