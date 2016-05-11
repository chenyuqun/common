package com.zizaike.entity.open.qunar.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.zizaike.entity.open.alibaba.request.RequestData;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:PriceRequest. <br/>
 * date: 2016/4/5 11:41 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("priceRequest")
public class PriceRequest extends RequestData {
    @XStreamAlias("hotelId")
    private String hotelId;

    @XStreamAlias("checkin")
    private String checkin;

    @XStreamAlias("checkout")
    private String checkout;

    @XStreamAlias("roomId")
    private String roomId;

    @XStreamAlias("numberOfRooms")
    private Integer numberOfRooms;

    @XStreamAlias("customerInfos")
    private List<CustomerInfo> customerInfos;

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public List<CustomerInfo> getCustomerInfos() {
        return customerInfos;
    }

    public void setCustomerInfos(List<CustomerInfo> customerInfos) {
        this.customerInfos = customerInfos;
    }


}
