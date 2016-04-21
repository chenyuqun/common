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

/**
 * 
 * ClassName: ServiceType <br/>
 * Function: 民宿服务类型（bed & breakfast service）. <br/>
 * date: 2016年4月20日 下午1:42:17 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public enum BNBServiceType implements IEnum {
    /**
     * 户外服务
     */
    OUTDOORS(1),
    /**
     * 餐饮美食
     */
    FOOD(2),
    /**
     * 代订服务
     */
    BOOKING(3),
    /**
     * 接送服务
     */
    TRANSFER(4),
    /**
     * 包车服务
     */
    BUS_SERVICE(5),
    /**
     * 其他服务
     */
    OTHER(6), ;
    private int value;

    private BNBServiceType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static BNBServiceType findByValue(int value) {
        if (value == 1) {
            return OUTDOORS;
        } else if (value == 2) {
            return FOOD;
        } else if (value == 3) {
            return BOOKING;
        } else if (value == 4) {
            return TRANSFER;
        } else if (value == 5) {
            return BUS_SERVICE;
        } else if (value == 6) {
            return OTHER;
        } else {
            return null;
        }

    }
}
