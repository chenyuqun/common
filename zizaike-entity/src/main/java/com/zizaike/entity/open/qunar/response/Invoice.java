package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:Invoice. <br/>
 * date: 2016/4/21 18:40 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("invoice")
public class Invoice{
    @XStreamAsAttribute
    @XStreamAlias("type")
    private String type;
    @XStreamAsAttribute
    @XStreamAlias("title")
    private String title;
    @XStreamAsAttribute
    @XStreamAlias("content")
    private String content;
    @XStreamAsAttribute
    @XStreamAlias("dispatch")
    private String dispatch;
    @XStreamAsAttribute
    @XStreamAlias("contactName")
    private String contactName;
    @XStreamAsAttribute
    @XStreamAlias("contactPhone")
    private String contactPhone;
    @XStreamAsAttribute
    @XStreamAlias("province")
    private String province;
    @XStreamAsAttribute
    @XStreamAlias("city")
    private String city;
    @XStreamAsAttribute
    @XStreamAlias("area")
    private String area;
    @XStreamAsAttribute
    @XStreamAlias("detailAddress")
    private String detailAddress;
    @XStreamAsAttribute
    @XStreamAlias("fee")
    private String fee;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDispatch() {
        return dispatch;
    }

    public void setDispatch(String dispatch) {
        this.dispatch = dispatch;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public Invoice(String type, String title, String content, String dispatch, String contactName, String contactPhone, String province, String city, String area, String detailAddress, String fee) {
        this.type = type;
        this.title = title;
        this.content = content;
        this.dispatch = dispatch;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.province = province;
        this.city = city;
        this.area = area;
        this.detailAddress = detailAddress;
        this.fee = fee;
    }
}
