package com.zizaike.entity.open.ctrip.response;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.zizaike.entity.open.XStreamYMDTHMSDateConverter;
import com.zizaike.entity.open.ctrip.RoomPrices;

@XStreamAlias("DomesticCheckRoomAvailResponse")
public class DomesticCheckRoomAvailResp {
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

    public DomesticCheckRoomAvailResp() {
    }

    public Integer getIsBookable() {
        return isBookable;
    }
    public void setIsBookable(Integer isBookable) {
        this.isBookable = isBookable;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public Float getInterFaceAmount() {
        return interFaceAmount;
    }
    public void setInterFaceAmount(Float interFaceAmount) {
        this.interFaceAmount = interFaceAmount;
    }
    public String getReturnDescript() {
        return returnDescript;
    }
    public void setReturnDescript(String returnDescript) {
        this.returnDescript = returnDescript;
    }
    public RoomPrices getRoomPrices() {
        return roomPrices;
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