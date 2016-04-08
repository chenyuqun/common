package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:PromotionRules. <br/>
 * date: 2016/4/6 19:20 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("promotionRules")
public class PromotionRules {
    @XStreamAlias("promotionRule")
    private List<PromotionRule> promotionRules;

    public List<PromotionRule> getPromotionRules() {
        return promotionRules;
    }

    public void setPromotionRules(List<PromotionRule> promotionRules) {
        this.promotionRules = promotionRules;
    }
}
