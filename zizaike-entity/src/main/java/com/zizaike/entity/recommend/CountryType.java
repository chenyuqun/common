package com.zizaike.entity.recommend;

import com.zizaike.core.framework.ienum.IEnum;

/**
 * 
 * ClassName: RecommendType <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 推荐类型 <br/>
 * date: 2015年11月4日 下午8:10:58 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public enum CountryType implements IEnum{
    /**
     * 台湾
     */
    TWD(10),
    /**
     * 台湾
     */
    JPY(11),
    /**
     * 大陆
     */
    CNY(12),
    /**
     * 美国
     */
    USD(13),
    /**
     * 香港
     */
    HKD(14),
    /**
     * 韩国
     */
    KRW(15),

    ;
    private int value;

    private CountryType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static CountryType findByValue(int value) {
        if (value == 10) {
            return TWD;
        } else if (value == 11) {
            return JPY;
        } else if (value == 12) {
            return CNY;
        } else if (value == 13) {
            return USD;
        } else if (value == 14) {
            return HKD;
        } else if (value == 15) {
            return KRW;
        } else {
            return null;
        }

    }

}
