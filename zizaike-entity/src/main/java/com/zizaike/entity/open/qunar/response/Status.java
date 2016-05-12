package com.zizaike.entity.open.qunar.response;

import com.zizaike.core.framework.ienum.IEnum;

/**
 * Project Name: code <br/>
 * Function:Status. <br/>
 * date: 2016/4/21 16:32 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public enum Status implements IEnum{
    /**
     * 初始状态，代理商接受预定的状态
     */
    NEW_ORDER(1),
    /**
     * 确认有房，等待入住
     */
    CONFIRMED_SUCCESS(2),
    /**
     * 确认无房，预定失败
     */
    CONFIRMED_FAILURE(3),
    /**
     * 订单取消
     */
    CANCELED(4),
    /**
     * 入住
     */
    CHECKED_IN(5),
    /**
     * 离店
     */
    CHECKED_OUT(6),
    /**
     * 客人未入住
     */
    NO_SHOW(7),;
    private int value;

    private Status(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static Status findByValue(int value) {
        if (value == 1) {
            return NEW_ORDER;
        }  else if (value == 2) {
            return CONFIRMED_SUCCESS;
        }else if (value == 3) {
            return CONFIRMED_FAILURE;
        } else if (value == 4) {
            return CANCELED;
        }else if (value == 5) {
            return CHECKED_IN;
        }else if (value == 6) {
            return CHECKED_OUT;
        }else if (value == 7) {
            return NO_SHOW;
        } else {
            return null;
        }
    }
}
