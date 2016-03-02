/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SetType.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年2月3日下午4:29:58  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.ctrip;

import com.zizaike.core.framework.ienum.IEnum;

/**
 * ClassName:BalanceType <br/>
 * Function: 价格类型. <br/>
 * Date: 2016年2月3日 下午4:29:58 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public enum SetType implements IEnum {
    /**
     * -4 代表删除酒店
     */
    DELETE_HOTEL(-4),
    /**
     * -3 代表删除酒店和房型 Mapping 关系
     */
    DELETE_HOTEL_ROOMTYPE_MAPPING(-3),
    /**
     * -2 代表删除房型 Mapping 关系的同时删除 房价
     */
    DELETE_ROOMTYPE_MAPPING_PRICE(-2),
    /**
     * -1 代表房型删除 Mapping 关系
     */
    DELETE_ROOMTYPE_MAPPING(-1),
    /**
     * 修改
     */
    MODIFY(0),
    /**
     * 新增
     */
    ADD(1), ;
    private int value;

    private SetType(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static SetType findByValue(int value) {
        if (value == -4) {
            return DELETE_HOTEL;
        } else if (value == -3) {
            return DELETE_HOTEL_ROOMTYPE_MAPPING;
        } else if (value == -2) {
            return DELETE_ROOMTYPE_MAPPING_PRICE;
        } else if (value == -1) {
            return DELETE_ROOMTYPE_MAPPING;
        } else if (value == 0) {
            return MODIFY;
        } else if (value == 1) {
            return ADD;
        } else {
            return null;
        }

    }

}
