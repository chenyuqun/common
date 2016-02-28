package com.zizaike.entity.open.ctrip.request;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.zizaike.entity.open.XStreamYMDTHMSDateConverter;
import com.zizaike.entity.open.ctrip.RoomPrices;

@XStreamAlias("DomesticCancelHotelOrderRequest")
public class DomesticCancelHotelOrderRequest {
    /**
     * Ctrip酒店编号
     */
    @XStreamAlias("OrderID")
    private String orderID;
    /**
     * 上个订单号
     */
    @XStreamAlias("OldOrderID")
    private String oldOrderID;
    /**
     * 原始订单号
     */
    @XStreamAlias("Ori_OrderID")
    private String oriOrderID;
    /**
     * 订单接口发送号
     */
    @XStreamAlias("InterFaceSendID")
    private String interFaceSendID;
    /**
     * 原始订单号
     */
    @XStreamAlias("InterFaceConfirmNO")
    private String interFaceConfirmNO;
    /**
     * Ctrip酒店编号,供应商需要转成自己的对应编号
     */
    @XStreamAlias("Hotel")
    private String hotel;
    /**
     * 酒店名
     */
    @XStreamAlias("HotelName")
    private String hotelName;
    /**
     * 入住日期
     */
    @XStreamAlias("Arrival")
    @XStreamConverter(value = XStreamYMDTHMSDateConverter.class)
    private Date arrival;
    /**
     * 离店日期
     */
    @XStreamAlias("Departure")
    @XStreamConverter(value = XStreamYMDTHMSDateConverter.class)
    private Date departure;
    /**
     * 入住人数
     */
    @XStreamAlias("Person")
    private Integer person;
    /**
     * 备注
     */
    @XStreamAlias("Notice")
    private String notice;
    /**
     * 
     */
    @XStreamAlias("ClientName")
    private String clientName;
    /**
     * Ctrip房型编号
     */
    @XStreamAlias("Room")
    private String room;
    /**
     * 房型名称
     */
    @XStreamAlias("RoomName")
    private String roomName;

    /**
     * 预订间数
     */
    @XStreamAlias("Quantity")
    private String quantity;

    @XStreamAlias("RoomPrices")
    private RoomPrices roomPrices;
    @XStreamAlias("GuaranteeType")
    private String guaranteeType;
    public String getOrderID() {
        return orderID;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getOldOrderID() {
        return oldOrderID;
    }
    public void setOldOrderID(String oldOrderID) {
        this.oldOrderID = oldOrderID;
    }
    public String getOriOrderID() {
        return oriOrderID;
    }
    public void setOriOrderID(String oriOrderID) {
        this.oriOrderID = oriOrderID;
    }
    public String getInterFaceSendID() {
        return interFaceSendID;
    }
    public void setInterFaceSendID(String interFaceSendID) {
        this.interFaceSendID = interFaceSendID;
    }
    public String getInterFaceConfirmNO() {
        return interFaceConfirmNO;
    }
    public void setInterFaceConfirmNO(String interFaceConfirmNO) {
        this.interFaceConfirmNO = interFaceConfirmNO;
    }
    public String getHotel() {
        return hotel;
    }
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public Date getArrival() {
        return arrival;
    }
    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }
    public Date getDeparture() {
        return departure;
    }
    public void setDeparture(Date departure) {
        this.departure = departure;
    }
    public Integer getPerson() {
        return person;
    }
    public void setPerson(Integer person) {
        this.person = person;
    }
    public String getNotice() {
        return notice;
    }
    public void setNotice(String notice) {
        this.notice = notice;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public RoomPrices getRoomPrices() {
        return roomPrices;
    }
    public void setRoomPrices(RoomPrices roomPrices) {
        this.roomPrices = roomPrices;
    }
    public String getGuaranteeType() {
        return guaranteeType;
    }
    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }
    @Override
    public String toString() {
        return "DomesticCancelHotelOrder [orderID=" + orderID + ", oldOrderID=" + oldOrderID + ", oriOrderID="
                + oriOrderID + ", interFaceSendID=" + interFaceSendID + ", interFaceConfirmNO="
                + interFaceConfirmNO + ", hotel=" + hotel + ", hotelName=" + hotelName + ", arrival=" + arrival
                + ", departure=" + departure + ", person=" + person + ", notice=" + notice + ", clientName="
                + clientName + ", room=" + room + ", roomName=" + roomName + ", quantity=" + quantity
                + ", roomPrices=" + roomPrices + ", guaranteeType=" + guaranteeType + "]";
    }
    

}