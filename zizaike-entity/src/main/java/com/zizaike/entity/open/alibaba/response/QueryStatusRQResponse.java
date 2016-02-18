/**  
 * Project Name:open-api  <br/>
 * File Name:QueryStatusRQResponse.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.response  <br/>
 * Date:2016年1月15日下午2:14:32  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba.response;  

import javax.print.attribute.ResolutionSyntax;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**  
 * ClassName:QueryStatusRQResponse <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年1月15日 下午2:14:32 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("Result")
public class QueryStatusRQResponse extends ResponseData{
    @XStreamAlias("TaoBaoOrderId")
    private Long taoBaoOrderId;
    @XStreamAlias("OrderId")
    private String orderId;
    @XStreamAlias("Status")
    private String status;
    @XStreamAlias("OrderInfo")
    private OrderInfo orderInfo;
    @XStreamAlias("BillInfo")
    private BillInfo billInfo;
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
    public Long getTaoBaoOrderId() {
        return taoBaoOrderId;
    }
    public void setTaoBaoOrderId(Long taoBaoOrderId) {
        this.taoBaoOrderId = taoBaoOrderId;
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
    public QueryStatusRQResponse() {
        this.resultCode="0";
        this.message="处理成功";
    }
    public QueryStatusRQResponse(String message, String resultCode, Long taoBaoOrderId, String orderId, String status,
            OrderInfo orderInfo, BillInfo billInfo) {
        this.taoBaoOrderId = taoBaoOrderId;
        this.orderId = orderId;
        this.status = status;
        this.orderInfo = orderInfo;
        this.billInfo = billInfo;
    }
    @Override
    public String toString() {
        return "QueryStatusRQResponse [taoBaoOrderId=" + taoBaoOrderId + ", orderId=" + orderId + ", status=" + status
                + ", orderInfo=" + orderInfo + ", billInfo=" + billInfo + "]";
    }
   
    
    
    
}
  
