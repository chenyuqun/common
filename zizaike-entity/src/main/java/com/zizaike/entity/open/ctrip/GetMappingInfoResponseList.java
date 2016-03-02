/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:GetMappingInfoResponseList.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年3月2日上午10:30:42  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip;  

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.zizaike.entity.open.alibaba.request.RequestData;

/**  
 * ClassName:GetMappingInfoResponseList <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年3月2日 上午10:30:42 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("GetMappingInfoResponseList")
public class GetMappingInfoResponseList extends RequestData{
    
    @XStreamAlias("SupplierID")
    private int supplierID;
    @XStreamAlias("SupplierName")
    private String supplierName;
    @XStreamAlias("HotelResponseItem")
    private  List<HotelResponseItem> hotelResponseItem;
    public int getSupplierID() {
        return supplierID;
    }
    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }
    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    @XStreamAlias("HotelResponseItem")
    public class HotelResponseItem{
        @XStreamAlias("MasterHotel")
        private MasterHotel masterHotel;

        public MasterHotel getMasterHotel() {
            return masterHotel;
        }

        public void setMasterHotel(MasterHotel masterHotel) {
            this.masterHotel = masterHotel;
        }
        
    }
    @XStreamAlias("MasterHotel")
    public class MasterHotel{
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
        
    }
    
    @XStreamAlias("ChildHotel")
    public class ChildHotel{
        @XStreamAlias("Hotel")
        private String hotel;
        @XStreamImplicit(itemFieldName = "RoomResponseItem")
        private List<RoomResponseItem> roomResponseItem;
        public String getHotel() {
            return hotel;
        }
        public void setHotel(String hotel) {
            this.hotel = hotel;
        }
        public List<RoomResponseItem> getRoomResponseItem() {
            return roomResponseItem;
        }
        public void setRoomResponseItem(List<RoomResponseItem> roomResponseItem) {
            this.roomResponseItem = roomResponseItem;
        }
        
    }
    
    @XStreamAlias("RoomResponseItem")
    public class RoomResponseItem{
        @XStreamAlias("MasterRoom")
        private String masterRoom;
        @XStreamAlias("Room")
        private String room;
        @XStreamAlias("RoomName")
        private String roomName;
        @XStreamAlias("Breakfast")
        private String breakfast;
        @XStreamAlias("TwinBed")
        private String twinBed;
        @XStreamAlias("KingSize")
        private String kingSize;
        @XStreamAlias("Person")
        private String person;
        @XStreamAlias("AllowAddBed")
        private String allowAddBed;
        @XStreamAlias("BalanceType")
        private String balanceType;
        @XStreamAlias("RatePlanCode")
        private String ratePlanCode;
        @XStreamAlias("HotelGroupHotelCode")
        private String hotelGroupHotelCode;
        @XStreamAlias("HotelGroupRoomTypeCode")
        private String hotelGroupRoomTypeCode;
        @XStreamAlias("HotelGroupRoomName")
        private String hotelGroupRoomName;
        @XStreamAlias("HotelGroupBrand")
        private String hotelGroupBrand;
        @XStreamAlias("HotelGroupRatePlanCode")
        private String hotelGroupRatePlanCode;
        public String getMasterRoom() {
            return masterRoom;
        }
        public void setMasterRoom(String masterRoom) {
            this.masterRoom = masterRoom;
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
        public String getBreakfast() {
            return breakfast;
        }
        public void setBreakfast(String breakfast) {
            this.breakfast = breakfast;
        }
        public String getTwinBed() {
            return twinBed;
        }
        public void setTwinBed(String twinBed) {
            this.twinBed = twinBed;
        }
        public String getKingSize() {
            return kingSize;
        }
        public void setKingSize(String kingSize) {
            this.kingSize = kingSize;
        }
        public String getPerson() {
            return person;
        }
        public void setPerson(String person) {
            this.person = person;
        }
        public String getAllowAddBed() {
            return allowAddBed;
        }
        public void setAllowAddBed(String allowAddBed) {
            this.allowAddBed = allowAddBed;
        }
        public String getBalanceType() {
            return balanceType;
        }
        public void setBalanceType(String balanceType) {
            this.balanceType = balanceType;
        }
        public String getRatePlanCode() {
            return ratePlanCode;
        }
        public void setRatePlanCode(String ratePlanCode) {
            this.ratePlanCode = ratePlanCode;
        }
        public String getHotelGroupHotelCode() {
            return hotelGroupHotelCode;
        }
        public void setHotelGroupHotelCode(String hotelGroupHotelCode) {
            this.hotelGroupHotelCode = hotelGroupHotelCode;
        }
        public String getHotelGroupRoomTypeCode() {
            return hotelGroupRoomTypeCode;
        }
        public void setHotelGroupRoomTypeCode(String hotelGroupRoomTypeCode) {
            this.hotelGroupRoomTypeCode = hotelGroupRoomTypeCode;
        }
        public String getHotelGroupRoomName() {
            return hotelGroupRoomName;
        }
        public void setHotelGroupRoomName(String hotelGroupRoomName) {
            this.hotelGroupRoomName = hotelGroupRoomName;
        }
        public String getHotelGroupBrand() {
            return hotelGroupBrand;
        }
        public void setHotelGroupBrand(String hotelGroupBrand) {
            this.hotelGroupBrand = hotelGroupBrand;
        }
        public String getHotelGroupRatePlanCode() {
            return hotelGroupRatePlanCode;
        }
        public void setHotelGroupRatePlanCode(String hotelGroupRatePlanCode) {
            this.hotelGroupRatePlanCode = hotelGroupRatePlanCode;
        }
        
        
    }
    
}
  
