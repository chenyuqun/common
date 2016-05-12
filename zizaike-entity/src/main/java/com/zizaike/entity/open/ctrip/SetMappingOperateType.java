/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:BalanceType.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年2月3日下午4:29:58  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip;  

import com.zizaike.core.framework.ienum.IEnum;

/**  
 * ClassName:BalanceType <br/>  
 * Function: 操作类型类型. <br/>  
 * Date:     2016年2月3日 下午4:29:58 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public enum   SetMappingOperateType implements IEnum{
    /**
     * 增加一个的
     */
    REQUEST_A_NEW_CTRIP_HOTEL (1),
    /**
     * 删除关联
     */
    UN_MAPPING_ROOM_ID_DO_NOT_DELETE_PRICE(2),
    /**
     * 关联已经存在的子房型
     */
    MAP_EXISTING_HOTEL_AND_ROOM_ID (3),
    /**
     * 删除关联价格
     */
    UN_MAPPING_ROOM_ID_DELETE_PRICE(4),
    ;
    private int value;

    private SetMappingOperateType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static SetMappingOperateType findByValue(int value) {
        if (value == 1) {
            return REQUEST_A_NEW_CTRIP_HOTEL;
        } else if (value == 2) {
            return UN_MAPPING_ROOM_ID_DO_NOT_DELETE_PRICE;
        }else if (value == 3) {
            return MAP_EXISTING_HOTEL_AND_ROOM_ID;
        }  else if (value == 4) {
            return UN_MAPPING_ROOM_ID_DELETE_PRICE;
        } else {
            return null;
        }

    }

}
  
