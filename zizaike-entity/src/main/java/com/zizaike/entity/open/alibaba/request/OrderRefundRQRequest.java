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
 * Function: 已付款,申请退款请求.暂时不关心使用 <br/>  
 * Date:     2016年1月14日 下午3:56:38 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("OrderRefundRQ")
public class OrderRefundRQRequest extends RequestData {
    //TODO http://open.taobao.com/doc2/detail.htm?spm=0.0.0.0.hO61LC&treeId=22&articleId=103814&docType=1 把实体类补充完整
    @XStreamAlias("AuthenticationToken")
	private AuthenticationToken authenticationToken;
	
	/*
	 * 淘宝订单号
	 */
	@XStreamAlias("TaoBaoOrderId")
	private long taoBaoOrderId;
	/*
	 * 外部订单号（如果已获取）
	 */
	@XStreamAlias("OrderId")
	private String orderId;
	/*
	 * 是否发货，true为已发货，false为未发货    True/false  
	 */
	@XStreamAlias("Shipped")
	private String shipped;
    public AuthenticationToken getAuthenticationToken() {
        return authenticationToken;
    }
    public void setAuthenticationToken(AuthenticationToken authenticationToken) {
        this.authenticationToken = authenticationToken;
    }
    public long getTaoBaoOrderId() {
        return taoBaoOrderId;
    }
    public void setTaoBaoOrderId(long taoBaoOrderId) {
        this.taoBaoOrderId = taoBaoOrderId;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getShipped() {
        return shipped;
    }
    public void setShipped(String shipped) {
        this.shipped = shipped;
    }
	
}
  
