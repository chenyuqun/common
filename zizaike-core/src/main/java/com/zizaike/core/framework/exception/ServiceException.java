package com.zizaike.core.framework.exception;

/**
 * 
 * ClassName: ZZKServiceException <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2015年10月28日 上午11:14:19 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public class ServiceException extends RuntimeException {
    /**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).
     * 
     * @since JDK 1.7
     */
    private static final long serialVersionUID = -4513012426222804581L;

    /** 异常码 */
    private IErrorCode errorCode;

    /**
     * 异常描述。
     */
    private String description;

    protected ServiceException() {
    }

    public ServiceException(IErrorCode errorCode) {
        this(errorCode, null);
    }

    public ServiceException(String code, String desc) {
        this.errorCode = new ErrorCode(code, desc);
        description = desc;
    }

    public ServiceException(String description, IErrorCode errorCode) {
        this(errorCode.getErrorCode(), description);
    }

   

    public ServiceException(String description, IErrorCode errorCode, Throwable cause) {
        this(errorCode, cause);
        this.description = description;
    }

    public ServiceException(IErrorCode errorCode, Throwable cause) {
        super(cause);
        if (errorCode == null) {
            throw new java.lang.IllegalArgumentException("error code could not null.");
        }
        this.errorCode = errorCode;
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String getMessage() {
        return "errorCode=" + this.errorCode.getErrorCode() + ",errorMsg=" + this.errorCode.getErrorMsg();
    }
}
