package com.zizaike.core.framework.exception;

/**
 * 
 * ClassName: ErrorCode <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 错误码 <br/>
 * date: 2015年10月28日 上午11:07:03 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public class ErrorCode implements IErrorCode {

    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7  
     */
    private static final long serialVersionUID = -8939802682629602369L;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误描述
     */
    private String errorMsg;

    public ErrorCode(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMsg() {
        return this.errorMsg;
    }
}