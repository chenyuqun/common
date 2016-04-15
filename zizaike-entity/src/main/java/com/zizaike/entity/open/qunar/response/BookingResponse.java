/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:BookingResponse.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.response  <br/>
 * Date:2016年4月8日上午9:56:22  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:BookingResponse.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.response  <br/>
 * Date:2016年4月8日上午9:56:22  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.response.ResponseData;

import java.util.List;

/**  
 * ClassName: BookingResponse <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2016年4月8日 上午9:56:22 <br/>  
 *  
 * @author lin  
 * @version   
 * @since JDK 1.7  
 */

@XStreamAlias("bookingResponse")
public class BookingResponse extends ResponseData{
    @XStreamAlias("qunarOrderNum")
    private String qunarOrderNum;
    
    @XStreamAlias("orderId")
    private String orderId;
    
    @XStreamAlias("result")
    private QunarResultCode result;
    
    @XStreamAlias("msg")
    private String msg;
    
    /**
     * It's optional
     */
    List<Extra> extras;

    public String getQunarOrderNum() {
        return qunarOrderNum;
    }

    public void setQunarOrderNum(String qunarOrderNum) {
        this.qunarOrderNum = qunarOrderNum;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public QunarResultCode getResult() {
        return result;
    }

    public void setResult(QunarResultCode result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }
    
}
  
