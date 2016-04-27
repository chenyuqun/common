/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SearchType.java  <br/>
 * Package Name:com.zizaike.entity.solr  <br/>
 * Date:2015年11月23日上午11:48:58  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.solr;


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
public enum BNBServiceType  {
    /**
     * 户外服务
     */
    OUTDOORS("huwai"),
    /**
     * 餐饮美食
     */
    FOOD("zaocan"),
    /**
     * 代订服务
     */
    BOOKING("daiding"),
    /**
     * 接送服务
     */
    TRANSFER("jiesong"),
    /**
     * 包车服务
     */
    BUS_SERVICE("baoche"),
    /**
     * 其他服务
     */
    OTHER("other"), ;
    private String value;

    private BNBServiceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }


    public static String findSolrServiceName(BNBServiceType bnbServiceType) {
        if (bnbServiceType == OUTDOORS) {
            return "huwai";
        } else if (bnbServiceType == FOOD) {
            return "zaocan";
        } else if (bnbServiceType == BOOKING) {
            return "daiding";
        } else if (bnbServiceType == TRANSFER) {
            return "jiesong";
        } else if (bnbServiceType == BUS_SERVICE) {
            return "baoche";
        } else if (bnbServiceType == OTHER) {
            return "other";
        } else {
            return null;
        }
    }

    public static BNBServiceType findByValue(String value) {
        BNBServiceType type = null;
        switch (value) {
        case "huwai":
            type = BNBServiceType.OUTDOORS;
            break;
        case "zaocan":
            type = BNBServiceType.FOOD;
            break;
        case "daiding":
            type = BNBServiceType.BOOKING;
            break;
        case "jiesong":
            type = BNBServiceType.TRANSFER;
            break;
        case "baoche":
            type = BNBServiceType.BUS_SERVICE;
            break;
        case "other":
            type = BNBServiceType.OTHER;
            break;
        default:
            break;
        }
        return type;

    }
}
