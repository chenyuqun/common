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
public enum GetMappingInfoType implements IEnum{
    /**
     * 现付
     */
    UnMapping(1),
    /**
     * 预付
     */
    Appoint(2),
    ;
    private int value;

    private GetMappingInfoType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static GetMappingInfoType findByValue(int value) {
        if (value == 1) {
            return UnMapping;
        } else if (value == 2) {
            return Appoint;
        } else {
            return null;
        }

    }

}
  
