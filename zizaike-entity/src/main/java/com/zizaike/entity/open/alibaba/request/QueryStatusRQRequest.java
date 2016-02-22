/**  
 * Project Name:open-api  <br/>
 * File Name:BookRQ.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.request  <br/>
 * Date:2016年1月14日下午3:56:38  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba.request;  

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**  
 * ClassName:BookRQ <br/>  
 * Function: 酒店查询订单请求. <br/>  
 * Date:     2016年1月14日 下午3:56:38 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("QueryStatusRQ")
public class QueryStatusRQRequest extends RequestData {
    //TODO 根据 http://open.taobao.com/doc2/detail.htm?spm=0.0.0.0.kCyHLe&treeId=22&articleId=103813&docType=1 把实体类补充完整
    @XStreamAlias("AuthenticationToken")
	private AuthenticationToken authenticationToken;
	
	/*
	 * OTA订单id，即第三方系统中的订单id
	 * 备注：当OrderId为空时，表示本次查询为异步下单后发起的查询请求；OrderId非空时表示普通的查询请求。
	 */
	@XStreamAlias("OrderId")
	private String orderId;
	/*
	 * taobao订单id
	 */
	@XStreamAlias("TaoBaoOrderId")
	private long taoBaoOrderId;
	/*
	 * OTA酒店id，即第三方系统中的酒店id
	 */
	@XStreamAlias("HotelId")
	private String hotelId;
	public AuthenticationToken getAuthenticationToken() {
		return authenticationToken;
	}
	public void setAuthenticationToken(AuthenticationToken authenticationToken) {
		this.authenticationToken = authenticationToken;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public long getTaoBaoOrderId() {
		return taoBaoOrderId;
	}
	public void setTaoBaoOrderId(long taoBaoOrderId) {
		this.taoBaoOrderId = taoBaoOrderId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	@Override
	public String toString() {
		return "QueryStatusRQRequest [authenticationToken=" + authenticationToken + ", orderId=" + orderId
				+ ", taoBaoOrderId=" + taoBaoOrderId + ", hotelId=" + hotelId + "]";
	}
	
	
}
  
