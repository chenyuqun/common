package com.zizaike.entity.base;

import com.zizaike.core.framework.ienum.IEnum;

/**
 * 
 * ClassName: RecommendType <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 来源 <br/>
 * date: 2015年11月4日 下午8:10:58 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public enum ChannelType implements IEnum{
    /**
     * app
     */
    APP(0),
    /**
     * web
     */
    WEB(1),
    ;
    private int value;

    private ChannelType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static ChannelType findByValue(int value) {
        if (value == 0) {
            return APP;
        } else if (value == 1) {
            return WEB;
        }  else {
            return null;
        }

    }

}
