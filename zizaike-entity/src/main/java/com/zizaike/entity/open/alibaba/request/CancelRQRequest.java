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
import com.zizaike.entity.open.RequestData;

/**  
 * ClassName:BookRQ <br/>  
 * Function: 酒店取消订单请求. <br/>  
 * Date:     2016年1月14日 下午3:56:38 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("CancelRQ")
public class CancelRQRequest extends RequestData {
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
	 * OTA酒店code，即第三方系统中的酒店code
	 */
	@XStreamAlias("HotelId")
	private String hotelId;
	/*
	 * 取消订单原因
	 */
	@XStreamAlias("Reason")
	private String reason;
	/*
	 * 是否强制取消订单默认false
	 */
	@XStreamAlias("HardCancel")
	private String hardCancel;
	
	@XStreamAlias("CancelId")
	private String cancelId;
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
    @Override
    public String toString() {
        return "CancelRQRequest [authenticationToken=" + authenticationToken + ", taoBaoOrderId=" + taoBaoOrderId
                + ", orderId=" + orderId + ", hotelId=" + hotelId + ", reason=" + reason + ", hardCancel=" + hardCancel
                + ", cancelId=" + cancelId + "]";
    }
	
	
}
  
