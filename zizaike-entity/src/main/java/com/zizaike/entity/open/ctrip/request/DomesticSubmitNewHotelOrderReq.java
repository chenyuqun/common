/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:HeaderInfo.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip.request  <br/>
 * Date:2016年2月3日下午3:12:40  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.ctrip.request;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.request.RequestData;

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
public class DomesticSubmitNewHotelOrderReq extends RequestData {
    @XStreamAlias("HeaderInfo")
    private HeaderInfo headerInfo;
    @XStreamAlias("DomesticSubmitNewHotelOrderRequest")
    private DomesticSubmitNewHotelOrderRequest domesticSubmitNewHotelOrderReqeust;
    
    public HeaderInfo getHeaderInfo() {
        return headerInfo;
    }

    public void setHeaderInfo(HeaderInfo headerInfo) {
        this.headerInfo = headerInfo;
    }


   
    
    

    public DomesticSubmitNewHotelOrderRequest getDomesticSubmitNewHotelOrderReqeust() {
        return domesticSubmitNewHotelOrderReqeust;
    }

    public void setDomesticSubmitNewHotelOrderReqeust(DomesticSubmitNewHotelOrderRequest domesticSubmitNewHotelOrderReqeust) {
        this.domesticSubmitNewHotelOrderReqeust = domesticSubmitNewHotelOrderReqeust;
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
        stream.processAnnotations(DomesticSubmitNewHotelOrderReq.class);
        DomesticSubmitNewHotelOrderReq obj = (DomesticSubmitNewHotelOrderReq) stream.fromXML(xml);
        System.out.println(obj);
    }
}
