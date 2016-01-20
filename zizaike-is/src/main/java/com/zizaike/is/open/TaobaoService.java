/**  
 * Project Name:open-api  <br/>
 * File Name:TaobaoService.java  <br/>
 * Package Name:com.zizaike.open.service  <br/>
 * Date:2016年1月13日下午3:48:27  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.is.open;

import com.zizaike.entity.open.alibaba.request.BookRQRequest;
import com.zizaike.entity.open.alibaba.request.CancelRQRequest;
import com.zizaike.entity.open.alibaba.request.QueryStatusRQRequest;
import com.zizaike.entity.open.alibaba.request.ValidateRQRequest;
import com.zizaike.entity.open.alibaba.response.BookRQResponse;
import com.zizaike.entity.open.alibaba.response.CancelRQResponse;
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
    ValidateRQResponse validateRQ(ValidateRQRequest validateRQRequest);

    /**
     * 
     * bookRQ:预定接口. <br/>
     * 
     * @author snow.zhang
     * @param bookRQRequest
     * @return
     * @since JDK 1.7
     */
    BookRQResponse bookRQ(BookRQRequest bookRQRequest);

    /**
     * 
     * queryStatusRQ:查询订单. <br/>
     * 
     * @author snow.zhang
     * @param queryStatusRQRequest
     * @return
     * @since JDK 1.7
     */
    QueryStatusRQResponse queryStatusRQ(QueryStatusRQRequest queryStatusRQRequest);

    /**
     * 
     * cancelRQ:取消订单. <br/>
     * 
     * @author snow.zhang
     * @param cancelRQRequest
     * @return
     * @since JDK 1.7
     */
    CancelRQResponse cancelRQ(CancelRQRequest cancelRQRequest);

    String  service (String request);

}
