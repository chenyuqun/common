package com.zizaike.entity.open.qunar.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.request.RequestData;
import com.zizaike.entity.open.qunar.response.Extra;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:OrderQueryRequest. <br/>
 * date: 2016/4/15 18:17 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("wrapperOrderQueryRequest")
public class OrderQueryRequest extends RequestData {
    @XStreamAlias("qunarOrderNum")
    private String qunarOrderNum;
    @XStreamAlias("orderId")
    private String orderId;
    @XStreamAlias("extras")
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

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }
}
