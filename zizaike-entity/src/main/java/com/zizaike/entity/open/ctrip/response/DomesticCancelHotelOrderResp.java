/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:DomesticSubmitNewHotelOrderResponse.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip.response  <br/>
 * Date:2016年2月5日上午9:46:28  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.ctrip.response;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.response.ResponseData;

/**
 * ClassName:DomesticSubmitNewHotelOrderResponse <br/>
 * Function: 新订订单返回. <br/>
 * Date: 2016年2月5日 上午9:46:28 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("RequestResult")
public class DomesticCancelHotelOrderResp extends ResponseData {
    @XStreamAlias("Message")
    private String message;
    @XStreamAlias("ResultCode")
    private String resultCode;
    @XStreamAlias("DomesticCancelhotelOrderResponse")
    private DomesticCancelHotelOrderResponse domesticCancelHotelOrderResponse;

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
    public DomesticCancelHotelOrderResponse getDomesticCancelHotelOrderResponse() {
        return domesticCancelHotelOrderResponse;
    }

    public void setDomesticCancelHotelOrderResponse(DomesticCancelHotelOrderResponse domesticCancelHotelOrderResponse) {
        this.domesticCancelHotelOrderResponse = domesticCancelHotelOrderResponse;
    }
    @Override
    public String toString() {
        return "DomesticCancelHotelOrderResp [message=" + message + ", resultCode=" + resultCode
                + ", domesticCancelHotelOrderResponse=" + domesticCancelHotelOrderResponse + "]";
    }

    public static void main(String[] args) {
        String xml = "<RequestResult>"
                +"<Message>string</Message>"
                +"<ResultCode>int</ResultCode>"
                +"<DomesticCancelhotelOrderResponse>"
                  +"<!--订单状态(0:发送中;1:已发送;2:发送失败;3:酒店确认成功;4:酒店拒绝;5其他)-->"
                  +"<OrderStatus>3</OrderStatus>"
                  +"<OrderID>242822293</OrderID>"
                  +"<InterFaceConfirmNO>1829595</InterFaceConfirmNO>"
                  +"<ReturnCode>0</ReturnCode>"
                  +"<ReturnDescript>取消成功</ReturnDescript>"
                +"</DomesticCancelhotelOrderResponse>"
              +"</RequestResult>";
        XStream stream = new XStream();
        stream.processAnnotations(DomesticCancelHotelOrderResp.class);
        DomesticCancelHotelOrderResp obj = (DomesticCancelHotelOrderResp) stream.fromXML(xml);
        System.out.println(obj);

    }
}
