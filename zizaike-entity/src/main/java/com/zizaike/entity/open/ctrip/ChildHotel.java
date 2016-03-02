package com.zizaike.entity.open.ctrip;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
 @XStreamAlias("ChildHotel")
    public class ChildHotel  implements Serializable {
        /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = -7930375683533155426L;
        @XStreamAlias("Hotel")
        private String hotel;
        @XStreamImplicit(itemFieldName = "RoomResponseItem")
        private List<RoomResponseItem> roomResponseItem;
        public String getHotel() {
            return hotel;
        }
        public void setHotel(String hotel) {
            this.hotel = hotel;
        }
        public List<RoomResponseItem> getRoomResponseItem() {
            return roomResponseItem;
        }
        public void setRoomResponseItem(List<RoomResponseItem> roomResponseItem) {
            this.roomResponseItem = roomResponseItem;
        }
        @Override
        public String toString() {
            return "ChildHotel [hotel=" + hotel + ", roomResponseItem=" + roomResponseItem + "]";
        }
        
    }
    