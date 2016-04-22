package com.zizaike.core.framework.event;

import com.zizaike.core.framework.exception.IllegalParamterException;
import com.zizaike.core.framework.exception.ZZKServiceException;



/****
 * <p>业务操作失败事件。</p>
 * <p>
 * 业务动作失败，必有其失败原因。<br>
 * 其失败原因，以定义的业务异常描述。
 * </p>
 * @author snow.zhang
 */
public class BusinessOperationFailedEvent<S> extends BusinessOperationEvent<S> {
	
    private static final long serialVersionUID = 1375303597607749990L;

    public BusinessOperationFailedEvent(BusinessOperation operation, S source, ZZKServiceException cause) throws IllegalParamterException {
		super(operation,CommonOperationAction.Failed,source);
		if(cause == null){
			throw new IllegalParamterException("failed cause is required");
		}
		this.cause = cause;
	}
	
	private ZZKServiceException cause;

	public ZZKServiceException getCause() {
		return cause;
	}
	
	

}
