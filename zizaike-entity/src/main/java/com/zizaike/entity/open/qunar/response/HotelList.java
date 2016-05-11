package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.zizaike.entity.open.alibaba.response.ResponseData;

import java.io.Serializable;
import java.util.List;

/**
 * Project Name: code <br/>
 * Function:HotelList. <br/>
 * date: 2016/3/3017:12 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("list")
public class HotelList extends ResponseData implements Serializable {

    private static final long serialVersionUID = 4140780902934280823L;
    @XStreamImplicit(itemFieldName = "hotel")
    private List<Hotel> hotel;

    public List<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }



    @Override
    public String toString() {
        return "HotelList{" +
                "hotel=" + hotel +
                '}';
    }

    public HotelList(List<Hotel> hotel) {
        this.hotel = hotel;
    }

    public HotelList() {
    }
}
