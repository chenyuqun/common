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
public class DomesticSubmitNewHotelOrderResp extends ResponseData {
    @XStreamAlias("Message")
    private String message;
    @XStreamAlias("ResultCode")
    private String resultCode;
    @XStreamAlias("DomesticSubmitNewHotelOrderResponse")
    private DomesticSubmitNewHotelOrderResponse domesticSubmitNewHotelOrderResponse;

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


    public DomesticSubmitNewHotelOrderResponse getDomesticSubmitNewHotelOrderResponse() {
        return domesticSubmitNewHotelOrderResponse;
    }

    public void setDomesticSubmitNewHotelOrderResponse(
            DomesticSubmitNewHotelOrderResponse domesticSubmitNewHotelOrderResponse) {
        this.domesticSubmitNewHotelOrderResponse = domesticSubmitNewHotelOrderResponse;
    }

    @Override
    public String toString() {
        return "DomesticSubmitNewHotelOrderResponse [message=" + message + ", resultCode=" + resultCode
                + ", domesticSubmitNewHotelOrder=" + domesticSubmitNewHotelOrderResponse + "]";
    }

    public static void main(String[] args) {
        String xml = "<RequestResult>" + "<Message>string</Message>" + "<ResultCode>int</ResultCode>"
                + "<DomesticSubmitNewHotelOrderResponse>" + "<!--订单状态(0:发送中;1:已发送;2:发送失败;3:酒店确认成功;4:酒店拒绝;5其他)-->"
                + "<OrderStatus>3</OrderStatus>" + "<!--接口确认号,酒店确认号-->"
                + "<InterFaceConfirmNO>1842195</InterFaceConfirmNO>" + "<HotelConfirmNo>825098</HotelConfirmNo>"
                + "<InterFaceAmount>359</InterFaceAmount>" + "<ReturnCode>0</ReturnCode>"
                + "<ReturnDescript>预订成功</ReturnDescript>" + "</DomesticSubmitNewHotelOrderResponse>"
                + "</RequestResult>";
        XStream stream = new XStream();
        stream.processAnnotations(DomesticSubmitNewHotelOrderResp.class);
        DomesticSubmitNewHotelOrderResp obj = (DomesticSubmitNewHotelOrderResp) stream.fromXML(xml);
        System.out.println(obj);

    }
}
