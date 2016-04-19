package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:NonRefundableRange. <br/>
 * date: 2016/4/6 14:28 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("nonRefundableRange")
public class NonRefundableRange {
    @XStreamAsAttribute
    @XStreamAlias("fromDate")
    private String fromDate;

    @XStreamAsAttribute
    @XStreamAlias("toDate")
    private String toDate;

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public NonRefundableRange(String fromDate, String toDate) {
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "NonRefundableRange [fromDate=" + fromDate + ", toDate=" + toDate + "]";
    }
    
}
