package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:OptionRule. <br/>
 * date: 2016/4/6 17:46 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("optionRule")
public class OptionRule{
    @XStreamAsAttribute
    @XStreamAlias("code")
    private OptionRuleCode code;
    @XStreamAsAttribute
    @XStreamAlias("desc")
    private String desc;

    @XStreamAsAttribute
    @XStreamAlias("price")
    private String price;

    @XStreamAsAttribute
    @XStreamAlias("unitOfCharge")
    private UnitOfCharge unitOfCharge;
    @XStreamAsAttribute
    @XStreamAlias("isInRoomRate")
    private Boolean isInRoomRate;


    public OptionRuleCode getCode() {
        return code;
    }

    public void setCode(OptionRuleCode code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public UnitOfCharge getUnitOfCharge() {
        return unitOfCharge;
    }

    public void setUnitOfCharge(UnitOfCharge unitOfCharge) {
        this.unitOfCharge = unitOfCharge;
    }

    public Boolean getInRoomRate() {
        return isInRoomRate;
    }

    public void setInRoomRate(Boolean inRoomRate) {
        isInRoomRate = inRoomRate;
    }

    public OptionRule(OptionRuleCode code, String desc, String price, UnitOfCharge unitOfCharge, Boolean isInRoomRate) {
        super();
        this.code = code;
        this.desc = desc;
        this.price = price;
        this.unitOfCharge = unitOfCharge;
        this.isInRoomRate = isInRoomRate;
    }
}

