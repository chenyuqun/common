/**  

 * Project Name:zizaike-entity  <br/>
 * File Name:PlaceDTO.java  <br/>
 * Package Name:com.zizaike.entity.solr.dto  <br/>
 * Date:2015年11月20日下午4:32:22  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.solr.dto;  

import java.io.Serializable;
import java.util.List;

import com.zizaike.entity.solr.BNBServiceType;

/**
 * 
 * ClassName: BNBServiceDTO <br/>  
 * Function:BNB服务. <br/>  
 * date: 2016年4月20日 下午3:35:38 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class BNBService implements Serializable {
    private static final long serialVersionUID = 996459845931830226L;
    /**
     * 服务id
     */
    private int id;
    /**
     * 服务名称
     */
    private String serviceName;
    /**
     * 服务类型
     */
    private BNBServiceType serviceType;
    /**
     * 服务内容
     */
    private String content;
    /**
     * 图片
     */
    List<String> images;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 货币代码  NT$,円  ,¥,
     */
    private String currencyCode;
    
    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public BNBServiceType getServiceType() {
        return serviceType;
    }
    public void setServiceType(BNBServiceType serviceType) {
        this.serviceType = serviceType;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public List<String> getImages() {
        return images;
    }
    public void setImages(List<String> images) {
        this.images = images;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "BNBService [id=" + id + ", serviceName=" + serviceName + ", serviceType=" + serviceType + ", content="
                + content + ", images=" + images + ", price=" + price + "]";
    }
    

}
  
