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
    private int hsRatingAvgI;
    private int userPoiId;
    private String homeStayImage;
    private String username;
    private String address;
    private String userPhoto;
    private String userPoiName;
    private Double distance;
    private String currencyCode;
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

    public int getHsRatingAvgI() {
        return hsRatingAvgI;
    }

    public void setHsRatingAvgI(int hsRatingAvgI) {
        this.hsRatingAvgI = hsRatingAvgI;
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
    
    

}
  
