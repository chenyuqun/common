package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.request.RequestData;

/**
 * Project Name: code <br/>
 * Function:QunarOrderQueryResponse. <br/>
 * date: 2016/6/3 16:08 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("qunarOrderQueryResponse")
public class QunarOrderQueryResponse extends RequestData {
    private OrderInfoResponse orderInfoResponse;

    public OrderInfoResponse getOrderInfoResponse() {
        return orderInfoResponse;
    }

    public void setOrderInfoResponse(OrderInfoResponse orderInfoResponse) {
        this.orderInfoResponse = orderInfoResponse;
    }
}
