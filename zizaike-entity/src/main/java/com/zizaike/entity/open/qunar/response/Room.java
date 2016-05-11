package com.zizaike.entity.open.qunar.response;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:Room. <br/>
 * date: 2016/4/5 14:09 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("room")
public class Room {
    @XStreamAsAttribute
    @XStreamAlias("id")
    private String id;

    @XStreamAsAttribute
    @XStreamAlias("name")
    private String name;
    /**
     * PREPAY：预付、SPOTPAY：现付
     */
    @XStreamAsAttribute
    @XStreamAlias("payType")
    private PayType payType;

    @XStreamAsAttribute
    @XStreamAlias("prices")
    private String prices;

    @XStreamAsAttribute
    @XStreamAlias("status")
    private String status;

    @XStreamAsAttribute
    @XStreamAlias("counts")
    private String counts;

    @XStreamAsAttribute
    @XStreamAlias("roomRate")
    private String roomRate;

    @XStreamAsAttribute
    @XStreamAlias("taxAndFee")
    private String taxAndFee;

    @XStreamAsAttribute
    @XStreamAlias("broadband")
    private String broadband;

    @XStreamAsAttribute
    @XStreamAlias("wifi")
    private String wifi;

    @XStreamAsAttribute
    @XStreamAlias("maxOccupancy")
    private Integer maxOccupancy;

    @XStreamAsAttribute
    @XStreamAlias("occupancyNumber")
    private Integer occupancyNumber;

    @XStreamAsAttribute
    @XStreamAlias("instantConfirmRoomCount")
    private String instantConfirmRoomCount;

    @XStreamAsAttribute
    @XStreamAlias("freeChildrenNumber")
    private Integer freeChildrenNumber;

    @XStreamAsAttribute
    @XStreamAlias("freeChildrenAgeLimit")
    private Integer freeChildrenAgeLimit;

    @XStreamAsAttribute
    @XStreamAlias("checkinTime")
    private String checkinTime;

    @XStreamAsAttribute
    @XStreamAlias("checkoutTime")
    private String checkoutTime;

    @XStreamAsAttribute
    @XStreamAlias("area")
    private String area;

    /**
     * 床型信息 room必要节点
     */
    @XStreamAlias("bedType")
    private BedType bedType;

    /**
     * 早餐信息 room必要节点
     */
    @XStreamAlias("meal")
    private Meal meal;

    /**
     * refund是room的可选节点。如果无此节点则意味着消费者在去哪儿网不可退订。
     */
    @XStreamAlias("refund")
    private Refund refund;

    /**
     * remarks是room的可选节点。一些提示消费者的信息。
     */
    private List<Remark> remarks;

    /**
     *optionRules是room的可选节点。 设施等等
     */
    private List<OptionRule> optionRules;

    /**
     *promotionRules是room的可选节点。促销信息
     */
    private List<PromotionRule> promotionRules;

    /**
     *  有时代理商需要在<room>节点附加额外的信息，在预订( <bookingRequest>中)时可回传此信息。
     */
    private List<Extra> extras;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCounts() {
        return counts;
    }

    public void setCounts(String counts) {
        this.counts = counts;
    }

    public String getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(String roomRate) {
        this.roomRate = roomRate;
    }

    public String getTaxAndFee() {
        return taxAndFee;
    }

    public void setTaxAndFee(String taxAndFee) {
        this.taxAndFee = taxAndFee;
    }

    public String getBroadband() {
        return broadband;
    }

    public void setBroadband(String broadband) {
        this.broadband = broadband;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(Integer maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public Integer getOccupancyNumber() {
        return occupancyNumber;
    }

    public void setOccupancyNumber(Integer occupancyNumber) {
        this.occupancyNumber = occupancyNumber;
    }

    public String getInstantConfirmRoomCount() {
        return instantConfirmRoomCount;
    }

    public void setInstantConfirmRoomCount(String instantConfirmRoomCount) {
        this.instantConfirmRoomCount = instantConfirmRoomCount;
    }

    public Integer getFreeChildrenNumber() {
        return freeChildrenNumber;
    }

    public void setFreeChildrenNumber(Integer freeChildrenNumber) {
        this.freeChildrenNumber = freeChildrenNumber;
    }

    public Integer getFreeChildrenAgeLimit() {
        return freeChildrenAgeLimit;
    }

    public void setFreeChildrenAgeLimit(Integer freeChildrenAgeLimit) {
        this.freeChildrenAgeLimit = freeChildrenAgeLimit;
    }

    public String getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }

    public String getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(String checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public Refund getRefund() {
        return refund;
    }

    public void setRefund(Refund refund) {
        this.refund = refund;
    }
    
    public List<Remark> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
    }

    public List<OptionRule> getOptionRules() {
        return optionRules;
    }

    public void setOptionRules(List<OptionRule> optionRules) {
        this.optionRules = optionRules;
    }

    public List<PromotionRule> getPromotionRules() {
        return promotionRules;
    }

    public void setPromotionRules(List<PromotionRule> promotionRules) {
        this.promotionRules = promotionRules;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }
    
}
