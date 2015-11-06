package com.zizaike.core.framework.exception;

/**
 * 
 * ClassName: RYErrorCode <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2015年10月28日 上午11:11:34 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public enum ErrorCodeFields implements IErrorCode {
    /****
     * 参数错误
     */
    ILLEGAL_ARGUMENTS("400", "illegal arguments"),
    ;

    private String errorCode;

    private String errorMsg;

    private ErrorCodeFields(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
    public String getErrorCode() {
        return this.errorCode;
    }
    
    public ErrorCodeFields setErrorMsgAndReturn(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }


}
