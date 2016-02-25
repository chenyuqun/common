package com.zizaike.entity.open.ctrip.request;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.zizaike.entity.open.XStreamYMDTHMSDateConverter;
import com.zizaike.entity.open.ctrip.BalanceType;
import com.zizaike.entity.open.ctrip.RoomPrices;
 @XStreamAlias("DomesticCheckRoomAvailRequest")
    public class DomesticCheckRoomAvailReq {
        /**
         * Ctrip酒店编号
         */
        @XStreamAlias("Hotel")
        private String hotel;
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
         * Ctrip房型编号
         */
        @XStreamAlias("Room")
        private String room;
        /**
         * 币种
         */
        @XStreamAlias("CurrencyCode")
        private String currencyCode;
        /**
         * 预订间数
         */
        @XStreamAlias("RoomNumber")
        private Integer roomNumber;
        /**
         * 入住人数
         */
        @XStreamAlias("Person")
        private Integer person;
        /**
         * 价格类型
         */
        @XStreamAlias("BalanceType")
        private BalanceType balanceType;
        @XStreamAlias("RoomPrices")
        private RoomPrices roomPrices;
        
        public void setRoomPrices(RoomPrices roomPrices) {
            this.roomPrices = roomPrices;
        }

        public DomesticCheckRoomAvailReq() {
        }

        public DomesticCheckRoomAvailReq(String hotel, Date arrival, Date departure, String room,
                String currencyCode, Integer roomNumber, Integer person, BalanceType balanceType,
                RoomPrices roomPrices) {
            super();
            this.hotel = hotel;
            this.arrival = arrival;
            this.departure = departure;
            this.room = room;
            this.currencyCode = currencyCode;
            this.roomNumber = roomNumber;
            this.person = person;
            this.balanceType = balanceType;
            this.roomPrices = roomPrices;
        }

        public String getHotel() {
            return hotel;
        }

        public void setHotel(String hotel) {
            this.hotel = hotel;
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

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public Integer getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(Integer roomNumber) {
            this.roomNumber = roomNumber;
        }

        public Integer getPerson() {
            return person;
        }

        public void setPerson(Integer person) {
            this.person = person;
        }

        public BalanceType getBalanceType() {
            return balanceType;
        }

        public void setBalanceType(BalanceType balanceType) {
            this.balanceType = balanceType;
        }

        @Override
        public String toString() {
            return "DomesticCheckRoomAvailRequest [hotel=" + hotel + ", arrival=" + arrival + ", departure="
                    + departure + ", room=" + room + ", currencyCode=" + currencyCode + ", roomNumber=" + roomNumber
                    + ", person=" + person + ", balanceType=" + balanceType + ", roomPrices=" + roomPrices + "]";
        }
        


    }