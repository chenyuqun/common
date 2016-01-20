/**  
 * Project Name:open-api  <br/>
 * File Name:OrderInfo.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.response  <br/>
 * Date:2016年1月15日下午2:27:57  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba.response;  

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**  
 * ClassName:OrderInfo <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年1月15日 下午2:27:57 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("OrderInfo")
public class OrderInfo {
    @XStreamAlias("CheckIn")
    private Date checkIn;
    @XStreamAlias("CheckOut")
    private Date checkOut;
    @XStreamAlias("RoomQuantity")
    private int roomQuantity;
    @XStreamAlias("Hotel")
    private String hotel;
    @XStreamAlias("RoomType")
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
  
