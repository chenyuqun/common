/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:BookOrderRequest.java  <br/>
 * Package Name:com.zizaike.entity.order.request  <br/>
 * Date:2016年2月20日上午11:30:29  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.order.request;  

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.zizaike.entity.open.OpenChannelType;
import com.zizaike.entity.open.alibaba.request.BookRQRequest.DailyInfos;
import com.zizaike.entity.open.alibaba.request.BookRQRequest.ReceiptInfo;


/**  
 * ClassName:BookOrderRequest <br/>  
 * Function: 预定接口 <br/>  
 * Date:     2016年2月20日 上午11:30:29 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class BookOrderRequest implements Serializable{
    private static final long serialVersionUID = 3314171808492661434L;
    /**
     * 来源
     */
    private OpenChannelType openChannelType;
    
    private String openOrderId;
    /*
     * 淘宝酒店id
     */
    private String openHotelId;
    /*
     * OTA酒店id，即第三方系统中的酒店id
     */
    private String hotelId;
    /*
     * 淘宝房型id
     */
    private String openRoomTypeId;
    /*
     * OTA房型id，即第三方系统中的房型id
     */
    private String roomTypeId;
    /**
     * 淘宝价格计划id
     */
    private long openRatePlanId;
    /**
     * OTA价格计划id，即第三方系统中的价格计划id
     */
    private String ratePlanCode;
    /**
     * 淘宝酒店商品id
     */
    private long openGid;
    /**
     * 入住时间
     */
    private Date checkIn;
    /**
     * 离店时间
     */
    private Date checkOut;
    /**
     * 小时房（时间取Checkin/Checkout对应的具体时间）默认：false
     */
    private String hourRent;
    /*
     * 最早到店时间
     */
    private Date earliestArriveTime;
    /*
     * 最晚到店时间
     */
    private Date latestArriveTime;
    /*
     * 房间数量（最大为9）
     */
    private int roomNum;
    /*
     * 订单总价（分）
     */
    private long totalPrice;
    /*
     * 卖家优惠金额（卖家红包等），总价（分）
     */
    private long sellerDiscount;
    /*
     * 去啊平台提供的优惠金额，总价（分）
     */
    private long openDiscount;
    /*
     * 货币类型（现在只支持一种）
     */
    private String currency;
    /*
     * 支付方式1预付、5面付、6后付（现在只有1、5、6）
     */
    private int paymentType;
    /*
     * 联系人姓名
     */
    private String contactName;
    /*
     * 联系人电话
     */
    private String contactTel;
    /*
     * 联系人邮箱
     */
    private String contactEmail;
    /*
     * 每日价格
     */
    private List<DailyInfo> dailyInfos;
    /*
     * 入住人信息
     */
    private List<OrderGuest> orderGuests;
    /*
     * 备注、特殊需求
     */
    private String comment;
    /*
     * OTA会员卡卡号
     */
    private String memberCardNo;
    /**
     * 担保类型
     */
    private String guaranteeType;
    /**
     * 发票信息
     */
    private ReceiptInfo receiptInfo;
    /**
     * 扩展字段json，用于处理特殊OTA个性需求添加的扩展字段 {"key":"value"}
     */
    private String extensions;
    /**
     * 支付宝交易号
     */
    private String openTradeNo;
    public String getHotelId() {
        return hotelId;
    }
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }
    public String getOpenRoomTypeId() {
        return openRoomTypeId;
    }
    public void setOpenRoomTypeId(String openRoomTypeId) {
        this.openRoomTypeId = openRoomTypeId;
    }
    public String getRoomTypeId() {
        return roomTypeId;
    }
    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }
    public long getOpenRatePlanId() {
        return openRatePlanId;
    }
    public void setOpenRatePlanId(long openRatePlanId) {
        this.openRatePlanId = openRatePlanId;
    }
    public String getRatePlanCode() {
        return ratePlanCode;
    }
    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }
    public long getOpenGid() {
        return openGid;
    }
    public void setOpenGid(long openGid) {
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
    public String getHourRent() {
        return hourRent;
    }
    public void setHourRent(String hourRent) {
        this.hourRent = hourRent;
    }
    public Date getEarliestArriveTime() {
        return earliestArriveTime;
    }
    public void setEarliestArriveTime(Date earliestArriveTime) {
        this.earliestArriveTime = earliestArriveTime;
    }
    public Date getLatestArriveTime() {
        return latestArriveTime;
    }
    public void setLatestArriveTime(Date latestArriveTime) {
        this.latestArriveTime = latestArriveTime;
    }
    public int getRoomNum() {
        return roomNum;
    }
    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
    public long getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }
    public long getSellerDiscount() {
        return sellerDiscount;
    }
    public void setSellerDiscount(long sellerDiscount) {
        this.sellerDiscount = sellerDiscount;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public int getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getContactTel() {
        return contactTel;
    }
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    
    public List<DailyInfo> getDailyInfos() {
        return dailyInfos;
    }
    public void setDailyInfos(List<DailyInfo> dailyInfos) {
        this.dailyInfos = dailyInfos;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getMemberCardNo() {
        return memberCardNo;
    }
    public void setMemberCardNo(String memberCardNo) {
        this.memberCardNo = memberCardNo;
    }
    public String getGuaranteeType() {
        return guaranteeType;
    }
    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }
    public ReceiptInfo getReceiptInfo() {
        return receiptInfo;
    }
    public void setReceiptInfo(ReceiptInfo receiptInfo) {
        this.receiptInfo = receiptInfo;
    }
    public String getExtensions() {
        return extensions;
    }
    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }
    public OpenChannelType getOpenChannelType() {
        return openChannelType;
    }
    public void setOpenChannelType(OpenChannelType openChannelType) {
        this.openChannelType = openChannelType;
    }
    public String getOpenOrderId() {
        return openOrderId;
    }
    public void setOpenOrderId(String openOrderId) {
        this.openOrderId = openOrderId;
    }
    public String getOpenHotelId() {
        return openHotelId;
    }
    public void setOpenHotelId(String openHotelId) {
        this.openHotelId = openHotelId;
    }
    public long getOpenDiscount() {
        return openDiscount;
    }
    public void setOpenDiscount(long openDiscount) {
        this.openDiscount = openDiscount;
    }
    public String getOpenTradeNo() {
        return openTradeNo;
    }
    public void setOpenTradeNo(String openTradeNo) {
        this.openTradeNo = openTradeNo;
    }
    public List<OrderGuest> getOrderGuests() {
        return orderGuests;
    }
    public void setOrderGuests(List<OrderGuest> orderGuests) {
        this.orderGuests = orderGuests;
    }
    


}
  
