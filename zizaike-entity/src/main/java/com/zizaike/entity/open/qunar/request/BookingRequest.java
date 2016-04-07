/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:BookingRequest.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.request  <br/>
 * Date:2016年4月7日上午10:42:19  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:BookingRequest.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.request  <br/>
 * Date:2016年4月7日上午10:42:19  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.request;  

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.zizaike.entity.open.qunar.response.Room;

/**  
 * ClassName: BookingRequest <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2016年4月7日 上午10:42:19 <br/>  
 *  
 * @author lin  
 * @version   
 * @since JDK 1.7  
 */
@XStreamAlias("BookingRequest")
public class BookingRequest {

    @XStreamAlias("hotelId")
    private Integer hotelId;

    @XStreamAlias("checkin")
    private String checkin;

    @XStreamAlias("checkout")
    private String checkout;

    @XStreamAlias("totalPrice")
    private String totalPrice;
    
    @XStreamAlias("currencyCode")
    private String currencyCode;
    
    @XStreamAlias("rmbPrice")
    private String rmbPrice;
    
    @XStreamAlias("customerArriveTime")
    private String customerArriveTime;
    
    @XStreamAlias("specialRemarks")
    private String specialRemarks;
    
    @XStreamAlias("numberOfRooms")
    private String numberOfRooms;
    
    @XStreamAlias("bedChoice")
    private String bedChoice;
    
    @XStreamAlias("instantConfirm")
    private String instantConfirm;
    
    @XStreamAlias("requiredAction")
    private String requiredAction;
    
    @XStreamAlias("rooms")
    private List<Room> room;
    
    @XStreamAlias("customerInfos")
    private List<CustomerInfo> customerinfo;
    
    @XStreamAlias("qunarOrderInfo")
    private QunarOrderInfo qunarOrderInfo;

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getRmbPrice() {
        return rmbPrice;
    }

    public void setRmbPrice(String rmbPrice) {
        this.rmbPrice = rmbPrice;
    }

    public String getCustomerArriveTime() {
        return customerArriveTime;
    }

    public void setCustomerArriveTime(String customerArriveTime) {
        this.customerArriveTime = customerArriveTime;
    }

    public String getSpecialRemarks() {
        return specialRemarks;
    }

    public void setSpecialRemarks(String specialRemarks) {
        this.specialRemarks = specialRemarks;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getBedChoice() {
        return bedChoice;
    }

    public void setBedChoice(String bedChoice) {
        this.bedChoice = bedChoice;
    }

    public String getInstantConfirm() {
        return instantConfirm;
    }

    public void setInstantConfirm(String instantConfirm) {
        this.instantConfirm = instantConfirm;
    }

    public String getRequiredAction() {
        return requiredAction;
    }

    public void setRequiredAction(String requiredAction) {
        this.requiredAction = requiredAction;
    }


    public List<Room> getRoom() {
        return room;
    }

    public void setRoom(List<Room> room) {
        this.room = room;
    }

    public List<CustomerInfo> getCustomerinfo() {
        return customerinfo;
    }

    public void setCustomerinfo(List<CustomerInfo> customerinfo) {
        this.customerinfo = customerinfo;
    }

    public QunarOrderInfo getQunarOrderInfo() {
        return qunarOrderInfo;
    }

    public void setQunarOrderInfo(QunarOrderInfo qunarOrderInfo) {
        this.qunarOrderInfo = qunarOrderInfo;
    }
}
  
