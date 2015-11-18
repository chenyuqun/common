package com.zizaike.entity.recommend.hot;

import com.zizaike.core.framework.ienum.IEnum;

/**
 * 
 * ClassName: RecommendType <br/>
 * Function: 行政级别类型类型. <br/>
 * date: 2015年11月4日 下午8:10:58 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public enum AreaLevel implements IEnum{
    
    /**
     * 省
     */
    STATE(1),
    /**
     * 市
     */
    CITY(2),
    /**
     * 乡/镇/区
     */
    REGION(3),
    

    ;
    private int value;

    private AreaLevel(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static AreaLevel findByValue(int value) {
       if (value == 1) {
            return STATE;
        }else if (value == 2) {
            return CITY;
        }else if (value == 3) {
            return REGION;
        }else {
            return null;
        }

    }

}
