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
 * Function: 获取信息类型. <br/>  
 * Date:     2016年2月3日 下午4:29:58 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public enum MappingType implements IEnum{
    /**
     * 自mapping
     */
    SELF_MAPPING(0),
    /**
     * 相互mapping
     */
    MUTUAL_MAPPING(1),
    ;
    private int value;

    private MappingType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static MappingType findByValue(int value) {
        if (value == 0) {
            return SELF_MAPPING;
        } else if (value == 1) {
            return MUTUAL_MAPPING;
        } else {
            return null;
        }

    }

}
  
