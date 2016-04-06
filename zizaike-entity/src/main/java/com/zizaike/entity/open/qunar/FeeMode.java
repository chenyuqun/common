/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:FeeMode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午2:36:28  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:FeeMode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午2:36:28  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */

package com.zizaike.entity.open.qunar;

import com.zizaike.core.framework.ienum.IEnum;

/**
 * ClassName:FeeMode <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年4月6日 下午2:36:28 <br/>
 * 
 * @author lin
 * @version
 * @since JDK 1.7
 * @see
 */

public enum FeeMode implements IEnum {
    /**
     * 免费
     */
    FREE(1),
    /**
     * 收费
     */
    CHARGE(2),
    /**
     * 无
     */
    NONE(3),
    /**
     * 未知
     */
    UNKNOWN(4),
    /**
     * 部分收费
     */
    PART_CHARGE(5),
    /**
     * 部分支持且免费
     */
    PART_SUPPORT_AND_FREE(6),
    /**
     * 部分支持且收费
     */
    PART_SUPPORT_AND_CHARGE(7),
    /**
     * 部分支持且部分收费
     */
    PART_SUPPORT_ADN_PART_CHARGE(8),

    ;
    private int value;

    private FeeMode(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static FeeMode findByValue(int value) {
        if (value == 1) {
            return FREE;
        } else if (value == 2) {
            return CHARGE;
        } else if (value == 3) {
            return NONE;
        } else if (value == 4) {
            return UNKNOWN;
        } else if (value == 5) {
            return PART_CHARGE;
        } else if (value == 6) {
            return PART_SUPPORT_AND_FREE;
        } else if (value == 7) {
            return PART_SUPPORT_AND_CHARGE;
        } else if (value == 8) {
            return FeeMode.PART_SUPPORT_ADN_PART_CHARGE;
        } else {
            return null;
        }
    }
}
