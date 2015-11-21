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
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = -7333138315217342971L;
    
 private String keyWords;
    
    private int destId;
    /*
     * 要变成location_typeid 
     */
    private int searcid;
    
    private Date checkInDate;
    
    private Date checkOutDate;
    
    private RecommendType recommendType;
    
    private int page;
    
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

    public int getSearcid() {
        return searcid;
    }

    public void setSearcid(int searcid) {
        this.searcid = searcid;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public RecommendType getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(RecommendType recommendType) {
        this.recommendType = recommendType;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    
   
    
}
  
