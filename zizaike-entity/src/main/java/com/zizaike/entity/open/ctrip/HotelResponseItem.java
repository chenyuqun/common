package com.zizaike.entity.open.ctrip;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("HotelResponseItem")
public class HotelResponseItem implements Serializable{
    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = 2998074846191705133L;
    @XStreamAlias("MasterHotel")
    private MasterHotel masterHotel;

    public MasterHotel getMasterHotel() {
        return masterHotel;
    }

    public void setMasterHotel(MasterHotel masterHotel) {
        this.masterHotel = masterHotel;
    }

    @Override
    public String toString() {
        return "HotelResponseItem [masterHotel=" + masterHotel + "]";
    }

}