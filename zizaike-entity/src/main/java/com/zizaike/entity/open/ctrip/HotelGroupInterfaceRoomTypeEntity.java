/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SetAdaperRoomPriceRequest.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年2月3日上午10:06:57  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip;  

import java.io.Serializable;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.request.RequestData;

/**
 * 
 * ClassName: GetHotelInfoResponse <br/>  
 * Function: GetCtripRoomTypeInfo 信息. <br/>  
 * date: 2016年2月29日 下午6:35:03 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
@XStreamAlias("HotelGroupInterfaceRoomTypeEntity")
public class HotelGroupInterfaceRoomTypeEntity extends RequestData implements Serializable{
    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = -5398169163895706471L;
    /**
     * 房型匹配流水号
     */
    @XStreamAlias("InterfaceRoomTypeID")
    private Integer interfaceRoomTypeID;
    /**
     * 子房型id
     */
    @XStreamAlias("Room")
    private Integer room;
    /**
     * 房间名
     */
    @XStreamAlias("RoomName")
    private String roomName;
    /**
     * 
     */
    @XStreamAlias("MinState")
    private String minState;
    /**
     * 
     */
    @XStreamAlias("PromoteType")
    private String promoteType;
    @XStreamAlias("Breakfast")
    private Integer breakfast;
    /**
     * 人数
     */
    @XStreamAlias("Person")
    private Integer person;
    /**
     * 子酒店id
     */
    @XStreamAlias("Hotel")
    private Integer hotel;
    /**
     * 自在客房型id
     */
    @XStreamAlias("HotelGroupRoomTypeCode")
    private Integer hotelGroupRoomTypeCode;
    /**
     * 房型名
     */
    @XStreamAlias("HotelGroupRoomName")
    private String hotelGroupRoomName;
    /**
     * 自在客酒店id
     */
    @XStreamAlias("HotelGroupHotelCode")
    private Integer hotelGroupHotelCode;
    /**
     * 自在客价格计划
     */
    @XStreamAlias("HotelGroupRatePlanCode")
    private Integer hotelGroupRatePlanCode;
    
    /**
     * 预定代码
     */
    @XStreamAlias("HotelGroupBookingCode")
    private String hotelGroupBookingCode;
    /**
     * 子酒店名
     **/
    @XStreamAlias("HotelName")
    private String hotelName;
    @XStreamAlias("HotelGroupChainCode")
    private String hotelGroupChainCode;
    
    public Integer getInterfaceRoomTypeID() {
        return interfaceRoomTypeID;
    }

    public void setInterfaceRoomTypeID(Integer interfaceRoomTypeID) {
        this.interfaceRoomTypeID = interfaceRoomTypeID;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getMinState() {
        return minState;
    }

    public void setMinState(String minState) {
        this.minState = minState;
    }

    public String getPromoteType() {
        return promoteType;
    }

    public void setPromoteType(String promoteType) {
        this.promoteType = promoteType;
    }

    public Integer getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Integer breakfast) {
        this.breakfast = breakfast;
    }

    public Integer getPerson() {
        return person;
    }

    public void setPerson(Integer person) {
        this.person = person;
    }

    public Integer getHotel() {
        return hotel;
    }

    public void setHotel(Integer hotel) {
        this.hotel = hotel;
    }

    public Integer getHotelGroupRoomTypeCode() {
        return hotelGroupRoomTypeCode;
    }

    public void setHotelGroupRoomTypeCode(Integer hotelGroupRoomTypeCode) {
        this.hotelGroupRoomTypeCode = hotelGroupRoomTypeCode;
    }

    public String getHotelGroupRoomName() {
        return hotelGroupRoomName;
    }

    public void setHotelGroupRoomName(String hotelGroupRoomName) {
        this.hotelGroupRoomName = hotelGroupRoomName;
    }

    public Integer getHotelGroupHotelCode() {
        return hotelGroupHotelCode;
    }

    public void setHotelGroupHotelCode(Integer hotelGroupHotelCode) {
        this.hotelGroupHotelCode = hotelGroupHotelCode;
    }

    public Integer getHotelGroupRatePlanCode() {
        return hotelGroupRatePlanCode;
    }

    public void setHotelGroupRatePlanCode(Integer hotelGroupRatePlanCode) {
        this.hotelGroupRatePlanCode = hotelGroupRatePlanCode;
    }

    public String getHotelGroupBookingCode() {
        return hotelGroupBookingCode;
    }

    public void setHotelGroupBookingCode(String hotelGroupBookingCode) {
        this.hotelGroupBookingCode = hotelGroupBookingCode;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelGroupChainCode() {
        return hotelGroupChainCode;
    }

    public void setHotelGroupChainCode(String hotelGroupChainCode) {
        this.hotelGroupChainCode = hotelGroupChainCode;
    }
    
    @Override
    public String toString() {
        return "HotelGroupInterfaceRoomTypeEntity [interfaceRoomTypeID=" + interfaceRoomTypeID + ", room=" + room
                + ", roomName=" + roomName + ", minState=" + minState + ", promoteType=" + promoteType + ", breakfast="
                + breakfast + ", person=" + person + ", hotel=" + hotel + ", hotelGroupRoomTypeCode="
                + hotelGroupRoomTypeCode + ", hotelGroupRoomName=" + hotelGroupRoomName + ", hotelGroupHotelCode="
                + hotelGroupHotelCode + ", hotelGroupRatePlanCode=" + hotelGroupRatePlanCode
                + ", hotelGroupBookingCode=" + hotelGroupBookingCode + ", hotelName=" + hotelName
                + ", hotelGroupChainCode=" + hotelGroupChainCode + "]";
    }

    public static void main(String[] args) {
        String xml = "<HotelGroupInterfaceRoomTypeEntity>"
                +"<InterfaceRoomTypeID>1426693</InterfaceRoomTypeID>"
                +"<Room>24658292</Room>"
                +"<RoomName>豪华欧式房(EDM 特惠)[单早]</RoomName>"
                +"<MinState>1</MinState>"
                +"<PromoteType>0</PromoteType>"
                +"<Breakfast>0</Breakfast>"
                +"<Person>0</Person>"
                +"<Hotel>4504433</Hotel>"
                +"<HotelGroupRoomTypeCode>3924111</HotelGroupRoomTypeCode>"
                +"<HotelGroupRoomName>testing1</HotelGroupRoomName>"
                +"<HotelGroupHotelCode>328111</HotelGroupHotelCode>"
                +"<HotelGroupRatePlanCode>3924111</HotelGroupRatePlanCode>"
                +"<HotelGroupBookingCode>ZiZaiKe-SelfAuto</HotelGroupBookingCode>"
                +"<HotelGroupChainCode/>"
                +"<HotelName/>"
                +"</HotelGroupInterfaceRoomTypeEntity>";
        
        XStream stream = new XStream();
        stream.processAnnotations(HotelGroupInterfaceRoomTypeEntity.class);
        HotelGroupInterfaceRoomTypeEntity obj = (HotelGroupInterfaceRoomTypeEntity) stream.fromXML(xml);
        System.out.println(obj);
    }
    
}
  
