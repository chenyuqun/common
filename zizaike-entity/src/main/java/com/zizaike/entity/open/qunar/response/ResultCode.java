/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:Result.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.response  <br/>
 * Date:2016年4月8日下午12:40:06  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:Result.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.response  <br/>
 * Date:2016年4月8日下午12:40:06  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.response;  
/**  
 * ClassName: ResultCode <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2016年4月8日 下午12:40:06 <br/>  
 *  
 * @author lin  
 * @version   
 * @since JDK 1.7  
 */
public enum ResultCode {
    /**
     * FALUSE
     */
    FAILURE(0),
    /**
     * SUCCESS
     */
    SUCCESS(1),

    ;
    private int value;
    private ResultCode(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public static ResultCode getByValue(int value){
        if(value == 0)
            return FAILURE;
        else if(value == 1)
            return SUCCESS;
        else return null;
    }
}
  
