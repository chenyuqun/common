package com.zizaike.entity.open.ctrip;

import java.io.Serializable;
import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.zizaike.entity.open.XStreamYMDTHMSDateConverter;

@XStreamAlias("RoomPrice")
public class RoomPrice implements Serializable{
    private static final long serialVersionUID = 8478148148826844701L;
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
    private Integer price;
    /**
     * 上个订单卖价金额(原币种),预付一般不传或者传0
     */
    @XStreamAlias("OldPrice")
    private Integer oldPrice;
    /**
     * 汇率后的卖价
     */
    @XStreamAlias("CNYPrice")
    private Integer CNYPrice;
    /**
     * 汇率后的卖价
     */
    @XStreamAlias("Cost")
    private Integer cost;
    /**
     * 汇率后的底价
     */
    @XStreamAlias("CNYCost")
    private Integer CNYCost;
    /**
     * 早餐数量
     */
    @XStreamAlias("BreakFast")
    private Integer breakFast;

    public RoomPrice() {
        
    }

    public Integer getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Integer oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCNYPrice() {
        return CNYPrice;
    }

    public void setCNYPrice(Integer cNYPrice) {
        CNYPrice = cNYPrice;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCNYCost() {
        return CNYCost;
    }

    public void setCNYCost(Integer cNYCost) {
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