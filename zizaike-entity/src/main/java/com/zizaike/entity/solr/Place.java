/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:Place.java  <br/>
 * Package Name:com.zizaike.entity.solr  <br/>
 * Date:2015年11月3日下午3:40:48  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  

  
package com.zizaike.entity.solr;  

import org.apache.solr.client.solrj.beans.Field;

import com.zizaike.entity.solr.model.SearchablePlace;

/**  
 * ClassName:Place <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年11月3日 下午3:40:48 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public class Place extends SearchablePlace implements java.io.Serializable {

   
    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = -2707706726049819873L;
    /**
     * 主键id
     */
    @Field(ID_FIELD)
    private Integer id;  
    /**
     * 目的地
     */
    @Field(DEST_ID_FIELD)
    private Integer destId;
    /**
     * 地点id 
     */
    @Field(LOCID_FIELD)
    private Integer locid;
    /**
     * 1商圈 2景点 3捷运站
     */
    @Field(POI_TYPE_FIELD)
    private Integer poiType;
    /**
     * 权重
     */
    @Field(POI_RANK_FIELD)
    private Integer poiRank;
    /**
     * 地标名称
     */
    @Field(POI_NAME_FIELD)
    private String poiName;
    /**
     * 纬度
     */
    @Field(GOOGLE_MAP_LAT_FIELD)
    private Double googleMapLat;
    /**
     * 经度
     */
    @Field(GOOGLE_MAP_LNG_FIELD)
    private Double googleMapLng;
    /**
     * 地址
     */
    @Field(GOOGLE_MAP_ADDRESS_FIELD)
    private String googleMapAddress;
    /**
     * 状态
     */
    @Field(STATUS_FIELD)
    private Integer status;
    @Field(AUTO_ERROR_FIELD)
    private Integer autoError;
    @Field(VERSION_FIELD)
    private long version;
    @Field(ADMIN_UID_FIELD)
    private Integer adminUid;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getDestId() {
        return destId;
    }
    public void setDestId(Integer destId) {
        this.destId = destId;
    }
    public Integer getLocid() {
        return locid;
    }
    public void setLocid(Integer locid) {
        this.locid = locid;
    }
    public Integer getPoiType() {
        return poiType;
    }
    public void setPoiType(Integer poiType) {
        this.poiType = poiType;
    }
    public Integer getPoiRank() {
        return poiRank;
    }
    public void setPoiRank(Integer poiRank) {
        this.poiRank = poiRank;
    }
    public String getPoiName() {
        return poiName;
    }
    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }
    public Double getGoogleMapLat() {
        return googleMapLat;
    }
    public void setGoogleMapLat(Double googleMapLat) {
        this.googleMapLat = googleMapLat;
    }
    public Double getGoogleMapLng() {
        return googleMapLng;
    }
    public void setGoogleMapLng(Double googleMapLng) {
        this.googleMapLng = googleMapLng;
    }
    public String getGoogleMapAddress() {
        return googleMapAddress;
    }
    public void setGoogleMapAddress(String googleMapAddress) {
        this.googleMapAddress = googleMapAddress;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getAutoError() {
        return autoError;
    }
    public void setAutoError(Integer autoError) {
        this.autoError = autoError;
    }
    public long getVersion() {
        return version;
    }
    public void setVersion(long version) {
        this.version = version;
    }
    public Integer getAdminUid() {
        return adminUid;
    }
    public void setAdminUid(Integer adminUid) {
        this.adminUid = adminUid;
    }
      

}
  
