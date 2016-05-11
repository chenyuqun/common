package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:RefundRule. <br/>
 * date: 2016/4/6 14:27 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("refundRule")
public class RefundRule {
    @XStreamAsAttribute
    @XStreamAlias("before")
    private Integer before;

    @XStreamAsAttribute
    @XStreamAlias("type")
    private RefundType refundType;

    /**
     * Number抽象类转xml会把类型带出来
     */
    @XStreamAsAttribute
    @XStreamAlias("value")
    private String value;

    public Integer getBefore() {
        return before;
    }

    public void setBefore(Integer before) {
        this.before = before;
    }

    public RefundType getRefundType() {
        return refundType;
    }

    public void setRefundType(RefundType refundType) {
        this.refundType = refundType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public RefundRule(Integer before, RefundType refundType, String value) {
        this.before = before;
        this.refundType = refundType;
        this.value = value;
    }
}
