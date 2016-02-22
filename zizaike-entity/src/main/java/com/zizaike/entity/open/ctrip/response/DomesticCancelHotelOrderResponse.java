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
public class DomesticCancelHotelOrderResponse extends ResponseData {
    @XStreamAlias("Message")
    private String message;
    @XStreamAlias("ResultCode")
    private String resultCode;
    @XStreamAlias("DomesticCancelhotelOrderResponse")
    private DomesticCancelHotelOrder domesticCancelHotelOrder;

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
    
    public DomesticCancelHotelOrder getDomesticCancelHotelOrder() {
        return domesticCancelHotelOrder;
    }

    public void setDomesticCancelHotelOrder(DomesticCancelHotelOrder domesticCancelHotelOrder) {
        this.domesticCancelHotelOrder = domesticCancelHotelOrder;
    }

    @Override
    public String toString() {
        return "DomesticCancelHotelOrderResponse [message=" + message + ", resultCode=" + resultCode
                + ", domesticCancelHotelOrder=" + domesticCancelHotelOrder + "]";
    }
    
    @XStreamAlias("DomesticCancelhotelOrderResponse")
    public class DomesticCancelHotelOrder {
        /**
         * 订单状态(0:发送中;1:已发送;2:发送失败;3:酒店确认成功;4:酒店拒绝;5其他)
         */
        @XStreamAlias("OrderStatus")
        private Integer orderStatus;
        @XStreamAlias("OrderID")
        private String orderID;
        /**
         * 接口确认号,酒店确认号
         */
        @XStreamAlias("InterFaceConfirmNO")
        private String interFaceConfirmNO;
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

        public String getOrderID() {
            return orderID;
        }

        public void setOrderID(String orderID) {
            this.orderID = orderID;
        }

        public String getInterFaceConfirmNO() {
            return interFaceConfirmNO;
        }

        public void setInterFaceConfirmNO(String interFaceConfirmNO) {
            this.interFaceConfirmNO = interFaceConfirmNO;
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
            return "DomesticCancelHotelOrder [orderStatus=" + orderStatus + ", orderID=" + orderID
                    + ", interFaceConfirmNO=" + interFaceConfirmNO + ", returnCode=" + returnCode + ", returnDescript="
                    + returnDescript + "]";
        }

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
        stream.processAnnotations(DomesticCancelHotelOrderResponse.class);
        DomesticCancelHotelOrderResponse obj = (DomesticCancelHotelOrderResponse) stream.fromXML(xml);
        System.out.println(obj);

    }
}
