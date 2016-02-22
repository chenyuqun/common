/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:RateInventoryPriceMap.java  <br/>
 * Package Name:com.zizaike.entity.open.alibaba  <br/>
 * Date:2016年1月27日下午4:22:15  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.alibaba;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName:RateInventoryPriceMap <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年1月27日 下午4:22:15 <br/>
 * 
 * @author alex
 * @version
 * @since JDK 1.7
 * @see
 */
public class Rates implements Serializable{
    private static final long serialVersionUID = -4170538856089366965L;
    Action action;
    private List<RateInventoryPrice> rateInventoryPriceMap;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public List<RateInventoryPrice> getRateInventoryPriceMap() {
        return rateInventoryPriceMap;
    }

    public void setRateInventoryPriceMap(List<RateInventoryPrice> rateInventoryPriceMap) {
        this.rateInventoryPriceMap = rateInventoryPriceMap;
    }

    public Rates() {

    }

    @Override
    public String toString() {
        return "Rates [action=" + action + ", rateInventoryPriceMap=" + rateInventoryPriceMap + "]";
    }

   


    
}
