package com.zizaike.entity.open.ctrip;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("MasterHotel")
public class MasterHotel implements Serializable {
    /**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).
     * 
     * @since JDK 1.7
     */
    private static final long serialVersionUID = 2194196101118747293L;
    @XStreamAlias("Hotel")
    private String hotel;
    @XStreamAlias("HotelName")
    private String hotelName;
    @XStreamAlias("City")
    private String city;
    @XStreamAlias("CityName")
    private String cityName;
    @XStreamImplicit(itemFieldName = "RoomResponseItem")
    private List<RoomResponseItem> roomResponseItem;
    @XStreamAlias("ChildHotel")
    private ChildHotel childHotel;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<RoomResponseItem> getRoomResponseItem() {
        return roomResponseItem;
    }

    public void setRoomResponseItem(List<RoomResponseItem> roomResponseItem) {
        this.roomResponseItem = roomResponseItem;
    }

    public ChildHotel getChildHotel() {
        return childHotel;
    }

    public void setChildHotel(ChildHotel childHotel) {
        this.childHotel = childHotel;
    }

    @Override
    public String toString() {
        return "MasterHotel [hotel=" + hotel + ", hotelName=" + hotelName + ", city=" + city + ", cityName=" + cityName
                + ", roomResponseItem=" + roomResponseItem + ", childHotel=" + childHotel + "]";
    }

}
