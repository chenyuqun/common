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
import com.zizaike.entity.open.alibaba.RoomType;
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

    String  service (String request)throws ZZKServiceException;
    /**
     * 
     * updateRoomType:更新房型. <br/>  
     *  
     * @author snow.zhang
     * @param object  
     * @since JDK 1.7
     */
    void updateRoomType(RoomType object);
    /**
     * 
     * addRoomType:添加房型. <br/>  
     *  
     * @author snow.zhang  
     * @param object  
     * @since JDK 1.7
     */
    void addRoomType(RoomType object);
}
