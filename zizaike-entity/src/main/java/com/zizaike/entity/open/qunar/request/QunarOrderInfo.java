/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:QunarOrderInfo.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.request  <br/>
 * Date:2016年4月7日下午1:40:02  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:QunarOrderInfo.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.request  <br/>
 * Date:2016年4月7日下午1:40:02  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.request;  

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.qunar.response.PayType;

/**  
 * ClassName: QunarOrderInfo <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2016年4月7日 下午1:40:02 <br/>  
 *  
 * @author lin  
 * @version   
 * @since JDK 1.7  
 */
@XStreamAlias("qunarOrderInfo")
public class QunarOrderInfo {

    @XStreamAlias("orderNum")
    private String orderNum;
    
    @XStreamAlias("hotelSeq")
    private String hotelSeq;
    
    @XStreamAlias("hotelName")
    private String hotelName;
    
    @XStreamAlias("hotelAddress")
    private String hotelAddress;
    
    @XStreamAlias("cityName") 
    private String cityName;
    
    @XStreamAlias("hotelPhone")
    private String hotelPhone;
    
    @XStreamAlias("orderDate")
    private String orderDate;
    
    @XStreamAlias("contactName")
    private String contactName;
    
    @XStreamAlias("contactPhone")
    private String contactPhone;
    
    @XStreamAlias("contactEmail")
    private String contactEmail;
    
    @XStreamAlias("payType")
    private PayType payType;
    
    @XStreamAlias("customerIp")
    private String customerIp;
    
    @XStreamAlias("invoiceCode")
    private String invoiceCode;

    @XStreamAlias("invoice")
    private String invoice;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getHotelSeq() {
        return hotelSeq;
    }

    public void setHotelSeq(String hotelSeq) {
        this.hotelSeq = hotelSeq;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
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

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }
}
  
