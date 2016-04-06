/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:OptionRuleCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午2:49:45  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:OptionRuleCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午2:49:45  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar;  

import com.zizaike.core.framework.ienum.IEnum;

/**  
 * ClassName:OptionRuleCode <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月6日 下午2:49:45 <br/>  
 * @author   lin  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public enum OptionRuleCode implements IEnum{
    /*
     * 接机服务
     */
    AIRPORT_PICKUP(1),
    /*
     * 高速无线网
     */
    HIGH_SPEED_NETWORK(2),
    /*
     * 加床
     */
    EXTRA_BED(3),
    /*
     * 加早餐
     */
    EXTRA_BREAKFAST(4),
    /*
     * 其他
     */
    OTHER(5),
    ;
    private int value;
    private OptionRuleCode(int value){
        this.value = value;
    }
    @Override()
    public int getValue() {
        return this.value;
    }
    public static OptionRuleCode findByValue(int value){
        if(value == 1){
            return AIRPORT_PICKUP;
        }else if(value == 2){
            return HIGH_SPEED_NETWORK;
        }else if(value == 3){
            return EXTRA_BED;
        }else if(value == 4){
            return EXTRA_BREAKFAST;
        }else if(value == 5){
            return OTHER;
        }else{
            return null;
        }
    }

}
  
