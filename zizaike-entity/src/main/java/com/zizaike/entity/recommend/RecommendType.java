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
public enum RecommendType implements IEnum{
    /**
     * 商圈
     */
    BUSINES_CIRCLE(1),
    /**
     * 景点
     */
    SCENIC_SPOTS(2),
    /**
     * 捷运
     */
    SPORTVAN(3),
    /**
     * 乡/镇/区
     */
    REGION(4),
    /**
     * 市
     */
    CITY(5),
    /**
     * 省
     */
    STATE(6),

    ;
    private int value;

    private RecommendType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static RecommendType findByValue(int value) {
        if (value == 1) {
            return BUSINES_CIRCLE;
        } else if (value == 2) {
            return SCENIC_SPOTS;
        } else if (value == 3) {
            return SPORTVAN;
        } else if (value == 4) {
            return REGION;
        } else if (value == 5) {
            return CITY;
        } else if (value == 6) {
            return STATE;
        } else {
            return null;
        }

    }

}
