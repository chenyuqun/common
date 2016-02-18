/**  
 * Project Name:open-api  <br/>
 * File Name:CancelRQ.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.response  <br/>
 * Date:2016年1月15日下午3:02:14  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.alibaba.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * ClassName:CancelRQ <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年1月15日 下午3:02:14 <br/>
 * 
 * @author alex
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("Result")
public class CancelRQResponse extends ResponseData {
    @XStreamAlias("OrderId")
    private String orderId;
    @XStreamAlias("Message")
    private String message;
    @XStreamAlias("ResultCode")
    private String resultCode;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getResultCode() {
        return resultCode;
    }
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CancelRQResponse() {
        this.resultCode="0";
        this.message="成功";
    }

    @Override
    public String toString() {
        return "CancelRQResponse [orderId=" + orderId + "]";
    }

}
