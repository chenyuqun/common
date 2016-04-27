package com.zizaike.entity.recommend;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONType;
import com.zizaike.core.common.ranslator.Translate;

/**
 * 
 * ClassName: DestConfig <br/>  
 * Function: 国家相关信息. <br/>  
 * date: 2015年11月19日 上午11:10:52 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
@JSONType(ignores={"id","domain","payChannel","status","typeDesc"})
public class DestConfig implements Serializable{
    private static final long serialVersionUID = -4665743384988031542L;
    private Integer id;
    /**
     * 国家id
     */
    private Integer destId;
    /**
     * 域
     */
    private String domain;
    /**
     * 默认语言
     */
    private String defaultLanguage;

    private String payChannel;
    /**
     * 汇率
     */
    private Double exchangeRate;

    private Integer status;
    
    private String currencyIosCode;

    private String currencyCode;
    /**
     * 换算后价格
     */
    private Integer price;
    @Translate
    private String destName;
    
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCurrencyIosCode() {
        return currencyIosCode;
    }

    public void setCurrencyIosCode(String currencyIosCode) {
        this.currencyIosCode = currencyIosCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    @Override
    public String toString() {
        return "DestConfig [id=" + id + ", destId=" + destId + ", domain=" + domain + ", defaultLanguage="
                + defaultLanguage + ", payChannel=" + payChannel + ", exchangeRate=" + exchangeRate + ", status="
                + status + ", currencyIosCode=" + currencyIosCode + ", currencyCode=" + currencyCode + ", destName="
                + destName + "]";
    }
    
}