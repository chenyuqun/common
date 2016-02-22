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
 * Function: 价格类型. <br/>  
 * Date:     2016年2月3日 下午4:29:58 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public enum BalanceType implements IEnum{
    /**
     * 现付
     */
    FG(1),
    /**
     * 预付
     */
    PP(2),
    /**
     * 打包
     */
    PKG(3),
    ;
    private int value;

    private BalanceType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static BalanceType findByValue(int value) {
        if (value == 1) {
            return FG;
        } else if (value == 2) {
            return PP;
        }else if (value == 3) {
            return PKG;
        }  else {
            return null;
        }

    }

}
  
