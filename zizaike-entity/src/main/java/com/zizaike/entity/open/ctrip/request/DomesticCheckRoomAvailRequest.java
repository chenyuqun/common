/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:HeaderInfo.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip.request  <br/>
 * Date:2016年2月3日下午3:12:40  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.ctrip.request;

import java.util.Date;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.zizaike.entity.open.RequestData;
import com.zizaike.entity.open.XStreamYMDTHMSDateConverter;
import com.zizaike.entity.open.ctrip.BalanceType;
import com.zizaike.entity.open.ctrip.RoomPrices;

/**
 * ClassName:DomesticCheckRoomAvailRequest <br/>
 * Function: 可定检查. <br/>
 * Date: 2016年2月3日 下午3:12:40 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("Request")
public class DomesticCheckRoomAvailRequest extends RequestData {
    @XStreamAlias("HeaderInfo")
    private HeaderInfo headerInfo;
    @XStreamAlias("DomesticCheckRoomAvailRequest")
    private DomesticCheckRoomAvail domesticCheckRoomAvail;
    public HeaderInfo getHeaderInfo() {
        return headerInfo;
    }
    public void setHeaderInfo(HeaderInfo headerInfo) {
        this.headerInfo = headerInfo;
    }
    public DomesticCheckRoomAvail getDomesticCheckRoomAvail() {
        return domesticCheckRoomAvail;
    }
    public void setDomesticCheckRoomAvail(DomesticCheckRoomAvail domesticCheckRoomAvail) {
        this.domesticCheckRoomAvail = domesticCheckRoomAvail;
    }
    public DomesticCheckRoomAvailRequest() {
    }
    


    @Override
    public String toString() {
        return "DomesticCheckRoomAvailRequest [headerInfo=" + headerInfo + ", domesticCheckRoomAvail="
                + domesticCheckRoomAvail + "]";
    }



  

    @XStreamAlias("DomesticCheckRoomAvailRequest")
    public class DomesticCheckRoomAvail {
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

        public DomesticCheckRoomAvail() {
        }

        public DomesticCheckRoomAvail(String hotel, Date arrival, Date departure, String room,
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
   
    public static void main(String[] args) {
       String xml = "<Request>"
                + "<HeaderInfo UserID='25' RequestorId='Ctrip.com' AsyncRequest='false' TimeStamp='2012-8-6 3:54:24'>"
                + "<Authentication UserName='zhilianjishuzhuanshu' Password='zhilianzhuanshu11!!'/>"
                + "<RequestType Name='DomesticCheckRoomAvailRequest' Version='1.0'/>" + "</HeaderInfo>"
                + "<DomesticCheckRoomAvailRequest>" + "<!--Ctrip酒店编号,供应商需要转成自己的对应编号 -->" + "<Hotel>778821</Hotel>"
                + "<!--到店日期-->" + "<Arrival>2014-07-05T00:00:00</Arrival>" + "<!--离店日期-->"
                + "<Departure>2014-07-07T00:00:00</Departure>" + "<!--Ctrip房型编号,供应商需要转成自己的对应编号-->"
                + "<Room>4809658</Room>" + "<!--预订数量-->" + "<RoomNumber>1</RoomNumber>" + "<!--币种-->"
                + "<CurrencyCode>RMB</CurrencyCode>" + "<!--入住人数-->" + "<Person>1</Person>" + "<!--付款类型-->"
                + "<BalanceType>FG</BalanceType>" + "<RoomPrices>" + "<!--每个RoomPrice对应一天价格-->" + "<RoomPrice>"
                + "<!--入住日期-->" + "<EffectDate>2014-07-05T00:00:00</EffectDate>" + "<!--卖价-->" + "<Price>618</Price>"
                + "<!--汇率后的卖价-->" + "<CNYPrice>0</CNYPrice>" + "<!--底价-->" + "<Cost>525</Cost>" + "<!--汇率后的底价-->"
                + "<CNYCost>0</CNYCost>" + "<!--含早餐数-->" + "<BreakFast>0</BreakFast>" + "</RoomPrice>" + "<RoomPrice>"
                + "<!--入住日期-->" + "<EffectDate>2014-07-06T00:00:00</EffectDate>" + "<!--卖价-->" + "<Price>618</Price>"
                + "<!--汇率后的卖价-->" + "<CNYPrice>0</CNYPrice>" + "<!--底价-->" + "<Cost>525</Cost>" + "<!--汇率后的底价-->"
                + "<CNYCost>0</CNYCost>" + "<!--含早餐数-->" + "<BreakFast>0</BreakFast>"+ "</RoomPrice>" 
                + "</RoomPrices>" + "</DomesticCheckRoomAvailRequest>" + "</Request>";

        XStream stream = new XStream();
        stream.processAnnotations(DomesticCheckRoomAvailRequest.class);
        DomesticCheckRoomAvailRequest obj = (DomesticCheckRoomAvailRequest) stream.fromXML(xml);
        System.out.println(obj);
        /** String xml =  "<DomesticCheckRoomAvailRequest>" + "<!--Ctrip酒店编号,供应商需要转成自己的对应编号 -->" + "<Hotel>778821</Hotel>"
                + "<!--到店日期-->" + "<Arrival>2014-07-05T00:00:00</Arrival>" + "<!--离店日期-->"
                + "<Departure>2014-07-07T00:00:00</Departure>" + "<!--Ctrip房型编号,供应商需要转成自己的对应编号-->"
                + "<Room>4809658</Room>" + "<!--预订数量-->" + "<RoomNumber>1</RoomNumber>" + "<!--币种-->"
                + "<CurrencyCode>RMB</CurrencyCode>" + "<!--入住人数-->" + "<Person>1</Person>" + "<!--付款类型-->"
                + "<BalanceType>FG</BalanceType>" + "<RoomPrices>" + "<!--每个RoomPrice对应一天价格-->" + "<RoomPrice>"
                + "<!--入住日期-->" + "<EffectDate>2014-07-05T00:00:00</EffectDate>" + "<!--卖价-->" + "<Price>618</Price>"
                + "<!--汇率后的卖价-->" + "<CNYPrice>0</CNYPrice>" + "<!--底价-->" + "<Cost>525</Cost>" + "<!--汇率后的底价-->"
                + "<CNYCost>0</CNYCost>" + "<!--含早餐数-->" + "<BreakFast>0</BreakFast>" + "</RoomPrice>" + "<RoomPrice>"
                + "<!--入住日期-->" + "<EffectDate>2014-07-06T00:00:00</EffectDate>" + "<!--卖价-->" + "<Price>618</Price>"
                + "<!--汇率后的卖价-->" + "<CNYPrice>0</CNYPrice>" + "<!--底价-->" + "<Cost>525</Cost>" + "<!--汇率后的底价-->"
                + "<CNYCost>0</CNYCost>" + "<!--含早餐数-->"+ "<BreakFast>0</BreakFast>" + "</RoomPrice>" 
                + "</RoomPrices>" + "</DomesticCheckRoomAvailRequest>";

        XStream stream = new XStream();
        stream.processAnnotations(DomesticCheckRoomAvail.class);
        DomesticCheckRoomAvail obj = (DomesticCheckRoomAvail) stream.fromXML(xml);
        System.out.println(obj);**/
        
        /** String xml = "<RoomPrices>" + "<!--每个RoomPrice对应一天价格-->" + "<RoomPrice>"
                + "<!--入住日期-->" + "<EffectDate>2014-07-05T00:00:00</EffectDate>" + "<!--卖价-->" + "<Price>618</Price>"
                + "<!--汇率后的卖价-->" + "<CNYPrice>0</CNYPrice>" + "<!--底价-->" + "<Cost>525</Cost>" + "<!--汇率后的底价-->"
                + "<CNYCost>0</CNYCost>" + "<!--含早餐数-->" + "<BreakFast>0</BreakFast>" + "</RoomPrice>" + "<RoomPrice>"
                + "<!--入住日期-->" + "<EffectDate>2014-07-06T00:00:00</EffectDate>" + "<!--卖价-->" + "<Price>618</Price>"
                + "<!--汇率后的卖价-->" + "<CNYPrice>0</CNYPrice>" + "<!--底价-->" + "<Cost>525</Cost>" + "<!--汇率后的底价-->"
                + "<CNYCost>0</CNYCost>" + "<!--含早餐数-->"
                + "<BreakFast>0</BreakFast>"
                + "</RoomPrice>"
                + "</RoomPrices>";
        XStream stream = new XStream();
        stream.processAnnotations(RoomPrices.class);
        RoomPrices obj = (RoomPrices) stream.fromXML(xml);
        System.out.println(obj);**/
    }
}
