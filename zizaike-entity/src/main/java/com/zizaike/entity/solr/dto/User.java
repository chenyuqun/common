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

/**
 * 
 * ClassName: User <br/>  
 * Function:民宿服务. <br/>  
 * date: 2016年4月20日 下午3:35:38 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class User implements Serializable {

    private static final long serialVersionUID = 9002647539270056978L;
    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 地点
     */
    private String locName;
    /**
     * 图片
     */
    private String image;
    /**
     * 服务
     */
    private List<BNBService> bnbService;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocName() {
        return locName;
    }
    public void setLocName(String locName) {
        this.locName = locName;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public List<BNBService> getBnbService() {
        return bnbService;
    }
    public void setBnbService(List<BNBService> bnbService) {
        this.bnbService = bnbService;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", locName=" + locName + ", image=" + image + ", bnbService="
                + bnbService + "]";
    } 
    
}
  
