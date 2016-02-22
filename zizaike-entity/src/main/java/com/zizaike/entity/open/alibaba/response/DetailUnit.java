/**  
 * Project Name:open-api  <br/>
 * File Name:Unit.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.response  <br/>
 * Date:2016年1月15日下午2:55:20  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba.response;  

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**  
 * ClassName:Unit <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年1月15日 下午2:55:20 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("Unit")
public class DetailUnit {
    /**
     * 日期
     */
    @XStreamAlias("Name")
    private String name;
    /**
     * 金额（分）
     */
    @XStreamAlias("Price")
    private long price;
  
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    
}
  
