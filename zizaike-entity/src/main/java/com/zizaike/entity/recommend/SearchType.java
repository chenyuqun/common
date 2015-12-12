package com.zizaike.entity.recommend;

import com.zizaike.core.framework.ienum.IEnum;

/**
 * 
 * ClassName: RecommendType <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 类型<br/>
 * date: 2015年11月4日 下午8:10:58 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public enum SearchType implements IEnum{
    /**
     * 热推荐
     */
    HOT(0),
    /**
     * 无结果
     */
    RESULT_LESS(1),
    ;
    private int value;

    private SearchType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static SearchType findByValue(int value) {
        if (value == 0) {
            return HOT;
        } else if (value == 1) {
            return RESULT_LESS;
        }  else {
            return null;
        }

    }

}
