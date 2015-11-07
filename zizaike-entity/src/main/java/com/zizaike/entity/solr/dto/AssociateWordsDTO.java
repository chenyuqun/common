/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:AssociateWordsDTO.java  <br/>
 * Package Name:com.zizaike.entity.solr.dto  <br/>
 * Date:2015年11月7日上午11:44:59  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/   
package com.zizaike.entity.solr.dto;  


/**  
 * ClassName:AssociateWordsDTO <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年11月7日 上午11:44:59 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class AssociateWordsDTO implements java.io.Serializable{
    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = 698449383206711451L;
    /**
     * 关联类型 1城市2商圈3景点4民宿名称5民宿地址
     */
    private Integer associateType;
    /**
     * 目的地
     */
    private Integer destId;
    /**
     * 地址id
     */
    private Integer locId;
//    /**
//     * 纬度
//     */
//    private Double slat;
//    /**
//     * 经度
//     */
//    private Double slng;
    /**
     * 民宿名称/商圈名称
     */
    private String name;
    /**
     * 民宿uid
     */
    private Integer uid;
    /**
     * 民宿地址
     */
    private String address;
    public Integer getAssociateType() {
        return associateType;
    }
    public void setAssociateType(Integer associateType) {
        this.associateType = associateType;
    }
    public Integer getDestId() {
        return destId;
    }
    public void setDestId(Integer destId) {
        this.destId = destId;
    }
    public Integer getLocId() {
        return locId;
    }
    public void setLocId(Integer locId) {
        this.locId = locId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
  
