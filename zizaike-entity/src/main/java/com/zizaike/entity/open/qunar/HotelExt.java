package com.zizaike.entity.open.qunar;

import com.zizaike.entity.open.qunar.response.Hotel;

/**
 * Project Name: code <br/>
 * Function:HotelExt. <br/>
 * date: 2016/4/11 18:17 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public class HotelExt extends Hotel{
    private String rids;
    private Integer dest_id;
    public Integer getDest_id() {
        return dest_id;
    }

    public void setDest_id(Integer dest_id) {
        this.dest_id = dest_id;
    }

    public String getRids() {
        return rids;
    }

    public void setRids(String rids) {
        this.rids = rids;
    }
}
