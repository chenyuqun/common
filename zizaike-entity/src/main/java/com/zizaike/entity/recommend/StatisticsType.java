package com.zizaike.entity.recommend;

import com.zizaike.core.framework.ienum.IEnum;

/**
 * 
 * ClassName: RecommendType <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 统计类型 <br/>
 * date: 2015年11月4日 下午8:10:58 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public enum StatisticsType implements IEnum{
    /**
     * 累计
     */
    FOREVER(0),
    /**
     * 每天
     */
    ERVERY_DAY(1),
    ;
    private int value;

    private StatisticsType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static StatisticsType findByValue(int value) {
        if (value == 0) {
            return FOREVER;
        } else if (value == 1) {
            return ERVERY_DAY;
        }  else {
            return null;
        }

    }

}
