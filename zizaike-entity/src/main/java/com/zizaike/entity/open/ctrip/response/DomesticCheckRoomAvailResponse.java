package com.zizaike.entity.open.ctrip.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.ctrip.RoomPrices;

@XStreamAlias("DomesticCheckRoomAvailResponse")
public class DomesticCheckRoomAvailResponse{
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

    public void setRoomPrices(RoomPrices roomPrices) {
        this.roomPrices = roomPrices;
    }

    public void setAvailRoomQuantitys(AvailRoomQuantitys availRoomQuantitys) {
        this.availRoomQuantitys = availRoomQuantitys;
    }

    @Override
    public String toString() {
        return "DomesticCheckRoomAvailResponse [isBookable=" + isBookable + ", room=" + room + ", interFaceAmount="
                + interFaceAmount + ", returnDescript=" + returnDescript + ", roomPrices=" + roomPrices
                + ", availRoomQuantitys=" + availRoomQuantitys + "]";
    }

    

}