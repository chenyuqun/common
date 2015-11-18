/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:AssociateType.java  <br/>
 * Package Name:com.zizaike.entity.solr.dto  <br/>
 * Date:2015年11月11日下午6:35:10  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
 
package com.zizaike.entity.solr.dto;  

import com.zizaike.core.framework.ienum.IEnum;
import com.zizaike.entity.recommend.RecommendType;

/**  
 * ClassName: AssociateType <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2015年11月11日 下午6:35:10 <br/>  
 *  
 * @author alex  
 * @version   
 * @since JDK 1.7  
 */
public enum AssociateType implements IEnum{
    /**
     * 
     */
    CITY(1),
    /**
     * 商圈
     */
    BUSINESS_AREA(2),
    /**
     * 景点
     */
    SCENIC_SPOTS(3),
    
    /**
     * 乡/镇/区
     */
    HOMESTAY_NAME(4),
    /**
     * 市
     */
    HOMESTAY_ADDRESS(5),

    ;
    private int value;

    private AssociateType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static AssociateType findByValue(int value) {
        if (value == 1) {
            return CITY;
        } else if (value == 2) {
            return BUSINESS_AREA;
        } else if (value == 3) {
            return SCENIC_SPOTS;
        } else if (value == 4) {
            return HOMESTAY_NAME;
        } else if (value == 5) {
            return HOMESTAY_ADDRESS;
        } else {
            return null;
        }

    }
}
  
