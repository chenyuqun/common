package com.zizaike.entity.open.ctrip;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
 @XStreamAlias("RoomPrices")
    public class RoomPrices {
    @XStreamImplicit(itemFieldName = "RoomPrice")
    private List<RoomPrice> roomPrices = new ArrayList<RoomPrice>();

    public List<RoomPrice> getRoomPrices() {
        return roomPrices;
    }

    public void setRoomPrices(List<RoomPrice> roomPrices) {
        this.roomPrices = roomPrices;
    }

    public RoomPrices() {
        
    }

    @Override
    public String toString() {
        return "RoomPrices [roomPrices=" + roomPrices + "]";
    }
    
        
    
    }