package com.zizaike.entity.open;

import com.zizaike.core.framework.ienum.IEnum;

/**
 * 
 * ClassName: ChannelType <br/>  
 * Function: open来源 . <br/>  
 * date: 2016年2月22日 上午11:04:42 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public enum OpenChannelType implements IEnum{
    /**
     * ctrip
     */
    CTRIP(0),
    /**
     * alitrip
     */
    ALITRIP(1),
    /**
     * qunar
     */
    QUNAR(2)
    ;
    private int value;

    private OpenChannelType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static OpenChannelType findByValue(int value) {
        if (value == 0) {
            return CTRIP;
        } else if (value == 1) {
            return ALITRIP;
        }  else {
            return null;
        }

    }

}
