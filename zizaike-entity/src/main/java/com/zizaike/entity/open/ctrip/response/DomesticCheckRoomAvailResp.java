/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:DomesticCheckRoomAvailResponse.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip.response  <br/>
 * Date:2016年2月4日上午10:17:59  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.ctrip.response;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.response.ResponseData;

/**
 * ClassName:DomesticCheckRoomAvailResponse <br/>
 * Function: 可定检查返回. <br/>
 * Date: 2016年2月4日 上午10:17:59 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("RequestResult")
public class DomesticCheckRoomAvailResp extends ResponseData {
    @XStreamAlias("Message")
    private String message;
    @XStreamAlias("ResultCode")
    private String resultCode;
    @XStreamAlias("DomesticCheckRoomAvailResponse")
    private DomesticCheckRoomAvailResponse domesticCheckRoomAvailResponse;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getResultCode() {
        return resultCode;
    }
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
    
    public DomesticCheckRoomAvailResponse getDomesticCheckRoomAvailResponse() {
        return domesticCheckRoomAvailResponse;
    }
    public void setDomesticCheckRoomAvailResponse(DomesticCheckRoomAvailResponse domesticCheckRoomAvailResponse) {
        this.domesticCheckRoomAvailResponse = domesticCheckRoomAvailResponse;
    }
    public DomesticCheckRoomAvailResp() {
       this.resultCode="0";
       this.message="成功";
    }
    
  

        

        
       


@Override
    public String toString() {
        return "DomesticCheckRoomAvailResponse [message=" + message + ", resultCode=" + resultCode
                + ", domesticCheckRoomAvail=" + domesticCheckRoomAvailResponse + "]";
    }










public static void main(String[] args) {
     String xml = "<RequestResult>"
        +"<Message>string</Message>"
        +"<ResultCode>int</ResultCode>"
        +"<DomesticCheckRoomAvailResponse>"
          +"<!--是否能预订(1:可订;0:不可预订)-->"
          +"<IsBookable>1</IsBookable>"
          +"<!--房型编号,需要转换为携程的房型编号-->"
          +"<Room>4809658</Room>"
          +"<!--接口订单金额-->"
          +"<InterFaceAmount>-1.0000</InterFaceAmount>"
          +"<!--错误描述-->"
          +"<ReturnDescript>错误描述</ReturnDescript>"
          +"<RoomPrices>"
            +"<!--每个RoomPrice对应一天价格-->"
            +"<RoomPrice>"
              +"<EffectDate>2014-07-05T00:00:00</EffectDate>"
              +"<Price>618.0000</Price>"
              +"<CNYPrice>0</CNYPrice>"
              +"<Cost>0</Cost>"
              +"<CNYCost>0</CNYCost>"
              +"<BreakFast>0</BreakFast>"
            +"</RoomPrice>"
            +"<RoomPrice>"
              +"<EffectDate>2014-07-06T00:00:00</EffectDate>"
              +"<Price>618.0000</Price>"
              +"<CNYPrice>0</CNYPrice>"
              +"<Cost>0</Cost>"
              +"<CNYCost>0</CNYCost>"
              +"<BreakFast>0</BreakFast>"
            +"</RoomPrice>"
          +"</RoomPrices>"
          +"<!--可用房数量-->"
          +"<AvailRoomQuantitys>"
            +"<AvailRoomQuantity>"
              +"<EffectDate>2014-07-03T00:00:00</EffectDate>"
              +"<AvailQuantity>8</AvailQuantity>"
            +"</AvailRoomQuantity>"
          +"</AvailRoomQuantitys>"
        +"</DomesticCheckRoomAvailResponse>"
      +"</RequestResult>";
     XStream stream = new XStream();
     stream.processAnnotations(DomesticCheckRoomAvailResp.class);
     DomesticCheckRoomAvailResp obj = (DomesticCheckRoomAvailResp) stream.fromXML(xml);
     System.out.println(obj);
     
     /**String xml = 
               "<RoomPrices>"
                 +"<!--每个RoomPrice对应一天价格-->"
                 +"<RoomPrice>"
                   +"<EffectDate>2014-07-05T00:00:00</EffectDate>"
                   +"<Price>618.0000</Price>"
                   +"<CNYPrice>0</CNYPrice>"
                   +"<Cost>0</Cost>"
                   +"<CNYCost>0</CNYCost>"
                   +"<BreakFast>0</BreakFast>"
                 +"</RoomPrice>"
                 +"<RoomPrice>"
                   +"<EffectDate>2014-07-06T00:00:00</EffectDate>"
                   +"<Price>618.0000</Price>"
                   +"<CNYPrice>0</CNYPrice>"
                   +"<Cost>0</Cost>"
                   +"<CNYCost>0</CNYCost>"
                   +"<BreakFast>0</BreakFast>"
                 +"</RoomPrice>"
               +"</RoomPrices>";
          XStream stream = new XStream();
          stream.processAnnotations(RoomPrices.class);
          RoomPrices obj = (RoomPrices) stream.fromXML(xml);
          System.out.println(obj);**/
    
         /** String xml = 
                  "<AvailRoomQuantitys>"
                          +"<AvailRoomQuantity>"
                            +"<EffectDate>2014-07-03T00:00:00</EffectDate>"
                            +"<AvailQuantity>8</AvailQuantity>"
                          +"</AvailRoomQuantity>"
                        +"</AvailRoomQuantitys>";
          XStream stream = new XStream();
          stream.processAnnotations(AvailRoomQuantitys.class);
          AvailRoomQuantitys obj = (AvailRoomQuantitys) stream.fromXML(xml);
          System.out.println(obj); **/
 }
}
