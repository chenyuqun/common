/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:PriceInfo.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年2月3日上午11:34:07  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip;  
/**  
 * ClassName:PriceInfo <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年2月3日 上午11:34:07 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class PriceInfo {
    private String applicability;
    private int breakfast;
    private String priceType;
    private String blanceType;
    private int stays;
    private int AmountBeforeTaxFee;
    private int AmountAfterTaxFee;
    private int CostAmountBeforeTaxFee;
    private int CostAmountAfterTaxFee;
    private int day;
    public String getApplicability() {
        return applicability;
    }
    public void setApplicability(String applicability) {
        this.applicability = applicability;
    }
    public int getBreakfast() {
        return breakfast;
    }
    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }
    public String getPriceType() {
        return priceType;
    }
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }
    public String getBlanceType() {
        return blanceType;
    }
    public void setBlanceType(String blanceType) {
        this.blanceType = blanceType;
    }
    public int getStays() {
        return stays;
    }
    public void setStays(int stays) {
        this.stays = stays;
    }
    public int getAmountBeforeTaxFee() {
        return AmountBeforeTaxFee;
    }
    public void setAmountBeforeTaxFee(int amountBeforeTaxFee) {
        AmountBeforeTaxFee = amountBeforeTaxFee;
    }
    public int getAmountAfterTaxFee() {
        return AmountAfterTaxFee;
    }
    public void setAmountAfterTaxFee(int amountAfterTaxFee) {
        AmountAfterTaxFee = amountAfterTaxFee;
    }
    public int getCostAmountBeforeTaxFee() {
        return CostAmountBeforeTaxFee;
    }
    public void setCostAmountBeforeTaxFee(int costAmountBeforeTaxFee) {
        CostAmountBeforeTaxFee = costAmountBeforeTaxFee;
    }
    public int getCostAmountAfterTaxFee() {
        return CostAmountAfterTaxFee;
    }
    public void setCostAmountAfterTaxFee(int costAmountAfterTaxFee) {
        CostAmountAfterTaxFee = costAmountAfterTaxFee;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public PriceInfo(String applicability, int breakfast, String priceType, String blanceType, int stays,
            int amountBeforeTaxFee, int amountAfterTaxFee, int costAmountBeforeTaxFee, int costAmountAfterTaxFee,
            int day) {
        super();
        this.applicability = applicability;
        this.breakfast = breakfast;
        this.priceType = priceType;
        this.blanceType = blanceType;
        this.stays = stays;
        AmountBeforeTaxFee = amountBeforeTaxFee;
        AmountAfterTaxFee = amountAfterTaxFee;
        CostAmountBeforeTaxFee = costAmountBeforeTaxFee;
        CostAmountAfterTaxFee = costAmountAfterTaxFee;
        this.day = day;
    }
    public PriceInfo() {
          
        
        
    }
    
    
}
  
