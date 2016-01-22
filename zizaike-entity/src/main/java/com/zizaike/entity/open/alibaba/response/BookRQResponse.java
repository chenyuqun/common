/**  
 * Project Name:open-api  <br/>
 * File Name:BooRQResponse.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.response  <br/>
 * Date:2016年1月15日下午2:07:02  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba.response;  

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**  
 * ClassName:BooRQResponse <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年1月15日 下午2:07:02 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("Result")
public class BookRQResponse extends ResponseData{
    @XStreamAlias("OrderId")
    private String orderId;
    @XStreamAlias("PmsResID")
    private String pmsResID;
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
    public String getPmsResID() {
        return pmsResID;
    }
    public void setPmsResID(String pmsResID) {
        this.pmsResID = pmsResID;
    }
    public BookRQResponse() {
    }
    @Override
    public String toString() {
        return "BooRQResponse [orderId=" + orderId + ", pmsResID=" + pmsResID + "]";
    }
    
    
}
  
