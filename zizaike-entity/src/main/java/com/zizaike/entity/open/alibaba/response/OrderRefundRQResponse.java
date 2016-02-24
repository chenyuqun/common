
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
 * ClassName:OrderRefundRQResponse <br/>  
 * Function: 预定返回. <br/>  
 * Date:     2016年1月15日 下午2:07:02 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("Result")
public class OrderRefundRQResponse extends ResponseData{
    @XStreamAlias("Message")
    private String message;
    @XStreamAlias("ResultCode")
    private String resultCode;
    public OrderRefundRQResponse() {
       this.resultCode="0";
       this.message="";
    }
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
    @Override
    public String toString() {
        return "OrderRefundRQResponse [message=" + message + ", resultCode=" + resultCode + "]";
    }
    
    
}
  
