package com.zizaike.entity.recommend;

import com.alibaba.fastjson.annotation.JSONType;
import com.zizaike.core.common.ranslator.Translate;

/**
 * 
 * ClassName: Loctype <br/>  
 * Reason: 地址表. <br/>  
 * date: 2015年11月10日 下午1:40:54 <br/>  
 *  
 * @author alex  
 * @version   
 * @since JDK 1.7
 */
@JSONType(ignores={"rank","destId","createAt","updateAt","status","mapX","mapY","mapZoom","localid","roomNum","homeNum","vhomeNum"})
public class Loctype implements java.io.Serializable{
   
    private static final long serialVersionUID = -2348195872872844335L;

    private Integer id;

    private Integer destId;
    @Translate
    private String typeName;

    private Integer parentId;

    private String typeCode;

    private String typeDesc;

    private Boolean status;

    private Integer rank;

    private String nameCode;

    private String mapX;

    private String mapY;

    private String mapZoom;

    private Integer locid;

    private Integer roomNum;

    private Integer homeNum;

    private Integer vhomeNum;
    /**
     * 行政级别类型
     */
    private AreaLevel areaLevel;
    
    public AreaLevel getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(AreaLevel areaLevel) {
        this.areaLevel = areaLevel;
    }

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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getNameCode() {
        return nameCode;
    }

    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    public String getMapX() {
        return mapX;
    }

    public void setMapX(String mapX) {
        this.mapX = mapX;
    }

    public String getMapY() {
        return mapY;
    }

    public void setMapY(String mapY) {
        this.mapY = mapY;
    }

    public String getMapZoom() {
        return mapZoom;
    }

    public void setMapZoom(String mapZoom) {
        this.mapZoom = mapZoom;
    }

    public Integer getLocid() {
        return locid;
    }

    public void setLocid(Integer locid) {
        this.locid = locid;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(Integer homeNum) {
        this.homeNum = homeNum;
    }

    public Integer getVhomeNum() {
        return vhomeNum;
    }

    public void setVhomeNum(Integer vhomeNum) {
        this.vhomeNum = vhomeNum;
    }

    @Override
    public String toString() {
        return "Loctype [id=" + id + ", destId=" + destId + ", typeName=" + typeName + ", parentId=" + parentId
                + ", typeCode=" + typeCode + ", typeDesc=" + typeDesc + ", status=" + status + ", rank=" + rank
                + ", nameCode=" + nameCode + ", mapX=" + mapX + ", mapY=" + mapY + ", mapZoom=" + mapZoom + ", locid="
                + locid + ", roomNum=" + roomNum + ", homeNum=" + homeNum + ", vhomeNum=" + vhomeNum + ", areaLevel="
                + areaLevel + "]";
    }
    
}