package com.zizaike.entity.open.qunar.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.request.RequestData;
import com.zizaike.entity.open.qunar.response.Extra;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:CancelRequest. <br/>
 * date: 2016/4/15 17:37 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("cancelRequest")
public class CancelRequest extends RequestData {
    @XStreamAlias("quanrOrderNum")
    private String qunarOrderNum;
    @XStreamAlias("orderId")
    private String orderId;
    @XStreamAlias("requiredAction")
    private String requiredAction;
    @XStreamAlias("reason")
    private String reason;

    private List<Extra> extras;

    public String getQunarOrderNum() {
        return qunarOrderNum;
    }

    public void setQunarOrderNum(String qunarOrderNum) {
        this.qunarOrderNum = qunarOrderNum;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRequiredAction() {
        return requiredAction;
    }

    public void setRequiredAction(String requiredAction) {
        this.requiredAction = requiredAction;
    }

    public String getReson() {
        return reason;
    }

    public void setReson(String reason) {
        this.reason = reason;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "CancelRequest [qunarOrderNum=" + qunarOrderNum + ", orderId=" + orderId + ", requiredAction="
                + requiredAction + ", reason=" + reason + ", extras=" + extras + "]";
    }

}

