/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:DomesticCheckRoomAvailResponse.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip.response  <br/>
 * Date:2016年2月4日上午10:17:59  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.ctrip.response;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.zizaike.entity.open.XStreamYMDTHMSDateConverter;
import com.zizaike.entity.open.alibaba.response.ResponseData;
import com.zizaike.entity.open.ctrip.RoomPrices;

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
public class DomesticCheckRoomAvailResponse extends ResponseData {
    @XStreamAlias("Message")
    private String message;
    @XStreamAlias("ResultCode")
    private String resultCode;
    @XStreamAlias("DomesticCheckRoomAvailResponse")
    private DomesticCheckRoomAvail domesticCheckRoomAvail;
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
    public DomesticCheckRoomAvail getDomesticCheckRoomAvail() {
        return domesticCheckRoomAvail;
    }
    public void setDomesticCheckRoomAvail(DomesticCheckRoomAvail domesticCheckRoomAvail) {
        this.domesticCheckRoomAvail = domesticCheckRoomAvail;
    }
    
    public DomesticCheckRoomAvailResponse() {
    }
    
  

        

        
       


@Override
    public String toString() {
        return "DomesticCheckRoomAvailResponse [message=" + message + ", resultCode=" + resultCode
                + ", domesticCheckRoomAvail=" + domesticCheckRoomAvail + "]";
    }









@XStreamAlias("DomesticCheckRoomAvailResponse")
public class DomesticCheckRoomAvail {
    /**
     * 是否能预订(1:可订;0:不可预订)
     */
    @XStreamAlias("IsBookable")
    private Integer isBookable;
    /**
     * Ctrip房型编号
     */
    @XStreamAlias("Room")
    private String room;
    /**
     * 接口订单金额
     */
    @XStreamAlias("InterFaceAmount")
    private Float interFaceAmount;
    /**
     * 错误描述
     */
    @XStreamAlias("ReturnDescript")
    private String returnDescript;

    @XStreamAlias("RoomPrices")
    private RoomPrices roomPrices;
    @XStreamAlias("AvailRoomQuantitys")
    private AvailRoomQuantitys availRoomQuantitys;
    
    public AvailRoomQuantitys getAvailRoomQuantitys() {
        return availRoomQuantitys;
    }
    public void setAvailRoomQuantitys(AvailRoomQuantitys availRoomQuantitys) {
        this.availRoomQuantitys = availRoomQuantitys;
    }
    public void setRoomPrices(RoomPrices roomPrices) {
        this.roomPrices = roomPrices;
    }

    public DomesticCheckRoomAvail() {
    }

    @Override
    public String toString() {
        return "DomesticCheckRoomAvail [isBookable=" + isBookable + ", room=" + room + ", interFaceAmount="
                + interFaceAmount + ", returnDescript=" + returnDescript + ", roomPrices=" + roomPrices
                + ", availRoomQuantitys=" + availRoomQuantitys + "]";
    }

    @XStreamAlias("AvailRoomQuantity")
    public class AvailRoomQuantity {
        /**
         * 入住日期
         */
        @XStreamAlias("EffectDate")
        @XStreamConverter(value = XStreamYMDTHMSDateConverter.class)
        private Date effectDate;
        /**
         * 可预定数量
         */
        @XStreamAlias("AvailQuantity")
        private Integer availQuantity;

        public Date getEffectDate() {
            return effectDate;
        }

        public void setEffectDate(Date effectDate) {
            this.effectDate = effectDate;
        }

        public Integer getAvailQuantity() {
            return availQuantity;
        }

        public void setAvailQuantity(Integer availQuantity) {
            this.availQuantity = availQuantity;
        }

        public AvailRoomQuantity() {

            super();
            // TODO Auto-generated constructor stub

        }

        @Override
        public String toString() {
            return "AvailRoomQuantity [effectDate=" + effectDate + ", availQuantity=" + availQuantity + "]";
        }

    }
    @XStreamAlias("AvailRoomQuantitys")
    public class AvailRoomQuantitys {
        @XStreamImplicit(itemFieldName = "AvailRoomQuantity")
        private List<AvailRoomQuantity> availRoomQuantitys = new ArrayList<AvailRoomQuantity>();

        public List<AvailRoomQuantity> getAvailRoomQuantitys() {
            return availRoomQuantitys;
        }

        public void setAvailRoomQuantitys(List<AvailRoomQuantity> availRoomQuantitys) {
            this.availRoomQuantitys = availRoomQuantitys;
        }
        
        public AvailRoomQuantitys() {
              
            super();  
            // TODO Auto-generated constructor stub  
            
        }

        @Override
        public String toString() {
            return "AvailRoomQuantitys [availRoomQuantitys=" + availRoomQuantitys + "]";
        }
        
    }
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
     stream.processAnnotations(DomesticCheckRoomAvailResponse.class);
     DomesticCheckRoomAvailResponse obj = (DomesticCheckRoomAvailResponse) stream.fromXML(xml);
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
