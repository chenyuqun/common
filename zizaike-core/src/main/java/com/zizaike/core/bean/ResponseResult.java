package com.zizaike.core.bean;

/**
 * 
 * ClassName: ResponseResult <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 统一返回对象. <br/>
 * date: 2015年10月28日 上午11:21:40 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public class ResponseResult implements java.io.Serializable {
    private static final long serialVersionUID = 2192522296546039900L;

    private static final String SUCCESS = "200";


    /** 返回对象类型数据 */
    private Object info;

    /** 信息编码 */
    private String code;

    /** 提升信息 */
    private String message;

    /**
     * Creates a new instance of ResponseResult.
     * 
     */

    public ResponseResult() {

        this.code = SUCCESS;
    }


    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseResult [info=" + info + ", code=" + code + ", message=" + message
                + "]";
    }

}
