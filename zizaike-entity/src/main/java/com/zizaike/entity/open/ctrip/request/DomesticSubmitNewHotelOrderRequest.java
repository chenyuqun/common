/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:HeaderInfo.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip.request  <br/>
 * Date:2016年2月3日下午3:12:40  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.ctrip.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.zizaike.entity.open.XStreamYMDTHMSDateConverter;
import com.zizaike.entity.open.alibaba.request.RequestData;
import com.zizaike.entity.open.ctrip.BalanceType;
import com.zizaike.entity.open.ctrip.RoomPrices;

/**
 * ClassName:DomesticCheckRoomAvailRequest <br/>
 * Function: 新订订单. <br/>
 * Date: 2016年2月3日 下午3:12:40 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("Request")
public class DomesticSubmitNewHotelOrderRequest extends RequestData {
    @XStreamAlias("HeaderInfo")
    private HeaderInfo headerInfo;
    @XStreamAlias("DomesticSubmitNewHotelOrderRequest")
    private DomesticSubmitNewHotelOrder domesticSubmitNewHotelOrder;
    
    public HeaderInfo getHeaderInfo() {
        return headerInfo;
    }

    public void setHeaderInfo(HeaderInfo headerInfo) {
        this.headerInfo = headerInfo;
    }

    public DomesticSubmitNewHotelOrder getDomesticSubmitNewHotelOrder() {
        return domesticSubmitNewHotelOrder;
    }

    public void setDomesticSubmitNewHotelOrder(DomesticSubmitNewHotelOrder domesticSubmitNewHotelOrder) {
        this.domesticSubmitNewHotelOrder = domesticSubmitNewHotelOrder;
    }

    @Override
    public String toString() {
        return "DomesticSubmitNewHotelOrderRequest [headerInfo=" + headerInfo + ", domesticSubmitNewHotelOrder="
                + domesticSubmitNewHotelOrder + "]";
    }

    @XStreamAlias("DomesticSubmitNewHotelOrderRequest")
    public class DomesticSubmitNewHotelOrder {
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
        private Float costAmount;
        /**
         * 订单底价金额(人民币),现付一般不传或者传0
         */
        @XStreamAlias("CNYCostAmount")
        private Float CNYCostAmount;
        
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
        public Float getCostAmount() {
            return costAmount;
        }
        public void setCostAmount(Float costAmount) {
            this.costAmount = costAmount;
        }
        public Float getCNYCostAmount() {
            return CNYCostAmount;
        }
        public void setCNYCostAmount(Float cNYCostAmount) {
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
    
    @XStreamAlias("Guests")
    public class Guests {
        @XStreamImplicit(itemFieldName = "GuestEntity")
        private List<GuestEntity> guests = new ArrayList<GuestEntity>();

        public List<GuestEntity> getGuests() {
            return guests;
        }

        public void setGuests(List<GuestEntity> guests) {
            this.guests = guests;
        }

        @Override
        public String toString() {
            return "Guests [guests=" + guests + "]";
        }
        
    }
    
    @XStreamAlias("GuestEntity")
    public class GuestEntity {
        @XStreamAlias("FirstName")
        private String firstName;
        @XStreamAlias("LastName")
        private String lastName;
        @XStreamAlias("ChinesName")
        private String chinesName;
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getChinesName() {
            return chinesName;
        }
        public void setChinesName(String chinesName) {
            this.chinesName = chinesName;
        }
        @Override
        public String toString() {
            return "GuestEntity [firstName=" + firstName + ", lastName=" + lastName + ", chinesName=" + chinesName
                    + "]";
        }
        
    }

    public static void main(String[] args) {
        String xml = 
                "<Request>"
                        +"<HeaderInfo UserID='25' RequestorId='Ctrip.com' AsyncRequest='false' TimeStamp='2012-8-6 3:54:24'>"
                + "<Authentication UserName='zhilianjishuzhuanshu' Password='zhilianzhuanshu11!!'/>"
                + "<RequestType Name='DomesticCheckRoomAvailRequest' Version='1.0'/>" + "</HeaderInfo>"
                        +"<DomesticSubmitNewHotelOrderRequest>"
                          +"<!--订单号-->"
                          +"<OrderID>244512466</OrderID>"
                          +"<!--订单接口发送号,同一订单每次发送编号会不同,接收方需落地保存-->"
                          +"<InterFaceSendID>14112314</InterFaceSendID>"
                          +"<!--Ctrip酒店编号,供应商需要转成自己的对应编号 -->"
                          +"<Hotel>548892</Hotel>"
                          +"<!--酒店名-->"
                          +"<HotelName>桔子酒店精选(苏州金鸡湖店)</HotelName>"
                          +"<!--入住日期-->"
                          +"<Arrival>2014-07-03T00:00:00</Arrival>"
                          +"<!--离店日期-->"
                          +"<Departure>2014-07-05T00:00:00</Departure>"
                          +"<!--最早到店时间-->"
                          +"<EarlyArrivalTime>2014-07-03T18:37:07</EarlyArrivalTime>"
                          +"<!--最晚到店时间-->"
                          +"<LastArrivalTime>2014-07-03T23:59:00</LastArrivalTime>"
                          +"<!--实际入住人数-->"
                          +"<Person>2</Person>"
                          +"<!--备注-->"
                          +"<Notice/>"
                          +"<Guests>"
                            +"<GuestEntity>"
                              +"<!--入住人英文名-->"
                              +"<FirstName>kobe</FirstName>"
                              +"<!--入住人英文姓-->"
                              +"<LastName>bryant</LastName>"
                              +"<!--入住人中文姓名-->"
                              +"<ChinesName/>"
                            +"</GuestEntity>"
                            +"<GuestEntity>"
                              +"<FirstName>Robert</FirstName>"
                              +"<LastName>Jiang</LastName>"
                              +"<ChinesName/>"
                            +"</GuestEntity>"
                          +"</Guests>"
                          +"<!--携程联系电话-->"
                          +"<MobilePhone>10106666</MobilePhone>"
                          +"<!--订单币种-->"
                          +"<Currency>RMB</Currency>"
                          +"<!--订单卖价总金额(原币种),预付一般不传或者传0-->"
                          +"<Amount>788</Amount>"
                          +"<!--订单卖价总金额(人民币),预付一般不传或者传0-->"
                          +"<CNYAmount>788</CNYAmount>"
                          +"<!--担保方式-->"
                          +"<GuaranteeType>OVER</GuaranteeType>"
                          +"<!--支付方式-->"
                          +"<BalanceType>FG</BalanceType>"
                          +"<!--Ctrip房型编号,供应商需要转成自己的对应编号-->"
                          +"<Room>3031716</Room>"
                          +"<!--房型最大入住人数-->"
                          +"<RoomPerson>2</RoomPerson>"
                          +"<!--房型名称-->"
                          +"<RoomName>榻榻米大床房</RoomName>"
                          +"<!--预订间数-->"
                          +"<Quantity>1</Quantity>"
                          +"<!--订单底价金额(原币种),现付一般不传或者传0-->"
                          +"<CostAmount>684</CostAmount>"
                          +"<!--订单底价金额(人民币),现付一般不传或者传0-->"
                          +"<CNYCostAmount>684</CNYCostAmount>"
                          +"<RoomPrices>"
                            +"<!--每个RoomPrice对应一天价格-->"
                            +"<RoomPrice>"
                              +"<EffectDate>2014-07-03T00:00:00</EffectDate>"
                              +"<!--订单卖价金额(原币种),预付一般不传或者传0-->"
                              +"<Price>389</Price>"
                              +"<!--订单卖价金额(人民币),预付一般不传或者传0-->"
                              +"<CNYPrice>0</CNYPrice>"
                              +"<!--订单底价金额(原币种),现付一般不传或者传0-->"
                              +"<Cost>342</Cost>"
                              +"<!--订单底价金额(人民币),现付一般不传或者传0-->"
                              +"<CNYCost>0</CNYCost>"
                              +"<!--早餐数量-->"
                              +"<BreakFast>0</BreakFast>"
                            +"</RoomPrice>"
                            +"<RoomPrice>"
                              +"<EffectDate>2014-07-04T00:00:00</EffectDate>"
                              +"<!--订单卖价金额(原币种),预付一般不传或者传0-->"
                              +"<Price>389</Price>"
                              +"<!--订单卖价金额(人民币),预付一般不传或者传0-->"
                              +"<CNYPrice>0</CNYPrice>"
                              +"<!--订单底价金额(原币种),现付一般不传或者传0-->"
                              +"<Cost>342</Cost>"
                              +"<!--###############返回响应###############-->"
                              +"<!--订单底价金额(人民币),现付一般不传或者传0-->"
                              +"<CNYCost>0</CNYCost>"
                              +"<!--早餐数量-->"
                              +"<BreakFast>0</BreakFast>"
                            +"</RoomPrice>"
                          +"</RoomPrices>"
                          +"<!--备注信息-->"
                          +"<RemarkInfo>{HoldTime:2014-07-03T23:59:00,NeedGua:true,LateCxlTime:20 14-07-03T18:00:00,CxlPenaltyAmount:389,Currency:RMB}</RemarkInfo>"
                        +"</DomesticSubmitNewHotelOrderRequest>"
                       +"</Request>";

        XStream stream = new XStream();
        stream.processAnnotations(DomesticSubmitNewHotelOrderRequest.class);
        DomesticSubmitNewHotelOrderRequest obj = (DomesticSubmitNewHotelOrderRequest) stream.fromXML(xml);
        System.out.println(obj);
    }
}
