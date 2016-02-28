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
 * Function: 取消订单. <br/>
 * Date: 2016年2月3日 下午3:12:40 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("Request")
public class DomesticCancelHotelOrderReq extends RequestData {
    @XStreamAlias("HeaderInfo")
    private HeaderInfo headerInfo;
    @XStreamAlias("DomesticCancelHotelOrderRequest")
    private DomesticCancelHotelOrderRequest domesticCancelHotelOrderRequest;
    
    public HeaderInfo getHeaderInfo() {
        return headerInfo;
    }

    public void setHeaderInfo(HeaderInfo headerInfo) {
        this.headerInfo = headerInfo;
    }

    public DomesticCancelHotelOrderRequest getDomesticCancelHotelOrderRequest() {
        return domesticCancelHotelOrderRequest;
    }

    public void setDomesticCancelHotelOrderRequest(DomesticCancelHotelOrderRequest domesticCancelHotelOrderRequest) {
        this.domesticCancelHotelOrderRequest = domesticCancelHotelOrderRequest;
    }
    
    @Override
    public String toString() {
        return "DomesticCancelHotelOrderReq [headerInfo=" + headerInfo + ", domesticCancelHotelOrderRequest="
                + domesticCancelHotelOrderRequest + "]";
    }

    public static void main(String[] args) {
        String xml = "<Request>"
                +"<HeaderInfo UserID='25' RequestorId='Ctrip.com' AsyncRequest='false' TimeStamp='2012-8-6 3:54:24'>"
                +"<Authentication UserName='zhilianjishuzhuanshu' Password='zhilianzhuanshu11!!'/>"
                +"<RequestType Name='DomesticCancelHotelOrderRequest' Version='1.0'/>"
              +"</HeaderInfo>"
              +"<DomesticCancelHotelOrderRequest>"
                +"<OrderID>242822293</OrderID>"
                +"<OldOrderID>0</OldOrderID>"
                +"<Ori_OrderID>0</Ori_OrderID>"
                +"<!--订单接口发送号,同一订单每次发送编号会不同,接收方需落地保存 -->"
                +"<InterFaceSendID>14112314</InterFaceSendID>"
                +"<InterFaceConfirmNO>1829595</InterFaceConfirmNO>"
                +"<Hotel>548892</Hotel>"
                +"<HotelName>桔子酒店精选(苏州金鸡湖店)</HotelName>"
                +"<Arrival>2014-07-05T00:00:00</Arrival>"
                +"<Departure>2014-07-06T00:00:00</Departure>"
                +"<Person>1</Person>"
                +"<Notice/>"
                +"<ClientName>李星星</ClientName>"
                +"<Room>4240140</Room>"
                +"<RoomName>大床房(限量促销)</RoomName>"
                +"<Quantity>1</Quantity>"
                +"<GuaranteeType/>"
              +"</DomesticCancelHotelOrderRequest>"
             +"</Request>";

        XStream stream = new XStream();
        stream.processAnnotations(DomesticCancelHotelOrderReq.class);
        DomesticCancelHotelOrderReq obj = (DomesticCancelHotelOrderReq) stream.fromXML(xml);
        System.out.println(obj);
    }
}
