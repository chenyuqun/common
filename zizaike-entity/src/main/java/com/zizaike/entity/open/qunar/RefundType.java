/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:RefundType.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午3:02:06  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:RefundType.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午3:02:06  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar;  

import com.zizaike.core.framework.ienum.IEnum;

/**  
 * ClassName:RefundType <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月6日 下午3:02:06 <br/>  
 * @author   lin  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public enum RefundType implements IEnum{
    /*
     * 不扣房费
     */
    NO_DEDUCTION(1),
    /*
     * 扣除房费的百分比
     */
    DEDUCT_BY_PRECENT(2),
    /*
     * 扣除固定金额
     */
    DEDUCT_BY_AMOUNT(3),
    /*
     * 扣除首晚房费
     */
    DEDUCT_FIRST_NIGHT(4),
    ;
    private int value;
    private RefundType (int value){
        this.value = value;
    }
    @Override
    public int getValue() {  
        return this.value;
    }
    public static RefundType findByValue(int value){
        if(value == 1)
            return NO_DEDUCTION;
        else if(value == 2)
            return DEDUCT_BY_PRECENT;
        else if(value == 3)
            return DEDUCT_BY_AMOUNT;
        else if(value == 4)
            return DEDUCT_FIRST_NIGHT;
        else return null;
    }

}
  
