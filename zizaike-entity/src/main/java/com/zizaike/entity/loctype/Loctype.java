package com.zizaike.entity.loctype;
/**
 * 
 * ClassName: Loctype <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: 地址表. <br/>  
 * date: 2015年11月10日 下午1:40:54 <br/>  
 *  
 * @author alex  
 * @version   
 * @since JDK 1.7
 */
public class Loctype implements java.io.Serializable{
   
    private static final long serialVersionUID = -2348195872872844335L;

    private Integer id;

    private Integer destId;

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
}