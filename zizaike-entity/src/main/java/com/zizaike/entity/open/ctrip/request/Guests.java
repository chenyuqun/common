package com.zizaike.entity.open.ctrip.request;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("Guests")
public class Guests {
    @XStreamImplicit(itemFieldName = "GuestEntity")
    private List<GuestEntity> guests = new ArrayList<GuestEntity>();

    public List<GuestEntity> getGuests() {
        return guests;
    }

    public void setGuests(List<GuestEntity> guests) {
        this.guests = guests;
    }

    @Override
    public String toString() {
        return "Guests [guests=" + guests + "]";
    }
    
}