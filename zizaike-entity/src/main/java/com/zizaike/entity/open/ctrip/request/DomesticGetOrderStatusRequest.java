/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:HeaderInfo.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip.request  <br/>
 * Date:2016年2月3日下午3:12:40  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.ctrip.request;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.zizaike.entity.open.RequestData;

/**
 * ClassName:DomesticCheckRoomAvailRequest <br/>
 * Function: 订单状态查询. <br/>
 * Date: 2016年2月3日 下午3:12:40 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("Request")
public class DomesticGetOrderStatusRequest extends RequestData {
    @XStreamAlias("HeaderInfo")
    private HeaderInfo headerInfo;
    @XStreamAlias("DomesticGetOrderStatusRequest")
    private DomesticGetOrderStatus domesticGetOrderStatus;

    public HeaderInfo getHeaderInfo() {
        return headerInfo;
    }

    public void setHeaderInfo(HeaderInfo headerInfo) {
        this.headerInfo = headerInfo;
    }
    
    public DomesticGetOrderStatus getDomesticGetOrderStatus() {
        return domesticGetOrderStatus;
    }

    public void setDomesticGetOrderStatus(DomesticGetOrderStatus domesticGetOrderStatus) {
        this.domesticGetOrderStatus = domesticGetOrderStatus;
    }
    

    @Override
    public String toString() {
        return "DomesticGetOrderStatusRequest [headerInfo=" + headerInfo + ", domesticGetOrderStatus="
                + domesticGetOrderStatus + "]";
    }


    @XStreamAlias("DomesticGetOrderStatusRequest")
    public class DomesticGetOrderStatus {
        @XStreamAlias("Orders")
        private Orders orders;

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
            return "OrderEntity [orderID=" + orderID + ", interFaceSendID=" + interFaceSendID + "]";
        }

    }

    public static void main(String[] args) {
        String xml = "<Request>"
                + "<HeaderInfo UserID='25' RequestorId='Ctrip.com' AsyncRequest='false' TimeStamp='2012-8-6 3:54:24'>"
                + "<Authentication UserName='zhilianjishuzhuanshu' Password='zhilianzhuanshu11!!'/>"
                + "<RequestType Name='DomesticGetOrderStatusRequest' Version='1.0'/>" + "</HeaderInfo>"
                + "<DomesticGetOrderStatusRequest>" + "<Orders>" + "<OrderEntity>" + "<OrderID>203766563</OrderID>"
                + "<!--订单接口发送号,同一订单每次发送编号会不同-->" + "<InterFaceSendID>14112314</InterFaceSendID>" + "</OrderEntity>"
                + "<OrderEntity>" + "<OrderID>203766564</OrderID>" + "<!--订单接口发送号,同一订单每次发送编号会不同-->"
                + "<InterFaceSendID>14112316</InterFaceSendID>" + "</OrderEntity>" + "</Orders>"
                + "</DomesticGetOrderStatusRequest>" + "</Request>";

        XStream stream = new XStream();
        stream.processAnnotations(DomesticGetOrderStatusRequest.class);
        DomesticGetOrderStatusRequest obj = (DomesticGetOrderStatusRequest) stream.fromXML(xml);
        System.out.println(obj);
    }
}
