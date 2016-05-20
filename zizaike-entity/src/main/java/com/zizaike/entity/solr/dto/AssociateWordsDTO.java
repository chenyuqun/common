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
    private static final long serialVersionUID = 698449383206711451L;
    /**
     * 关联类型 1城市2商圈3景点4民宿名称5民宿地址
     */
    private AssociateType associateType;
    /**
     * 目的地
     */
    private Integer destId;
    /**
     * 地址id
     */
    private Integer locId;
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
    /**
     * 是否全站 1是 0不是
     */
    private Integer isAllDest;
    /**
     * 速订 1是 0不是
     */
    private Integer isSpeedRoom;
    /**
     * 目的地信息
     */
    private String destDesc;
    public AssociateType getAssociateType() {
        return associateType;
    }
    public void setAssociateType(AssociateType associateType) {
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
    public Integer getIsAllDest() {
        return isAllDest;
    }
    public void setIsAllDest(Integer isAllDest) {
        this.isAllDest = isAllDest;
    }
    public Integer getIsSpeedRoom() {
        return isSpeedRoom;
    }
    public void setIsSpeedRoom(Integer isSpeedRoom) {
        this.isSpeedRoom = isSpeedRoom;
    }

    public String getDestDesc() {
        return destDesc;
    }

    public void setDestDesc(String destDesc) {
        this.destDesc = destDesc;
    }
}
  
