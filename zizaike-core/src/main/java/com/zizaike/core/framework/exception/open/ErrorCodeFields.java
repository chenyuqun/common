package com.zizaike.core.framework.exception.open;

import com.zizaike.core.framework.exception.IErrorCode;

/**
 * 
 * ClassName: RYErrorCode <br/>
 * Function: . <br/>
 * date: 2015年10月28日 上午11:11:34 <br/>
 *
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public enum ErrorCodeFields implements IErrorCode {
    /** 用户不存在 **/
    USER_NOT_FOUND_ERROR("10001", "user not found error"),
    /** 用户名或密码不存在 **/
    USERNAME_OR_PASSWORD_ERROR("10002", "username or password error")
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
