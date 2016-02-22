/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:CancleOrderRequest.java  <br/>
 * Package Name:com.zizaike.entity.order.request  <br/>
 * Date:2016年2月20日下午3:40:11  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.order.request;  

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.request.AuthenticationToken;

/**  
 * ClassName:CancleOrderRequest <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年2月20日 下午3:40:11 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class CancelOrderRequest implements Serializable{
    private static final long serialVersionUID = -3271701824293798918L;
    /*
     * 淘宝订单号
     */  
    private long openOrderId;
    /*
     * 外部订单号（如果已获取）
     */
    private String orderId;
    /*
     * OTA酒店code，即第三方系统中的酒店code
     */
    private String hotelId;
    /*
     * 取消订单原因
     */
    private String reason;
    /*
     * 是否强制取消订单默认false
     */
    private String hardCancel;
    
    private String cancelId;

    public long getOpenOrderId() {
        return openOrderId;
    }

    public void setOpenOrderId(long openOrderId) {
        this.openOrderId = openOrderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getHardCancel() {
        return hardCancel;
    }

    public void setHardCancel(String hardCancel) {
        this.hardCancel = hardCancel;
    }

    public String getCancelId() {
        return cancelId;
    }

    public void setCancelId(String cancelId) {
        this.cancelId = cancelId;
    }
    

}
  
