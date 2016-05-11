package com.zizaike.entity.open.qunar.request;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

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
    
    @XStreamImplicit(itemFieldName = "customer")
    private List<Customer> customer;

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

    /**  
     * Creates a new instance of CustomerInfo.  
     *  
     * @param customer
     * @param seq
     * @param numberOfAdults
     * @param numberOfRooms
     * @param numberOfChildren
     * @param childrenAges  
     */  
    
    public CustomerInfo(List<Customer> customer, Integer seq, Integer numberOfAdults, Integer numberOfRooms,
            Integer numberOfChildren, String childrenAges) {
        super();
        this.customer = customer;
        this.seq = seq;
        this.numberOfAdults = numberOfAdults;
        this.numberOfRooms = numberOfRooms;
        this.numberOfChildren = numberOfChildren;
        this.childrenAges = childrenAges;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

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
