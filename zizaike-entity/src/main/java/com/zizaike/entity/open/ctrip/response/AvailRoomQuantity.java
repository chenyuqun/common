package com.zizaike.entity.open.ctrip.response;

import java.io.Serializable;
import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.zizaike.entity.open.XStreamYMDTHMSDateConverter;


@XStreamAlias("AvailRoomQuantity")
public class AvailRoomQuantity implements Serializable{
    private static final long serialVersionUID = -1780987267645029877L;
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
        
    }

    @Override
    public String toString() {
        return "AvailRoomQuantity [effectDate=" + effectDate + ", availQuantity=" + availQuantity + "]";
    }

}