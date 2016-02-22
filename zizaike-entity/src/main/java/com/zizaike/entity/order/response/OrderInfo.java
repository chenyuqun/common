/**  
 * Project Name:open-api  <br/>
 * File Name:OrderInfo.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.response  <br/>
 * Date:2016年1月15日下午2:27:57  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.order.response;  

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * ClassName: OrderInfo <br/>  
 * Function: 订单信息. <br/>  
 * date: 2016年2月20日 下午2:03:18 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class OrderInfo implements Serializable{
    private static final long serialVersionUID = 4050943776648599272L;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date checkIn;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date checkOut;
    /**
     * 实际入住房间数量
     */
    private int roomQuantity;
    private String hotel;
    private String roomType;
    public Date getCheckIn() {
        return checkIn;
    }
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }
    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    public int getRoomQuantity() {
        return roomQuantity;
    }
    public void setRoomQuantity(int roomQuantity) {
        this.roomQuantity = roomQuantity;
    }
    public String getHotel() {
        return hotel;
    }
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    
}
  
