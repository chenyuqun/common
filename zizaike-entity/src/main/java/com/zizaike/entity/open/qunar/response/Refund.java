package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:Refund. <br/>
 * date: 2016/4/6 14:21 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("refund")
public class Refund {
    @XStreamAsAttribute
    @XStreamAlias("refund")
    private Boolean returnable;
    @XStreamAsAttribute
    @XStreamAlias("timeZone")
    private String timeZone;
    @XStreamAlias("refundRules")
    private List<RefundRule> refundRules;
    @XStreamAlias("nonRefundableRanges")
    private List<NonRefundableRange> nonRefundableRanges;

    public Boolean getReturnable() {
        return returnable;
    }

    public void setReturnable(Boolean returnable) {
        this.returnable = returnable;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public List<RefundRule> getRefundRules() {
        return refundRules;
    }

    public void setRefundRules(List<RefundRule> refundRules) {
        this.refundRules = refundRules;
    }

    public List<NonRefundableRange> getNonRefundableRanges() {
        return nonRefundableRanges;
    }

    public void setNonRefundableRanges(List<NonRefundableRange> nonRefundableRanges) {
        this.nonRefundableRanges = nonRefundableRanges;
    }
}
