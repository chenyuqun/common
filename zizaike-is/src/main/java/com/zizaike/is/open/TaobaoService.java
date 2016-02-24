/**  
 * Project Name:open-api  <br/>
 * File Name:TaobaoService.java  <br/>
 * Package Name:com.zizaike.open.service  <br/>
 * Date:2016年1月13日下午3:48:27  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.is.open;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.open.alibaba.request.BookRQRequest;
import com.zizaike.entity.open.alibaba.request.CancelRQRequest;
import com.zizaike.entity.open.alibaba.request.OrderRefundRQRequest;
import com.zizaike.entity.open.alibaba.request.QueryStatusRQRequest;
import com.zizaike.entity.open.alibaba.request.ValidateRQRequest;
import com.zizaike.entity.open.alibaba.response.BookRQResponse;
import com.zizaike.entity.open.alibaba.response.CancelRQResponse;
import com.zizaike.entity.open.alibaba.response.OrderRefundRQResponse;
import com.zizaike.entity.open.alibaba.response.QueryStatusRQResponse;
import com.zizaike.entity.open.alibaba.response.ValidateRQResponse;

/**
 * ClassName:TaobaoService <br/>
 * Function: . <br/>
 * Date: 2016年1月13日 下午3:48:27 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public interface TaobaoService {
    /**
     * 
     * validateRQ:验证价格库存接口. <br/>
     * 
     * @author snow.zhang
     * @param validateRQRequest
     * @return
     * @since JDK 1.7
     */
    ValidateRQResponse validateRQ(ValidateRQRequest validateRQRequest)throws ZZKServiceException;

    /**
     * 
     * bookRQ:预定接口. <br/>
     * 
     * @author snow.zhang
     * @param bookRQRequest
     * @return
     * @since JDK 1.7
     */
    BookRQResponse bookRQ(BookRQRequest bookRQRequest)throws ZZKServiceException;

    /**
     * 
     * queryStatusRQ:查询订单. <br/>
     * 
     * @author snow.zhang
     * @param queryStatusRQRequest
     * @return
     * @since JDK 1.7
     */
    QueryStatusRQResponse queryStatusRQ(QueryStatusRQRequest queryStatusRQRequest)throws ZZKServiceException;

    /**
     * 
     * cancelRQ:取消订单. <br/>
     * 
     * @author snow.zhang
     * @param cancelRQRequest
     * @return
     * @since JDK 1.7
     */
    CancelRQResponse cancelRQ(CancelRQRequest cancelRQRequest)throws ZZKServiceException;
    /**
     * 
     * orderRefundRQ:取消订单,付款. <br/>  
     *  
     * @author snow.zhang  
     * @param orderRefundRQRequest
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    OrderRefundRQResponse orderRefundRQ(OrderRefundRQRequest orderRefundRQRequest)throws ZZKServiceException;

    String  service (String request)throws ZZKServiceException;

}
