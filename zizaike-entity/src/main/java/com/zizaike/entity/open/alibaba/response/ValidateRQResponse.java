/**  
 * Project Name:open-api  <br/>
 * File Name:ValidateRQResponse.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.response  <br/>
 * Date:2016年1月15日上午10:51:05  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba.response;  

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.ResponseData;

/**  
 * ClassName:ValidateRQResponse <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年1月15日 上午10:51:05 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("Result")
public class ValidateRQResponse extends ResponseData{
  
    @XStreamAlias("CreateOrderValidateKey")
    private String createOrderValidateKey;
    @XStreamAlias("InventoryPrice")
    private String inventoryPrice;
    @XStreamAlias("GuaranteeType")
    private String guaranteeType;
    @XStreamAlias("GuaranteeStartTime")
    private String guaranteeStartTime;
    @XStreamAlias("CancelPolicyType")
    private String cancelPolicyType;
    @XStreamAlias("CancelPolicyInfo")
    private String cancelPolicyInfo;
    @XStreamAlias("Message")
    private String message="成功";
    @XStreamAlias("ResultCode")
    private String resultCode="0";
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
    public String getCreateOrderValidateKey() {
        return createOrderValidateKey;
    }
    public void setCreateOrderValidateKey(String createOrderValidateKey) {
        this.createOrderValidateKey = createOrderValidateKey;
    }
    public String getInventoryPrice() {
        return inventoryPrice;
    }
    public void setInventoryPrice(String inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }
    public String getGuaranteeType() {
        return guaranteeType;
    }
    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }
    public String getGuaranteeStartTime() {
        return guaranteeStartTime;
    }
    public void setGuaranteeStartTime(String guaranteeStartTime) {
        this.guaranteeStartTime = guaranteeStartTime;
    }
    public String getCancelPolicyType() {
        return cancelPolicyType;
    }
    public void setCancelPolicyType(String cancelPolicyType) {
        this.cancelPolicyType = cancelPolicyType;
    }
    public String getCancelPolicyInfo() {
        return cancelPolicyInfo;
    }
    public void setCancelPolicyInfo(String cancelPolicyInfo) {
        this.cancelPolicyInfo = cancelPolicyInfo;
    }
   
    public ValidateRQResponse() {
    }
    public ValidateRQResponse(String message, String resultCode, String createOrderValidateKey, String inventoryPrice,
            String guaranteeType, String guaranteeStartTime, String cancelPolicyType, String cancelPolicyInfo) {
        this.createOrderValidateKey = createOrderValidateKey;
        this.inventoryPrice = inventoryPrice;
        this.guaranteeType = guaranteeType;
        this.guaranteeStartTime = guaranteeStartTime;
        this.cancelPolicyType = cancelPolicyType;
        this.cancelPolicyInfo = cancelPolicyInfo;
    }
    
    @Override
    public String toString() {
        return "ValidateRQResponse [createOrderValidateKey=" + createOrderValidateKey + ", inventoryPrice="
                + inventoryPrice + ", guaranteeType=" + guaranteeType + ", guaranteeStartTime=" + guaranteeStartTime
                + ", cancelPolicyType=" + cancelPolicyType + ", cancelPolicyInfo=" + cancelPolicyInfo + "]";
    }
    
    
    

}
  
