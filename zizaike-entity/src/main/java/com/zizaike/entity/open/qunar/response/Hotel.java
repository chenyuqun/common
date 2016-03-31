package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:Hotel. <br/>
 * date: 2016/3/3111:02 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("hotel")
public class Hotel{
    @XStreamAsAttribute
    @XStreamAlias("id")
    private String id;

    @XStreamAsAttribute
    @XStreamAlias("city")
    private String city;

    @XStreamAsAttribute
    @XStreamAlias("name")
    private String name;

    @XStreamAsAttribute
    @XStreamAlias("address")
    private String address;

    @XStreamAsAttribute
    @XStreamAlias("tel")
    private String tel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id='" + id + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public Hotel(String id, String city, String name, String address, String tel) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }
}
