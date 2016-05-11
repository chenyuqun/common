package com.zizaike.entity.open.qunar.response;

import com.ctc.wstx.io.StreamBootstrapper;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.zizaike.entity.open.alibaba.response.ResponseData;
import com.zizaike.entity.open.qunar.request.Customer;
import com.zizaike.entity.open.qunar.request.CustomerInfo;
import com.zizaike.entity.open.qunar.request.QunarOrderInfo;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:OrderQueryResponse. <br/>
 * date: 2016/4/21 14:46 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("wrapperOrderQueryResponse")
public class OrderQueryResponse extends ResponseData {
    /**
     *专门给qunar的订单查询结果
     */
    public QunarOrderInfoResponse orderInfo;

    public QunarOrderInfoResponse getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(QunarOrderInfoResponse orderInfo) {
        this.orderInfo = orderInfo;
    }



}
