package com.zizaike.entity.order.response;

import java.util.List;

public class ValidateOrderResponse {
    /**
     * 返回值用于接入方需要下单
     */
    private String createOrderValidateKey;
    /**
     * 价格日历
     */
    private List<InventoryPrice> inventoryPrice;
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
    public List<InventoryPrice> getInventoryPrice() {
        return inventoryPrice;
    }
    public void setInventoryPrice(List<InventoryPrice> inventoryPrice) {
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
    @Override
    public String toString() {
        return "ValidateRQResponse [createOrderValidateKey=" + createOrderValidateKey + ", inventoryPrice="
                + inventoryPrice + ", guaranteeType=" + guaranteeType + ", guaranteeStartTime=" + guaranteeStartTime
                + ", cancelPolicyType=" + cancelPolicyType + ", cancelPolicyInfo=" + cancelPolicyInfo + "]";
    }
    
    
    
    
}    
    
