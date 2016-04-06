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
  
package com.zizaike.entity.open.qunar;  

import com.zizaike.core.framework.ienum.IEnum;

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

public enum PromotionRuleCode implements IEnum{
    /*
     * 预付时，立减
     */
    INSTANT_DEDUCT(1),
    /*
     * 免费升级
     */
    FREE_UPGRADE(2),
    /*
     * 延时退房
     */
    DELAY_CHECKOUT(3),
    /*
     * 免费赠品
     */
    FREE_GIFT(4),
    /*
     * 现付，返现
     */
    CASH_BACK(5),
    /*
     * 免费接送
     */
    FREE_PICKUP(6),
    /*
     * 连住优惠
     */
    LAST(7),
    /*
     * 提前预定优惠
     */ 
    ADVANCE(8),
    
    /*
     * 其他
     */
    OTHER(9),
    ;
    private int value;
    private PromotionRuleCode(int value){
        this.value = value;
    }
    /**  
     * TODO 简单描述该方法的实现功能（可选）.  
     * @see com.zizaike.core.framework.ienum.IEnum#getValue()  
     */
    @Override
    public int getValue() {
          
        // TODO Auto-generated method stub  
        return this.value;
    }
    public static PromotionRuleCode findByValue(int value){
        if(value == 1)
            return INSTANT_DEDUCT;
        else if(value == 2)
            return FREE_UPGRADE;
        else if(value == 3)
            return DELAY_CHECKOUT;
        else if(value == 4)
            return FREE_GIFT;
        else if(value == 5)
            return CASH_BACK;
        else if(value == 6)
            return FREE_PICKUP;
        else if(value == 7)
            return LAST;
        else if(value == 8)
            return ADVANCE;
        else if(value == 9)
            return OTHER;
        else return null;
    }
}
  
