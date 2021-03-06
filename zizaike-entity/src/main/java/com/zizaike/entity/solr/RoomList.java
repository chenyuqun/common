/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:RoomList.java  <br/>
 * Package Name:com.zizaike.entity.solr  <br/>
 * Date:2015年11月21日下午3:06:04  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.solr;


import java.util.List;

/**
 * ClassName:RoomList <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年11月21日 下午3:06:04 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class RoomList implements java.io.Serializable {

    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = 141024384141125664L;

    private int uid;
    private int minPrice;
    private int isSpeed;
    private int commentNum;
    private float hsRatingAvg;
    private int userPoiId;
    private String homeStayImage;
    private String username;
    private String address;
    private String userPhoto;
    private String userPoiName;
    private Double distance;
    private String currencyCode;
    //是否商家优惠
    /**
     * 商家:惠
     */
    private int isPromotion=0;
    /**
     * 平台:减
     */
    private int isSubtract=0;
    /**
     * 平台:促
     */
    private int isSalesPromotion=0;
    /**
     * 促销消息
     */
    private String promotionInfo;
    /**
     * 民宿学院
     */
    private int isTeacherShare;
    /**
     * 特色服务
     */
    private int otherServiceI;
    /**
     * Web专用
     */
    private String latestSuccessTimeS;
    private int destId;
    private int hasStoryI;
    private int baocheServiceI;
    private int jiesongServiceI;
    private int daidingServiceI;
    private int huwaiServiceI;
    private int zaocanServiceI;
    private String followLanguageS;
    private Double slat;
    private Double slng;
    private List<RoomInfo> roomInfoList;

    public int getIsSubtract() {
        return isSubtract;
    }

    public void setIsSubtract(int isSubtract) {
        this.isSubtract = isSubtract;
    }

    public int getIsSalesPromotion() {
        return isSalesPromotion;
    }

    public void setIsSalesPromotion(int isSalesPromotion) {
        this.isSalesPromotion = isSalesPromotion;
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getIsSpeed() {
        return isSpeed;
    }

    public void setIsSpeed(int isSpeed) {
        this.isSpeed = isSpeed;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    
    public float getHsRatingAvg() {
        return hsRatingAvg;
    }

    public void setHsRatingAvg(float hsRatingAvg) {
        this.hsRatingAvg = hsRatingAvg;
    }

    public int getUserPoiId() {
        return userPoiId;
    }

    public void setUserPoiId(int userPoiId) {
        this.userPoiId = userPoiId;
    }

    public String getHomeStayImage() {
        return homeStayImage;
    }

    public void setHomeStayImage(String homeStayImage) {
        this.homeStayImage = homeStayImage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserPoiName() {
        return userPoiName;
    }

    public void setUserPoiName(String userPoiName) {
        this.userPoiName = userPoiName;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getIsPromotion() {
        return isPromotion;
    }

    public void setIsPromotion(int isPromotion) {
        this.isPromotion = isPromotion;
    }


    public int getIsTeacherShare() {
        return isTeacherShare;
    }

    public void setIsTeacherShare(int isTeacherShare) {
        this.isTeacherShare = isTeacherShare;
    }

    public int getOtherServiceI() {
        return otherServiceI;
    }

    public void setOtherServiceI(int otherServiceI) {
        this.otherServiceI = otherServiceI;
    }

    public String getLatestSuccessTimeS() {
        return latestSuccessTimeS;
    }

    public void setLatestSuccessTimeS(String latestSuccessTimeS) {
        this.latestSuccessTimeS = latestSuccessTimeS;
    }

    public int getDestId() {
        return destId;
    }

    public void setDestId(int destId) {
        this.destId = destId;
    }

    public int getHasStoryI() {
        return hasStoryI;
    }

    public void setHasStoryI(int hasStoryI) {
        this.hasStoryI = hasStoryI;
    }

    public int getBaocheServiceI() {
        return baocheServiceI;
    }

    public void setBaocheServiceI(int baocheServiceI) {
        this.baocheServiceI = baocheServiceI;
    }

    public int getJiesongServiceI() {
        return jiesongServiceI;
    }

    public void setJiesongServiceI(int jiesongServiceI) {
        this.jiesongServiceI = jiesongServiceI;
    }

    public int getDaidingServiceI() {
        return daidingServiceI;
    }

    public void setDaidingServiceI(int daidingServiceI) {
        this.daidingServiceI = daidingServiceI;
    }

    public int getHuwaiServiceI() {
        return huwaiServiceI;
    }

    public void setHuwaiServiceI(int huwaiServiceI) {
        this.huwaiServiceI = huwaiServiceI;
    }

    public int getZaocanServiceI() {
        return zaocanServiceI;
    }

    public void setZaocanServiceI(int zaocanServiceI) {
        this.zaocanServiceI = zaocanServiceI;
    }

    public String getFollowLanguageS() {
        return followLanguageS;
    }

    public void setFollowLanguageS(String followLanguageS) {
        this.followLanguageS = followLanguageS;
    }

    public Double getSlat() {
        return slat;
    }

    public void setSlat(Double slat) {
        this.slat = slat;
    }

    public Double getSlng() {
        return slng;
    }

    public void setSlng(Double slng) {
        this.slng = slng;
    }

    public List<RoomInfo> getRoomInfoList() {
        return roomInfoList;
    }

    public void setRoomInfoList(List<RoomInfo> roomInfoList) {
        this.roomInfoList = roomInfoList;
    }
}
  
