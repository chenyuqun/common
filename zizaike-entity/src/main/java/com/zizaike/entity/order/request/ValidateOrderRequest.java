/**  
 * Project Name:open-api  <br/>
 * File Name:ValidateRQ.java  <br/>
 * Package Name:com.zizaike.open.entity  <br/>
 * Date:2016年1月13日下午4:22:57  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.order.request;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:ValidateRQ <br/>
 * Function: 验证价格库存接口. <br/>
 * Date: 2016年1月13日 下午4:22:57 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public class ValidateOrderRequest implements Serializable{
    private static final long serialVersionUID = -2692679234276166363L;
    /**
     * open酒店id
     */
    private String openHotelId;
    /**
     * OTA酒店id，即第三方系统中的酒店id
     */
    private String hotelId;
    /**
     * open房型id
     */
    private Long openRoomTypeId;
    /**
     * OTA房型id，即第三方系统中的房型id
     */
    private String roomTypeId;
    /**
     * open价格计划id
     */
    private Long openRatePlanId;
    /**
     * OTA价格计划id，即第三方系统中的价格计划id
     */
    private String ratePlanCode;
    /**
     * open酒店商品id
     */
    private String openGid;
    /**
     * 入住时间
     */
    private Date checkIn;
    /**
     * 离店日期
     */
    private Date checkOut;
    /**
     * 房间数量（最大为9）
     */
    private Integer roomNum;
    /**
     * 支付方式1预付5面付6信用住
     */
    private Integer paymentType;
    /**
     * 扩展字段json，用于处理特殊OTA个性需求添加的扩展字段 {"key":"value"}
     */
    private String extensions;
    public String getOpenHotelId() {
        return openHotelId;
    }
    public void setOpenHotelId(String openHotelId) {
        this.openHotelId = openHotelId;
    }
    public String getHotelId() {
        return hotelId;
    }
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }
    public Long getOpenRoomTypeId() {
        return openRoomTypeId;
    }
    public void setOpenRoomTypeId(Long openRoomTypeId) {
        this.openRoomTypeId = openRoomTypeId;
    }
    public String getRoomTypeId() {
        return roomTypeId;
    }
    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }
    public Long getOpenRatePlanId() {
        return openRatePlanId;
    }
    public void setOpenRatePlanId(Long openRatePlanId) {
        this.openRatePlanId = openRatePlanId;
    }
    public String getRatePlanCode() {
        return ratePlanCode;
    }
    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }
    public String getOpenGid() {
        return openGid;
    }
    public void setOpenGid(String openGid) {
        this.openGid = openGid;
    }
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
    public Integer getRoomNum() {
        return roomNum;
    }
    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }
    public Integer getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }
    public String getExtensions() {
        return extensions;
    }
    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }
    
}
