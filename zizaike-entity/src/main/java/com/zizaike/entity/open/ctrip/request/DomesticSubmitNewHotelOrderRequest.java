package com.zizaike.entity.open.ctrip.request;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.zizaike.entity.open.XStreamYMDTHMSDateConverter;
import com.zizaike.entity.open.alibaba.request.RequestData;
import com.zizaike.entity.open.ctrip.BalanceType;
import com.zizaike.entity.open.ctrip.RoomPrices;

@XStreamAlias("DomesticSubmitNewHotelOrderRequest")
public class DomesticSubmitNewHotelOrderRequest   extends RequestData{
    /**
     * Ctrip酒店编号
     */
    @XStreamAlias("OrderID")
    private String orderID;
    /**
     * 订单接口发送号
     */
    @XStreamAlias("InterFaceSendID")
    private String interFaceSendID;
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
     * 最早到店时间
     */
    @XStreamAlias("EarlyArrivalTime")
    @XStreamConverter(value = XStreamYMDTHMSDateConverter.class)
    private Date earlyArrivalTime;
    /**
     * 最早到店时间
     */
    @XStreamAlias("LastArrivalTime")
    @XStreamConverter(value = XStreamYMDTHMSDateConverter.class)
    private Date lastArrivalTime;
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
     * 客人
     */
    @XStreamAlias("Guests")
    private Guests guests;
    /**
     * 携程联系电话
     */
    @XStreamAlias("MobilePhone")
    private String mobilePhone;
    /**
     * 订单币种
     */
    @XStreamAlias("Currency")
    private String currency;
    /**
     *订单卖价总金额(原币种),预付一般不传或者传0
     */
    @XStreamAlias("Amount")
    private String amount;
    /**
     *订单卖价总金额(原币种),预付一般不传或者传0
     */
    @XStreamAlias("CNYAmount")
    private String CNYAmount;
    /**
     *担保方式
     */
    @XStreamAlias("GuaranteeType")
    private String guaranteeType;
    /**
     *支付方式
     */
    @XStreamAlias("BalanceType")
    private BalanceType balanceType;
    
    /**
     * Ctrip房型编号
     */
    @XStreamAlias("Room")
    private String room;
    
    /**
     * 房型最大入住人数
     */
    @XStreamAlias("RoomPerson")
    private Integer roomPerson;
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
    /**
     * 订单底价金额(原币种),现付一般不传或者传0
     */
    @XStreamAlias("CostAmount")
    private Long costAmount;
    /**
     * 订单底价金额(人民币),现付一般不传或者传0
     */
    @XStreamAlias("CNYCostAmount")
    private Long CNYCostAmount;
    
    @XStreamAlias("RoomPrices")
    private RoomPrices roomPrices;
    /**
     * 备注信息
     */
    @XStreamAlias("RemarkInfo")
    private String remarkInfo;
    public String getOrderID() {
        return orderID;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getInterFaceSendID() {
        return interFaceSendID;
    }
    public void setInterFaceSendID(String interFaceSendID) {
        this.interFaceSendID = interFaceSendID;
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
    public Date getEarlyArrivalTime() {
        return earlyArrivalTime;
    }
    public void setEarlyArrivalTime(Date earlyArrivalTime) {
        this.earlyArrivalTime = earlyArrivalTime;
    }
    public Date getLastArrivalTime() {
        return lastArrivalTime;
    }
    public void setLastArrivalTime(Date lastArrivalTime) {
        this.lastArrivalTime = lastArrivalTime;
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
    public Guests getGuests() {
        return guests;
    }
    public void setGuests(Guests guests) {
        this.guests = guests;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getCNYAmount() {
        return CNYAmount;
    }
    public void setCNYAmount(String cNYAmount) {
        CNYAmount = cNYAmount;
    }
    public String getGuaranteeType() {
        return guaranteeType;
    }
    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }
    public BalanceType getBalanceType() {
        return balanceType;
    }
    public void setBalanceType(BalanceType balanceType) {
        this.balanceType = balanceType;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public Integer getRoomPerson() {
        return roomPerson;
    }
    public void setRoomPerson(Integer roomPerson) {
        this.roomPerson = roomPerson;
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
    public Long getCostAmount() {
        return costAmount;
    }
    public void setCostAmount(Long costAmount) {
        this.costAmount = costAmount;
    }
    public Long getCNYCostAmount() {
        return CNYCostAmount;
    }
    public void setCNYCostAmount(Long cNYCostAmount) {
        CNYCostAmount = cNYCostAmount;
    }
    public RoomPrices getRoomPrices() {
        return roomPrices;
    }
    public void setRoomPrices(RoomPrices roomPrices) {
        this.roomPrices = roomPrices;
    }
    public String getRemarkInfo() {
        return remarkInfo;
    }
    public void setRemarkInfo(String remarkInfo) {
        this.remarkInfo = remarkInfo;
    }
    @Override
    public String toString() {
        return "DomesticSubmitNewHotelOrder [orderID=" + orderID + ", interFaceSendID=" + interFaceSendID
                + ", hotel=" + hotel + ", hotelName=" + hotelName + ", arrival=" + arrival + ", departure="
                + departure + ", earlyArrivalTime=" + earlyArrivalTime + ", lastArrivalTime=" + lastArrivalTime
                + ", person=" + person + ", notice=" + notice + ", guests=" + guests + ", mobilePhone="
                + mobilePhone + ", currency=" + currency + ", amount=" + amount + ", CNYAmount=" + CNYAmount
                + ", guaranteeType=" + guaranteeType + ", balanceType=" + balanceType + ", room=" + room
                + ", roomPerson=" + roomPerson + ", roomName=" + roomName + ", quantity=" + quantity
                + ", costAmount=" + costAmount + ", CNYCostAmount=" + CNYCostAmount + ", roomPrices=" + roomPrices
                + ", remarkInfo=" + remarkInfo + "]";
    }
    

}