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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CancelRQResponse() {
    }
    public CancelRQResponse(String message, String resultCode, String orderId) {
        super(message, resultCode);
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "CancelRQResponse [orderId=" + orderId + "]";
    }

}
