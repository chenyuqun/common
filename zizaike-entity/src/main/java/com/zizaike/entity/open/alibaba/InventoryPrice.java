/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:InventoryPrice.java  <br/>
 * Package Name:com.zizaike.entity.open.alibaba  <br/>
 * Date:2016年1月22日下午4:12:29  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba;  

import java.io.Serializable;

/**  
 * ClassName:InventoryPrice <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年1月22日 下午4:12:29 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class InventoryPrice implements Serializable{
    
    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = 7326907481364695870L;
    /**
     * use_room_inventory:是否使用房型共享库存，可选值 true false 1、true时：使用房型共享库存 2、false时：使用房价专有库存，此时要求房价专有库存必填。
     */
    private Boolean useRoomInventory;
    /**
     * date yyyy-MM-dd
     */
    private String date;
    /**
     * 库存
     */
    private int quota;
    /**
     * price 价格 int类型 取值范围1-99999999 单位为分D:quota 房价专有库存 int 类型 取值范围 0-999（数量库存） 60000(状态库存关) 61000(状态库存开) 
     */
    private int price;
    /**
     * status 价格开关，0为关，1为开
     */
    private Integer status;
    public Boolean getUseRoomInventory() {
        return useRoomInventory;
    }
    public void setUseRoomInventory(Boolean useRoomInventory) {
        this.useRoomInventory = useRoomInventory;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getQuota() {
        return quota;
    }
    public void setQuota(int quota) {
        this.quota = quota;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    
}
  
