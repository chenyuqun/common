/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SearchWordsVo.java  <br/>
 * Package Name:com.zizaike.entity.solr  <br/>
 * Date:2015年11月21日下午4:14:33  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.solr;

import com.zizaike.entity.base.ChannelType;

/**
 * 
 * ClassName: ServiceSearchVo <br/>
 * Function: 服务查询. <br/>
 * date: 2016年4月20日 下午1:38:58 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public class ServiceSearchVo implements java.io.Serializable {

    private static final long serialVersionUID = -3375780357306059843L;
    /**
     * 国家
     */
    private Integer destId;
    /**
     * 服务类型
     */
    private BNBServiceType serviceType;

    /**
     * 渠道 0 手机(默认),1 web
     */
    private ChannelType channel = ChannelType.APP;

    /**
     * 多语言
     */
    private int multilang;
    /**
     * 当前页
     */
    private int page;
    /**
     * 查询类型
     */
    private SearchType searchType;
    /*
     * 要变成location_type_id/poi_id
     */
    private Integer searchid;
    /**
     * 用户id
     */
    private Integer userId;
    
    /**
     * 搜索半径
     */
    private Float searchRadius;
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getSearchRadius() {
        return searchRadius;
    }

    public void setSearchRadius(Float searchRadius) {
        this.searchRadius = searchRadius;
    }
    
    public Integer getSearchid() {
        return searchid;
    }

    public void setSearchid(Integer searchid) {
        this.searchid = searchid;
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

    public ChannelType getChannel() {
        return channel;
    }

    public void setChannel(ChannelType channel) {
        this.channel = channel;
    }

    
    
    public Integer getDestId() {
        return destId;
    }

    public void setDestId(Integer destId) {
        this.destId = destId;
    }

    public BNBServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(BNBServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public int getMultilang() {
        return multilang;
    }

    public void setMultilang(int multilang) {
        this.multilang = multilang;
    }

}
