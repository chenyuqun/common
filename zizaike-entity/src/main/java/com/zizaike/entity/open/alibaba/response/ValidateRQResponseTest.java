/**  
 * Project Name:open-api  <br/>
 * File Name:ValidateRQResponse.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.response  <br/>
 * Date:2016年1月15日上午10:51:05  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba.response;  

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;

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
@XmlRootElement(name="Result")
public class ValidateRQResponseTest extends ResponseData{
  
    private String createOrderValidateKey;
    private String inventoryPrice;
    private String guaranteeType;
    private String guaranteeStartTime;
    private String cancelPolicyType;
    
    private String cancelPolicyInfo;
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
    @XmlElement(name="CancelPolicyInfo")
    public String getCancelPolicyInfo() {
        return cancelPolicyInfo;
    }
    public void setCancelPolicyInfo(String cancelPolicyInfo) {
        this.cancelPolicyInfo = cancelPolicyInfo;
    }
   
    public ValidateRQResponseTest() {


    }
    
    public ValidateRQResponseTest(String message, String resultCode, String createOrderValidateKey, String inventoryPrice,
            String guaranteeType, String guaranteeStartTime, String cancelPolicyType, String cancelPolicyInfo) {
        super(message, resultCode);
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
  
