package com.zizaike.entity.recommend;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * ClassName: LocPoi <br/>  
 * Function: poi表. <br/>  
 * date: 2016年4月18日 下午12:07:06 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class LocPoi implements Serializable{
    private static final long serialVersionUID = 6096875793565753540L;
    private Integer id;
    /**
     * 国家id
     */
    private Integer destId;
    private Integer locid;
    
    private Integer poiType;

    private Integer poiRank;

    private String poiName;

    private Double googleMapLat;

    private Double googleMapLng;

    private String googleMapAddress;

    private Boolean status;

    private Boolean autoError;

    private Integer createTime;

    private Date updateTime;

    private Integer adminUid;

    private Float searchRadius;

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getAutoError() {
        return autoError;
    }

    public void setAutoError(Boolean autoError) {
        this.autoError = autoError;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getAdminUid() {
        return adminUid;
    }

    public void setAdminUid(Integer adminUid) {
        this.adminUid = adminUid;
    }

    public Float getSearchRadius() {
        return searchRadius;
    }

    public void setSearchRadius(Float searchRadius) {
        this.searchRadius = searchRadius;
    }

    @Override
    public String toString() {
        return "LocPoi [id=" + id + ", destId=" + destId + ", locid=" + locid + ", poiType=" + poiType + ", poiRank="
                + poiRank + ", poiName=" + poiName + ", googleMapLat=" + googleMapLat + ", googleMapLng="
                + googleMapLng + ", googleMapAddress=" + googleMapAddress + ", status=" + status + ", autoError="
                + autoError + ", createTime=" + createTime + ", updateTime=" + updateTime + ", adminUid=" + adminUid
                + ", searchRadius=" + searchRadius + "]";
    }
    
}