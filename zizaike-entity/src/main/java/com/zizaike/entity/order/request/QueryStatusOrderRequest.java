/**  
 * Project Name:open-api  <br/>
 * File Name:BookRQ.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.request  <br/>
 * Date:2016年1月14日下午3:56:38  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.order.request;  

import java.io.Serializable;

/**  
 * ClassName:BookRQ <br/>  
 * Function: 酒店查询订单请求. <br/>  
 * Date:     2016年1月14日 下午3:56:38 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class QueryStatusOrderRequest implements Serializable {
    private static final long serialVersionUID = 1630470494020361646L;
    /*
	 * OTA订单id，即第三方系统中的订单id
	 * 备注：当OrderId为空时，表示本次查询为异步下单后发起的查询请求；OrderId非空时表示普通的查询请求。
	 */
	private String orderId;
	/*
	 * open订单id
	 */
	private String openOrderId;
	/*
	 * OTA酒店id，即第三方系统中的酒店id
	 */
	private String hotelId;
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getOpenOrderId() {
        return openOrderId;
    }
    public void setOpenOrderId(String openOrderId) {
        this.openOrderId = openOrderId;
    }
    public String getHotelId() {
        return hotelId;
    }
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }
    @Override
    public String toString() {
        return "QueryStatusOrderRequest [orderId=" + orderId + ", openOrderId=" + openOrderId + ", hotelId=" + hotelId
                + "]";
    }
	
	
}
  
