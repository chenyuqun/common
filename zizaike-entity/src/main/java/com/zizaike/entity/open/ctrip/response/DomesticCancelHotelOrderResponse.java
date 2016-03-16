package com.zizaike.entity.open.ctrip.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
 @XStreamAlias("DomesticCancelhotelOrderResponse")
    public class DomesticCancelHotelOrderResponse {
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