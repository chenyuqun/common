/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:Hotel.java  <br/>
 * Package Name:com.zizaike.entity.open.alibaba  <br/>
 * Date:2016年1月19日上午10:42:57  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba;  

import java.util.Date;


/**  
 * ClassName:Hotel <br/>  
 * Function: 酒店 <br/>  
 * Date:     2016年1月19日 上午10:42:57 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class Hotel {
    /**
     * 动作
     */
    Action action;
    /**
     * 卖家自己系统的id
     */
    private String outerId;
    /**
     * 酒店名称
     */
    private String name;
    
    
    
    /**
     * 曾用名
     */
    private String usedName;
    /**
     * 0:国内;1:国外
     */
    private Long domestic;
    /**
     *描述
     */
    private String description;
    

   

    /**
     * 国家编码
     */
    private String country;
    /**
     * 省份编码
     */
    private Long province;

    /**
     * 城市编码
     */
    private Long city;
    /**
     * 地区编码
     */
    private Long district;
    
    /**
     * 商圈信息
     */
    private String business;
    /**
     * 酒店地址
     */
    private String address;
    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;
    /**
     * 坐标类型
     */
    private String positionType;
    /**
     * 酒店电话
     */
    private String tel;
    /**
     * 扩展信息
     */
    private String extend;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 酒店数据状态：匹配成功；待匹配；待审核；审核失败；疑似错误；请注意：只有状态为&ldquo;匹配成功&rdquo;; 才是正常状态。其他状态都不会上架商品。
     */
    private String dataConfirmStr;
    /**
     * 未通过时的拒绝原因等。
     */
    private String errorInfo;
    /**
     * 酒店ID
     */
    private Long hid;
    /**
     * hotel匹配状态: 0：待系统匹配 1：已系统匹配，匹配成功，待卖家确认 2：已系统匹配，匹配失败，待人工匹配 3：已人工匹配，匹配成功，待卖家确认 4：已人工匹配，匹配失败 5：卖家已确认，确认&ldquo;YES&rdquo; 6：卖家已确认，确认&ldquo;NO&rdquo; 7:已系统匹配，但是匹配重复，待人工确认
     */
    private Long matchStatus;

    /**
     * 修改时间
     */
    private Date modifiedTime;
    /**
     * 酒店状态：0: 正常;-2:停售；-1：删除
     */
    private Long status;


    

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusiness() {
        return this.business;
    }
    public void setBusiness(String business) {
        this.business = business;
    }

    public Long getCity() {
        return this.city;
    }
    public void setCity(Long city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCreatedTime() {
        return this.createdTime;
    }
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getDataConfirmStr() {
        return this.dataConfirmStr;
    }
    public void setDataConfirmStr(String dataConfirmStr) {
        this.dataConfirmStr = dataConfirmStr;
    }

    public Long getDistrict() {
        return this.district;
    }
    public void setDistrict(Long district) {
        this.district = district;
    }

    public Long getDomestic() {
        return this.domestic;
    }
    public void setDomestic(Long domestic) {
        this.domestic = domestic;
    }

    public String getErrorInfo() {
        return this.errorInfo;
    }
    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getExtend() {
        return this.extend;
    }
    public void setExtend(String extend) {
        this.extend = extend;
    }

    public Long getHid() {
        return this.hid;
    }
    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getLatitude() {
        return this.latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Long getMatchStatus() {
        return this.matchStatus;
    }
    public void setMatchStatus(Long matchStatus) {
        this.matchStatus = matchStatus;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOuterId() {
        return this.outerId;
    }
    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getPositionType() {
        return this.positionType;
    }
    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public Long getProvince() {
        return this.province;
    }
    public void setProvince(Long province) {
        this.province = province;
    }


    public Long getStatus() {
        return this.status;
    }
    public void setStatus(Long status) {
        this.status = status;
    }

    public String getTel() {
        return this.tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUsedName() {
        return this.usedName;
    }
    public void setUsedName(String usedName) {
        this.usedName = usedName;
    }
    public Action getAction() {
        return action;
    }
    public void setAction(Action action) {
        this.action = action;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Hotel [action=" + action + ", outerId=" + outerId + ", name=" + name + ", usedName=" + usedName
                + ", domestic=" + domestic + ", description=" + description + ", country=" + country + ", province="
                + province + ", city=" + city + ", district=" + district + ", business=" + business + ", address="
                + address + ", longitude=" + longitude + ", latitude=" + latitude + ", positionType=" + positionType
                + ", tel=" + tel + ", extend=" + extend + ", createdTime=" + createdTime + ", dataConfirmStr="
                + dataConfirmStr + ", errorInfo=" + errorInfo + ", hid=" + hid + ", matchStatus=" + matchStatus
                + ", modifiedTime=" + modifiedTime + ", status=" + status + "]";
    }
   
    
    

}
  
