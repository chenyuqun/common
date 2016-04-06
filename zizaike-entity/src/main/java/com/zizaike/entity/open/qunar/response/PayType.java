package com.zizaike.entity.open.qunar.response;

import com.zizaike.core.framework.ienum.IEnum;

/**
 * Project Name: code <br/>
 * Function:PayType. <br/>
 * date: 2016/4/5 14:24 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public enum PayType implements IEnum{

    /**
     * 预付
     */
    PREPAY(1),
    /**
     * 现付
     */
    SPOTPAY(2), ;
    private int value;

    private PayType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static PayType findByValue(int value) {
        if (value == 1) {
            return PREPAY;
        }  else if (value == 2) {
            return SPOTPAY;
        } else {
            return null;
        }

    }
}
