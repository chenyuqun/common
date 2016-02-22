/**  
 * Project Name:open-api  <br/>
 * File Name:Unit.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.response  <br/>
 * Date:2016年1月15日下午2:55:20  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.order.response;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * ClassName:Unit <br/>
 * Function: 杂费. <br/>
 * Date: 2016年1月15日 下午2:55:20 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public class PriceUnit {
    
    /**
     * 日期
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date date;
    /**
     * 金额（分）
     */
    private long price;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

}
