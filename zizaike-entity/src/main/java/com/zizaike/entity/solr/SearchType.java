/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SearchType.java  <br/>
 * Package Name:com.zizaike.entity.solr  <br/>
 * Date:2015年11月23日上午11:48:58  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.solr;  

import com.zizaike.core.framework.ienum.IEnum;
import com.zizaike.entity.recommend.RecommendType;

/**  
 * ClassName:SearchType <br/>  
 * Function: 传过来的search类型 <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年11月23日 上午11:48:58 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public enum SearchType implements IEnum {
    /**
     * 商圈(热推)
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
    /**
     * 商圈(关联)
     */
    BUSINESS_AREA(7),
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
        } else if (value == 7) {
            return BUSINESS_AREA;
        } else {
            return null;
        }

    }
}
  
