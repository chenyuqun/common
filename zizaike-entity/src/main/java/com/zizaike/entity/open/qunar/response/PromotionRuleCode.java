/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:PromotionRuleCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午3:18:29  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:PromotionRuleCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午3:18:29  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.response;

/**
 * ClassName:PromotionRuleCode <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月6日 下午3:18:29 <br/>  
 * @author   lin  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public enum PromotionRuleCode{
    INSTANT_DEDUCT("INSTANT_DEDUCT", "预付时，立减"),
    FREE_UPGRADE("FREE_UPGRADE", "每天"),
    DELAY_CHECKOUT("DELAY_CHECKOUT", "延迟退房"),
    FREE_GIFT("FREE_GIFT", "免费赠品"),
    CASH_BACK("CASH_BACK", "现付，返现"),
    FREE_PICKUP("FREE_PICKUP", "免费接送"),
    LAST("LAST", "连住优惠"),
    ADVANCE("ADVANCE", "提前预定优惠"),
    OTHERS("OTHERS", "其他");

    private final String code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    private PromotionRuleCode(String code, String description)
    {
        this.code = code;
        this.desc = description;
    }

    /**
     * @return
     * @desc 返回code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * @return
     * @desc 返回desc
     */
    public String getDesc()
    {
        return desc;
    }

    /**
     * 通过code获取desc
     * @param code
     */
    public static String getByCode(String code)
    {
        for (PromotionRuleCode promotionRuleCode : values())
        {
            if (promotionRuleCode.getCode().equals(code))
            {
                return promotionRuleCode.desc;
            }
        }
        return null;
    }
}
  
