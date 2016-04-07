package com.zizaike.entity.open.qunar.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:CustomerInfo. <br/>
 * date: 2016/4/5 11:46 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("customerInfo")
public class CustomerInfo {
    @XStreamAsAttribute
    @XStreamAlias("seq")
    private Integer seq;

    @XStreamAsAttribute
    @XStreamAlias("numberOfAdults")
    private Integer numberOfAdults;

    @XStreamAsAttribute
    @XStreamAlias("numberOfRooms")
    private Integer numberOfRooms;

    @XStreamAsAttribute
    @XStreamAlias("numberOfChildren")
    private Integer numberOfChildren;

    @XStreamAsAttribute
    @XStreamAlias("childrenAges")
    private String childrenAges;

    public String getChildrenAges() {
        return childrenAges;
    }

    public void setChildrenAges(String childrenAges) {
        this.childrenAges = childrenAges;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(Integer numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }
}
