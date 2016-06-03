package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.qunar.request.CustomerInfo;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:OrderInfoResponse. <br/>
 * date: 2016/6/3 16:13 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("orderInfo")
public class OrderInfoResponse {
    @XStreamAlias("orderNum")
    private String orderNum;
    @XStreamAlias("hotelSeq")
    private String hotelSeq;
    @XStreamAlias("hotelName")
    private String hotelName;
    @XStreamAlias("hotelAddress")
    private String hotelAddress;
    @XStreamAlias("cityName")
    private String cityName;
    @XStreamAlias("hotelPhone")
    private String hotelPhone;
    @XStreamAlias("roomNum")
    private String roomNum;
    @XStreamAlias("orderDate")
    private String orderDate;
    @XStreamAlias("contactName")
    private String contactName;
    @XStreamAlias("contactPhone")
    private String contactPhone;
    @XStreamAlias("contactEmail")
    private String contactEmail;
    @XStreamAlias("payType")
    private PayType payType;
    @XStreamAlias("customerIp")
    private String customerIp;
    @XStreamAlias("invoiceCode")
    private String invoiceCode;
    @XStreamAlias("orderId")
    private String orderId;
    @XStreamAlias("qunarStatus")
    private String qunarStatus;
    @XStreamAlias("qunarStatusCode")
    private String qunarStatusCode;
    @XStreamAlias("hotelId")
    private String hotelId;
    @XStreamAlias("roomId")
    private String roomId;
    @XStreamAlias("currencyCode")
    private String currencyCode;
    @XStreamAlias("customerArriveTime")
    private String customerArriveTime;
    @XStreamAlias("specialRemarks")
    private String specialRemarks;
    @XStreamAlias("customerInfos")
    private List<CustomerInfo> customerInfos;
    @XStreamAlias("checkin")
    private String checkin;
    @XStreamAlias("checkout")
    private String checkout;
    @XStreamAlias("totalPrice")
    private String totalPrice;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getHotelSeq() {
        return hotelSeq;
    }

    public void setHotelSeq(String hotelSeq) {
        this.hotelSeq = hotelSeq;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getQunarStatus() {
        return qunarStatus;
    }

    public void setQunarStatus(String qunarStatus) {
        this.qunarStatus = qunarStatus;
    }

    public String getQunarStatusCode() {
        return qunarStatusCode;
    }

    public void setQunarStatusCode(String qunarStatusCode) {
        this.qunarStatusCode = qunarStatusCode;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCustomerArriiveTime() {
        return customerArriveTime;
    }

    public void setCustomerArriiveTime(String customerArriiveTime) {
        this.customerArriveTime = customerArriiveTime;
    }

    public String getSpecialRemarks() {
        return specialRemarks;
    }

    public void setSpecialRemarks(String specialRemarks) {
        this.specialRemarks = specialRemarks;
    }

    public List<CustomerInfo> getCustomerInfos() {
        return customerInfos;
    }

    public void setCustomerInfos(List<CustomerInfo> customerInfos) {
        this.customerInfos = customerInfos;
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

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }
}
