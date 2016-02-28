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
 * Function: 可定检查. <br/>
 * Date: 2016年2月3日 下午3:12:40 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("Request")
public class DomesticCheckRoomAvailReq extends RequestData {
    @XStreamAlias("HeaderInfo")
    private HeaderInfo headerInfo;
    @XStreamAlias("DomesticCheckRoomAvailRequest")
    private DomesticCheckRoomAvailRequest domesticCheckRoomAvailReqeust;
    public HeaderInfo getHeaderInfo() {
        return headerInfo;
    }
    public void setHeaderInfo(HeaderInfo headerInfo) {
        this.headerInfo = headerInfo;
    }
    public DomesticCheckRoomAvailRequest getDomesticCheckRoomAvail() {
        return domesticCheckRoomAvailReqeust;
    }
    public void setDomesticCheckRoomAvail(DomesticCheckRoomAvailRequest domesticCheckRoomAvailReqeust) {
        this.domesticCheckRoomAvailReqeust = domesticCheckRoomAvailReqeust;
    }
    public DomesticCheckRoomAvailReq() {
    }
    


    @Override
    public String toString() {
        return "DomesticCheckRoomAvailRequest [headerInfo=" + headerInfo + ", domesticCheckRoomAvailReqeust="
                + domesticCheckRoomAvailReqeust + "]";
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
        stream.processAnnotations(DomesticCheckRoomAvailReq.class);
        DomesticCheckRoomAvailReq obj = (DomesticCheckRoomAvailReq) stream.fromXML(xml);
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
