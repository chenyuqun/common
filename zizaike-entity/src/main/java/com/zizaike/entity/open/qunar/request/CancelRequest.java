/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:CancelRequest.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.request  <br/>
 * Date:2016年4月18日上午11:32:36  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:CancelRequest.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.request  <br/>
 * Date:2016年4月18日上午11:32:36  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.request;  

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.request.RequestData;
import com.zizaike.entity.open.qunar.response.Extra;

/**  
 * ClassName: CancelRequest <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2016年4月18日 上午11:32:36 <br/>  
 *  
 * @author lin  
 * @version   
 * @since JDK 1.7  
 */
@XStreamAlias("cancelRequest")
public class CancelRequest extends RequestData{
    @XStreamAlias("qunarOrderNum")
    private String qunarOrderNum;
    
    @XStreamAlias("orderId")
    private String orderId;
    
    @XStreamAlias("requiredAction")
    private String requiredAction;
    
    @XStreamAlias("reason")
    private String reason;
    
    private List<Extra> extras;

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

    public String getRequiredAction() {
        return requiredAction;
    }

    public void setRequiredAction(String requiredAction) {
        this.requiredAction = requiredAction;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "CancelRequest [qunarOrderNum=" + qunarOrderNum + ", orderId=" + orderId + ", requiredAction="
                + requiredAction + ", reason=" + reason + ", extras=" + extras + "]";
    }
    
}
  
