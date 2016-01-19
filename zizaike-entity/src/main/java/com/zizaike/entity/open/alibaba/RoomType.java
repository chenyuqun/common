/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:RoomType.java  <br/>
 * Package Name:com.zizaike.entity.open.alibaba  <br/>
 * Date:2016年1月19日上午10:44:28  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.alibaba;


/**
 * ClassName:RoomType <br/>
 * Function: 房间类型. <br/>
 * Date: 2016年1月19日 上午10:44:28 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public class RoomType {
    /**
     * 卖家房型ID，不能重复建议格式是:酒店code_房型code
     */
    private String outerId;
    /**
     * 房型名称。不能超过30字
     */
    private String name;
    /**
     * 最大入住人数，默认2（1-99）
     */
    private Long maxOccupancy;
    /**
     * 可选值：A,B,C,D。分别代表： A：15平米以下，B：16－30平米，C：31－50平米，D：50平米以上2）也可以自己定义，比如：40平方米
     */
    private String area;
    /**
     * 客房在建筑的第几层，隔层为1-2层，4-5层，7-8层
     */
    private String floor;

    /**
     * 床型。按自己定义存储，比如：高低床、上下床
     */
    private String bedType;

    /**
     * 床宽。按自己定义存储，比如：2.1米
     */
    private String bedSize;
    /**
     * 宽带服务。A,B,C,D。分别代表： A：无宽带，B：免费宽带，C：收费宽带，D：部分收费宽带
     */
    private String internet;
    /**
     * 设施服务。JSON格式。 value值true有此服务，false没有。 bar：吧台，catv：有线电视，ddd：国内长途电话，idd：国际长途电话，toilet：独立卫生间，pubtoliet：公共卫生间。 如：
     * {"bar":false,"catv":false,"ddd":false,"idd":false,"pubtoilet":false,"toilet":false}
     */
    private String service;
    /**
     * 不要使用
     */
    private String extend;
    /**
     * 0:无窗/1:有窗
     */
    private Long windowType;
    /**
     * 该字段只有确定的时候，才允许填入。用于标示和淘宝房型的匹配关系。目前尚未启动该字段。
     */
    private Long srid;
    /**
     * （必传）商家酒店ID，指明该房型属于哪家酒店
     */
    private String outHid;
    /**
     * 系统商，无申请不可使用
     */
    private String vendor;
    /**
     * 房型图片只支持远程图片，格式如下：[{"url":"http://123.jpg","ismain":"true"},{"url":"http://456.jpg","ismain":"false"},{"url":
     * "http://789.jpg","ismain":"false"}]其中url是远程图片的访问地址，ismain是是否为主图。只能设置一张图片为主图。
     */
    private String pics;

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }

    public void setBedSize(String bedSize) {
        this.bedSize = bedSize;
    }

    public String getBedSize() {
        return this.bedSize;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getBedType() {
        return this.bedType;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getExtend() {
        return this.extend;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFloor() {
        return this.floor;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getInternet() {
        return this.internet;
    }

    public void setMaxOccupancy(Long maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public Long getMaxOccupancy() {
        return this.maxOccupancy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOutHid(String outHid) {
        this.outHid = outHid;
    }

    public String getOutHid() {
        return this.outHid;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public String getPics() {
        return this.pics;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getService() {
        return this.service;
    }

    public void setSrid(Long srid) {
        this.srid = srid;
    }

    public Long getSrid() {
        return this.srid;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setWindowType(Long windowType) {
        this.windowType = windowType;
    }

    public Long getWindowType() {
        return this.windowType;
    }

    public String getApiMethodName() {
        return "taobao.xhotel.roomtype.add";
    }
}
