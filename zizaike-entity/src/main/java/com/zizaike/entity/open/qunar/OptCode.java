/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:OptCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午3:35:50  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:OptCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午3:35:50  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar;  

import com.zizaike.core.framework.ienum.IEnum;

/**  
 * ClassName:OptCode <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月6日 下午3:35:50 <br/>  
 * @author   lin  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public enum OptCode implements IEnum{
    /*
     * 确认有房
     */
    CONFIRM_ROOM_SUCCESS(1),
    /*
     * 确认无房
     */
    CONFIRM_ROOM_FAILURE(2),
    /*
     * 安排房间
     */
    ARRANGE_ROOM(3),
    /*
     * 添加备注
     */
    ADD_REMARKS(4),
    /*
     * 申请退款
     */
    APPLY_UNSUBSCRIBE(5),
    /*
     * 发送短信
     */
    SEND_SMS(6),
    /*
     * 同意退款
     */
    AGREE_UNSUBSCRIBE(7),
    /*
     * 拒绝退款
     */
    REFUSE_UNSUBSCRIBE(8),
    ;
    private int value;
    private OptCode(int value){
        this.value = value;
    }

    @Override
    public int getValue() { 
        return this.value;
    }
    public OptCode findByValue(int value){
        if(value == 1)
            return CONFIRM_ROOM_SUCCESS;
        else if(value == 2)
            return CONFIRM_ROOM_FAILURE;
        else if(value == 3)
            return ARRANGE_ROOM;
        else if(value == 4)
            return ADD_REMARKS;
        else if(value == 5)
            return APPLY_UNSUBSCRIBE;
        else if(value == 6)
            return SEND_SMS;
        else if(value == 7)
            return AGREE_UNSUBSCRIBE;
        else if(value == 8)
            return REFUSE_UNSUBSCRIBE;
        else return null;
    }
}
  
