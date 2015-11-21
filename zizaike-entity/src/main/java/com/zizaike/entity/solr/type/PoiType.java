package com.zizaike.entity.solr.type;

import com.zizaike.core.framework.ienum.IEnum;

public enum PoiType implements IEnum{
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
    ;
    private int value;

    private PoiType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static PoiType findByValue(int value) {
        if (value == 1) {
            return BUSINES_CIRCLE;
        } else if (value == 2) {
            return SCENIC_SPOTS;
        } else if (value == 3) {
            return SPORTVAN;
        } else {
            return null;
        }

    }

}
