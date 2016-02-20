/**  
 * Project Name:open-api  <br/>
 * File Name:QueryStatusRQResponse.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.response  <br/>
 * Date:2016年1月15日下午2:14:32  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.order.response;  

import java.io.Serializable;

/**
 * 
 * ClassName: QueryStatusOrderResponse <br/>  
 * Function: 查询订单返回. <br/>  
 * date: 2016年2月20日 下午2:01:37 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class QueryStatusOrderResponse implements Serializable{
    private static final long serialVersionUID = -8438468556143146364L;
    /**
     * open订单id
     */
    private String openOrderId;
    /**
     * OTA订单id，即第三方系统中的订单id
     */
    private String orderId;
    /**
     * 第三方系统订单状态
     */
    private String status;
    /**
     * 订单信息
     */
    private OrderInfo orderInfo;
    /**
     * 账单信息
     */
    private BillInfo billInfo;
    public String getOpenOrderId() {
        return openOrderId;
    }
    public void setOpenOrderId(String openOrderId) {
        this.openOrderId = openOrderId;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public OrderInfo getOrderInfo() {
        return orderInfo;
    }
    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }
    public BillInfo getBillInfo() {
        return billInfo;
    }
    public void setBillInfo(BillInfo billInfo) {
        this.billInfo = billInfo;
    }
    @Override
    public String toString() {
        return "QueryStatusOrderResponse [openOrderId=" + openOrderId + ", orderId=" + orderId + ", status=" + status
                + ", orderInfo=" + orderInfo + ", billInfo=" + billInfo + "]";
    }
    
    
    
}
  
