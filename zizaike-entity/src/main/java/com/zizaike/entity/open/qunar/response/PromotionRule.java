package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:PromotionRule. <br/>
 * date: 2016/4/6 19:20 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("promotionRule")
public class PromotionRule {
    @XStreamAsAttribute
    @XStreamAlias("code")
    private PromotionRuleCode promotionRuleCode;
    @XStreamAsAttribute
    @XStreamAlias("desc")
    private String desc;
    @XStreamAsAttribute
    @XStreamAlias("value")
    private String value;

    public PromotionRuleCode getPromotionRuleCode() {
        return promotionRuleCode;
    }

    public void setPromotionRuleCode(PromotionRuleCode promotionRuleCode) {
        this.promotionRuleCode = promotionRuleCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PromotionRule(PromotionRuleCode promotionRuleCode, String desc, String value) {
        super();
        this.promotionRuleCode = promotionRuleCode;
        this.desc = desc;
        this.value = value;
    }
}
