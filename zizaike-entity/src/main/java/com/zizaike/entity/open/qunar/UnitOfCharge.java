/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:UnitOfCharge.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午3:28:51  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:UnitOfCharge.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午3:28:51  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar;  

import com.zizaike.core.framework.ienum.IEnum;

/**  
 * ClassName:UnitOfCharge <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月6日 下午3:28:51 <br/>  
 * @author   lin  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public enum UnitOfCharge implements IEnum{
    /*
     * 每次
     */
    PER_TIME(1),
    /*
     * 每天
     */
    PER_DAY(2),
    /*
     * 每份
     */
    PER_ITEM(3),
    /*
     * 每人次
     */
    PER_PERSON_TIME(4),
    /*
     * 每小时
     */
    PER_HOUR(5),
    ;
    private int value;
    private UnitOfCharge(int value){
        this.value = value;
    }
    @Override
    public int getValue() {
        return this.value;
    }
    public static UnitOfCharge findByValue(int value){
        if(value == 1)
            return PER_TIME;
        else if(value == 2)
            return PER_DAY;
        else if(value == 3)
            return PER_ITEM;
        else if(value == 4)
            return PER_PERSON_TIME;
        else if(value == 5)
            return PER_HOUR;
        else return null;
    }
}
  
