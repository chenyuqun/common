/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SearchWordsVo.java  <br/>
 * Package Name:com.zizaike.entity.solr  <br/>
 * Date:2015年11月21日下午4:14:33  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.solr;  

import java.util.Date;

import com.zizaike.entity.recommend.Recommend;
import com.zizaike.entity.recommend.RecommendType;

/**  
 * ClassName:SearchWordsVo <br/>  
 * Function: 输入条件. <br/> 
 * Date:     2015年11月21日 下午4:14:33 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class SearchWordsVo implements java.io.Serializable {

    /**  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = -7333138315217342971L;
    
    private String keyWords;
    
    private int destId;
    /*
     * 要变成location_typeid 
     */
    private int searchid;
    
    private String checkInDate;
    
    private String checkOutDate;
    
    private SearchType searchType;
    
    private int page;
    
    private String service;
    
    private int roomModel;
    /*
     * 100,800
     */
    private String price;
    /*
     * 1.推荐排序(默认)2 价格从高到低 3 价格从低到高 4 好评优先
     */
    private int order;
    
    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public int getDestId() {
        return destId;
    }

    public void setDestId(int destId) {
        this.destId = destId;
    }

    public int getSearchid() {
        return searchid;
    }

    public void setSearchid(int searchid) {
        this.searchid = searchid;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getRoomModel() {
        return roomModel;
    }

    public void setRoomModel(int roomModel) {
        this.roomModel = roomModel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    
    
    
   
    
}
  
