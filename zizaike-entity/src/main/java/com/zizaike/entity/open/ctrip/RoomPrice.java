package com.zizaike.entity.open.ctrip;

import java.io.Serializable;
import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.zizaike.entity.open.XStreamYMDTHMSDateConverter;

@XStreamAlias("RoomPrice")
public class RoomPrice implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 入住日期
     */
    @XStreamAlias("EffectDate")
    @XStreamConverter(value = XStreamYMDTHMSDateConverter.class)
    private Date effectDate;
    /**
     * 价格
     */
    @XStreamAlias("Price")
    private Float price;
    /**
     * 上个订单卖价金额(原币种),预付一般不传或者传0
     */
    @XStreamAlias("OldPrice")
    private Float oldPrice;
    /**
     * 汇率后的卖价
     */
    @XStreamAlias("CNYPrice")
    private Float CNYPrice;
    /**
     * 汇率后的卖价
     */
    @XStreamAlias("Cost")
    private Float cost;
    /**
     * 汇率后的底价
     */
    @XStreamAlias("CNYCost")
    private Float CNYCost;
    /**
     * 早餐数量
     */
    @XStreamAlias("BreakFast")
    private Integer breakFast;

    public RoomPrice() {
        
    }

    public Float getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Float oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getCNYPrice() {
        return CNYPrice;
    }

    public void setCNYPrice(Float cNYPrice) {
        CNYPrice = cNYPrice;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Float getCNYCost() {
        return CNYCost;
    }

    public void setCNYCost(Float cNYCost) {
        CNYCost = cNYCost;
    }

    public Integer getBreakFast() {
        return breakFast;
    }

    public void setBreakFast(Integer breakFast) {
        this.breakFast = breakFast;
    }

    @Override
    public String toString() {
        return "RoomPrice [effectDate=" + effectDate + ", price=" + price + ", oldPrice=" + oldPrice + ", CNYPrice="
                + CNYPrice + ", cost=" + cost + ", CNYCost=" + CNYCost + ", breakFast=" + breakFast + "]";
    }

}