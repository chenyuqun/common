package com.zizaike.entity.open.ctrip.response;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

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

    @Override
    public String toString() {
        return "AvailRoomQuantitys [availRoomQuantitys=" + availRoomQuantitys + "]";
    }
    
    
}