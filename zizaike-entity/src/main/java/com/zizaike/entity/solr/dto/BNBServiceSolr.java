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

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * ClassName: BNBServiceSolr版本 <br/>  
 * Function:BNB服务solr解析. <br/>  
 * date: 2016年4月20日 下午3:35:38 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class BNBServiceSolr implements Serializable {
    private static final long serialVersionUID = 996459845931830226L;
    /**
     * 服务id
     */
    private int id;
    /**
     * 服务类型名称
     */
    @JSONField(name="service_name")
    private String serviceName;
    /**
     * 服务类型
     */
    @JSONField(name="service_category")
    private String serviceCategory;
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
     * 服务名
     */
    private String title;
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
    public String getServiceCategory() {
        return serviceCategory;
    }
    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
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
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    

}
  
