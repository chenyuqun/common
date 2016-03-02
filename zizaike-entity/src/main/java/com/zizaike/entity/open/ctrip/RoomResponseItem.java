package com.zizaike.entity.open.ctrip;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
 @XStreamAlias("RoomResponseItem")
    public class RoomResponseItem implements Serializable{
        /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = 6443472254680453525L;
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
        @Override
        public String toString() {
            return "RoomResponseItem [masterRoom=" + masterRoom + ", room=" + room + ", roomName=" + roomName
                    + ", breakfast=" + breakfast + ", twinBed=" + twinBed + ", kingSize=" + kingSize + ", person="
                    + person + ", allowAddBed=" + allowAddBed + ", balanceType=" + balanceType + ", ratePlanCode="
                    + ratePlanCode + ", hotelGroupHotelCode=" + hotelGroupHotelCode + ", hotelGroupRoomTypeCode="
                    + hotelGroupRoomTypeCode + ", hotelGroupRoomName=" + hotelGroupRoomName + ", hotelGroupBrand="
                    + hotelGroupBrand + ", hotelGroupRatePlanCode=" + hotelGroupRatePlanCode + "]";
        }
        
        
    }