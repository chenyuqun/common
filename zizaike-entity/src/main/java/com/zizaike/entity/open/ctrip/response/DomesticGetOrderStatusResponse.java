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
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.zizaike.entity.open.ResponseData;

/**
 * ClassName:DomesticCheckRoomAvailResponse <br/>
 * Function: 订单状态查询. <br/>
 * Date: 2016年2月4日 上午10:17:59 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("RequestResult")
public class DomesticGetOrderStatusResponse extends ResponseData {
    @XStreamAlias("Message")
    private String message;
    @XStreamAlias("ResultCode")
    private String resultCode;
    @XStreamAlias("DomesticGetOrderStatusResponse")
    private DomesticGetOrderStatus domesticGetOrderStatus;

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

    public DomesticGetOrderStatusResponse() {
    }
    
    public DomesticGetOrderStatus getDomesticGetOrderStatus() {
        return domesticGetOrderStatus;
    }

    public void setDomesticGetOrderStatus(DomesticGetOrderStatus domesticGetOrderStatus) {
        this.domesticGetOrderStatus = domesticGetOrderStatus;
    }

    @Override
    public String toString() {
        return "DomesticGetOrderStatusResponse [message=" + message + ", resultCode=" + resultCode
                + ", domesticGetOrderStatus=" + domesticGetOrderStatus + "]";
    }

    @XStreamAlias("DomesticGetOrderStatusResponse")
    public class DomesticGetOrderStatus {
        @XStreamAlias("Orders")
        private Orders orders;
        public DomesticGetOrderStatus() {
        }
        public Orders getOrders() {
            return orders;
        }
        public void setOrders(Orders orders) {
            this.orders = orders;
        }
        @Override
        public String toString() {
            return "DomesticGetOrderStatus [orders=" + orders + "]";
        }
        
    }

    @XStreamAlias("Orders")
    public class Orders {
        @XStreamImplicit(itemFieldName = "OrderEntity")
        private List<OrderEntity> Orders = new ArrayList<OrderEntity>();

        public List<OrderEntity> getOrders() {
            return Orders;
        }

        public void setOrders(List<OrderEntity> orders) {
            Orders = orders;
        }

        @Override
        public String toString() {
            return "Orders [Orders=" + Orders + "]";
        }

    }

    @XStreamAlias("OrderEntity")
    public class OrderEntity {
        @XStreamAlias("OrderID")
        private String orderID;
        /**
         * 订单接口发送号,同一订单每次发送编号会不同
         */
        @XStreamAlias("InterFaceSendID")
        private String interFaceSendID;
        /**
         * 订单状态
         */
        @XStreamAlias("OrderStatus")
        private Integer orderStatus;
        /**
         * 订单状态
         */
        @XStreamAlias("InterfaceConfirmNo")
        private String interfaceConfirmNo;
        /**
         * 供应商确认号,多个供应商确认号中间以逗号分隔,如果没有请传0
         */
        @XStreamAlias("HotelConfirmNo")
        private String hotelConfirmNo;
        /**
         * 描述代码
         */
        @XStreamAlias("ReturnCode")
        private String returnCode;
        /**
         * 描述说明
         */
        @XStreamAlias("ReturnDescript")
        private String returnDescript;
        
        public Integer getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getInterfaceConfirmNo() {
            return interfaceConfirmNo;
        }

        public void setInterfaceConfirmNo(String interfaceConfirmNo) {
            this.interfaceConfirmNo = interfaceConfirmNo;
        }

        public String getHotelConfirmNo() {
            return hotelConfirmNo;
        }

        public void setHotelConfirmNo(String hotelConfirmNo) {
            this.hotelConfirmNo = hotelConfirmNo;
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

        @Override
        public String toString() {
            return "OrderEntity [orderID=" + orderID + ", interFaceSendID=" + interFaceSendID + ", orderStatus="
                    + orderStatus + ", interfaceConfirmNo=" + interfaceConfirmNo + ", hotelConfirmNo=" + hotelConfirmNo
                    + ", returnCode=" + returnCode + ", returnDescript=" + returnDescript + "]";
        }
        

    }

    public static void main(String[] args) {
        String xml = "<RequestResult>"
                +"<Message>string</Message>"
                +"<ResultCode>int</ResultCode>"
                +"<DomesticGetOrderStatusResponse>"
                  +"<Orders>"
                    +"<OrderEntity>"
                      +"<OrderID>203766563</OrderID>"
                      +"<!--订单接口发送号-->"
                      +"<InterFaceSendID>14112314</InterFaceSendID>"
                      +"<!--订单状态-->"
                      +"<OrderStatus>3</OrderStatus>"
                      +"<!--接口确认号,多个酒店确认号中间以逗号分隔,如果没有请传0-->"
                      +"<InterfaceConfirmNo>34282006</InterfaceConfirmNo>"
                      +"<!--供应商确认号,多个供应商确认号中间以逗号分隔,如果没有请传0-->"
                      +"<HotelConfirmNo>825098</HotelConfirmNo>"
                      +"<!--描述代码-->"
                      +"<ReturnCode>0</ReturnCode>"
                      +"<!--描述说明-->"
                      +"<ReturnDescript>接收成功</ReturnDescript>"
                    +"</OrderEntity>"
                    +"<OrderEntity>"
                      +"<OrderID>203766564</OrderID>"
                      +"<!--订单接口发送号-->"
                      +"<InterFaceSendID>14112316</InterFaceSendID>"
                      +"<!--订单状态-->"
                      +"<OrderStatus>3</OrderStatus>"
                      +"<!--接口确认号-->"
                      +"<InterfaceConfirmNo>34282007</InterfaceConfirmNo>"
                      +"<!--供应商确认号-->"
                      +"<HotelConfirmNo>825099</HotelConfirmNo>"
                      +"<!--描述代码-->"
                      +"<ReturnCode>0</ReturnCode>"
                      +"<!--描述说明-->"
                      +"<ReturnDescript>接收成功</ReturnDescript>"
                    +"</OrderEntity>"
                  +"</Orders>"
                +"</DomesticGetOrderStatusResponse>"
              +"</RequestResult>" ;
        XStream stream = new XStream();
        stream.processAnnotations(DomesticGetOrderStatusResponse.class);
        DomesticGetOrderStatusResponse obj = (DomesticGetOrderStatusResponse) stream.fromXML(xml);
        System.out.println(obj);

    }
}
