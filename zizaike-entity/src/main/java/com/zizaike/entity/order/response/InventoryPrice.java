/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:InventoryPrice.java  <br/>
 * Package Name:com.zizaike.entity.order.response  <br/>
 * Date:2016年2月19日下午1:42:15  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.order.response;  

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**  
 * ClassName:InventoryPrice <br/>  
 * Function: 价格日历. <br/>  
 * Date:     2016年2月19日 下午1:42:15 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class InventoryPrice implements Serializable{
    
    private static final long serialVersionUID = -2763486167812492564L;
    /**
     * 日期()
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date date;
    /**
     * 价格(分)
     */
    private Integer price;
    /**
     * 库存
     */
    private Integer quota;
    
    /**
     * 最大入住人数
     */
    private Integer maxPerson;
    /**
     * 是否有早
     */
    private Boolean breakFast;
    
    
    public Integer getMaxPerson() {
        return maxPerson;
    }
    public void setMaxPerson(Integer maxPerson) {
        this.maxPerson = maxPerson;
    }
    public Boolean getBreakFast() {
        return breakFast;
    }
    public void setBreakFast(Boolean breakFast) {
        this.breakFast = breakFast;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getQuota() {
        return quota;
    }
    public void setQuota(Integer quota) {
        this.quota = quota;
    }
    @Override
    public String toString() {
        return "InventoryPrice [date=" + date + ", price=" + price + ", quota=" + quota + ", maxPerson=" + maxPerson
                + ", breakFast=" + breakFast + "]";
    }
    
    
}
  
