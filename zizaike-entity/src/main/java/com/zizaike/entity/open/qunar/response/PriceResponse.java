package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.zizaike.entity.open.alibaba.response.ResponseData;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:PriceResponse. <br/>
 * date: 2016/4/5 13:59 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("priceResponse")
public class PriceResponse extends ResponseData {
    @XStreamAsAttribute
    @XStreamAlias("hotelId")
    private String hotelId;

    @XStreamAsAttribute
    @XStreamAlias("hotelCity")
    private String hotelCity;

    @XStreamAsAttribute
    @XStreamAlias("hotelName")
    private String hotelName;

    @XStreamAsAttribute
    @XStreamAlias("hotelAddress")
    private String hotelAddress;

    @XStreamAsAttribute
    @XStreamAlias("hotelPhone")
    private String hotelPhone;

    @XStreamAsAttribute
    @XStreamAlias("checkin")
    private String checkin;

    @XStreamAsAttribute
    @XStreamAlias("checkout")
    private String checkout;

    @XStreamAsAttribute
    @XStreamAlias("currrencyCode")
    private String currrencyCode;
    /**
     * one or more <room><room/>
     */
    @XStreamAlias("rooms")
    private List<Room> rooms;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
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

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
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

    public String getCurrrencyCode() {
        return currrencyCode;
    }

    public void setCurrrencyCode(String currrencyCode) {
        this.currrencyCode = currrencyCode;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
