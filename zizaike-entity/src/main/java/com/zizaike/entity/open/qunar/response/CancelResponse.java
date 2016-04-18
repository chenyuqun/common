/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:CancelResponse.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.response  <br/>
 * Date:2016年4月18日下午12:04:37  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:CancelResponse.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.response  <br/>
 * Date:2016年4月18日下午12:04:37  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.response;  

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.response.ResponseData;

/**  
 * ClassName: CancelResponse <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2016年4月18日 下午12:04:37 <br/>  
 *  
 * @author lin  
 * @version   
 * @since JDK 1.7  
 */
@XStreamAlias("cancelResponse")
public class CancelResponse extends ResponseData{
    @XStreamAlias("qunarOrderNum")
    private String qunarOrderNum;
    @XStreamAlias("orderId")
    private String orderId;
    @XStreamAlias("result")
    private QunarResultCode result;
    @XStreamAlias("msg")
    private String msg;
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

    
}
  
