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
import com.zizaike.entity.open.ResponseData;

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
public class DomesticModifyHotelOrderResponse extends ResponseData {
    @XStreamAlias("Message")
    private String message;
    @XStreamAlias("ResultCode")
    private String resultCode;
    @XStreamAlias("DomesticModifyHotelOrderResponse")
    private DomesticModifyHotelOrder domesticModifyHotelOrder;

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

    public DomesticModifyHotelOrder getDomesticModifyHotelOrder() {
        return domesticModifyHotelOrder;
    }

    public void setDomesticModifyHotelOrder(DomesticModifyHotelOrder domesticModifyHotelOrder) {
        this.domesticModifyHotelOrder = domesticModifyHotelOrder;
    }

    @Override
    public String toString() {
        return "DomesticModifyHotelOrderResponse [message=" + message + ", resultCode=" + resultCode
                + ", domesticModifyHotelOrder=" + domesticModifyHotelOrder + "]";
    }

    @XStreamAlias("DomesticModifyHotelOrderResponse")
    public class DomesticModifyHotelOrder {
        /**
         * 订单状态(0:发送中;1:已发送;2:发送失败;3:酒店确认成功;4:酒店拒绝;5其他)
         */
        @XStreamAlias("OrderStatus")
        private Integer orderStatus;
        /**
         * 接口确认号,酒店确认号
         */
        @XStreamAlias("InterFaceConfirmNO")
        private String interFaceConfirmNO;
        /**
         * 供应商确认号
         */
        @XStreamAlias("HotelConfirmNo")
        private String hotelConfirmNo;
        /**
         * 订单金额
         */
        @XStreamAlias("InterFaceAmount")
        private String interFaceAmount;
        /**
         * 错误代码
         */
        @XStreamAlias("ReturnCode")
        private String returnCode;
        /**
         * 返回描述
         */
        @XStreamAlias("ReturnDescript")
        private String returnDescript;

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getInterFaceConfirmNO() {
            return interFaceConfirmNO;
        }

        public void setInterFaceConfirmNO(String interFaceConfirmNO) {
            this.interFaceConfirmNO = interFaceConfirmNO;
        }

        public String getHotelConfirmNo() {
            return hotelConfirmNo;
        }

        public void setHotelConfirmNo(String hotelConfirmNo) {
            this.hotelConfirmNo = hotelConfirmNo;
        }

        public String getInterFaceAmount() {
            return interFaceAmount;
        }

        public void setInterFaceAmount(String interFaceAmount) {
            this.interFaceAmount = interFaceAmount;
        }

        public String getReturnCode() {
            return returnCode;
        }

        public void setReturnCode(String returnCode) {
            this.returnCode = returnCode;
        }

        public String getReturnDescript() {
            return returnDescript;
        }

        public void setReturnDescript(String returnDescript) {
            this.returnDescript = returnDescript;
        }

        @Override
        public String toString() {
            return "DomesticModifyHotelOrder [orderStatus=" + orderStatus + ", interFaceConfirmNO="
                    + interFaceConfirmNO + ", hotelConfirmNo=" + hotelConfirmNo + ", interFaceAmount="
                    + interFaceAmount + ", returnCode=" + returnCode + ", returnDescript=" + returnDescript + "]";
        }

    }

    public static void main(String[] args) {
        String xml = "<RequestResult>" + "<Message>string</Message>" + "<ResultCode>int</ResultCode>"
                + "<DomesticModifyHotelOrderResponse>" + "<!--订单状态(0:发送中;1:已发送;2:发送失败;3:酒店确认成功;4:酒店拒绝;5其他)-->"
                + "<OrderStatus>3</OrderStatus>" + "<!--接口确认号,酒店确认号-->"
                + "<InterFaceConfirmNO>1842195</InterFaceConfirmNO>" + "<!--供应商确认号-->"
                + "<HotelConfirmNo>825098</HotelConfirmNo>" + "<!--接口订单金额-->"
                + "<InterFaceAmount>359</InterFaceAmount>" + "<!--错误代码-->" + "<ReturnCode>0</ReturnCode>"
                + "<!--返回描述-->" + "<ReturnDescript>预订成功</ReturnDescript>" + "</DomesticModifyHotelOrderResponse>"
                + "</RequestResult>";
        XStream stream = new XStream();
        stream.processAnnotations(DomesticModifyHotelOrderResponse.class);
        DomesticModifyHotelOrderResponse obj = (DomesticModifyHotelOrderResponse) stream.fromXML(xml);
        System.out.println(obj);

    }
}
