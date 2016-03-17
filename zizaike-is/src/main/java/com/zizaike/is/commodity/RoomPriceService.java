/**  
 * Project Name:commodity-service  <br/>
 * File Name:RoomPriceService.java  <br/>
 * Package Name:com.zizaike.commodity.service  <br/>
 * Date:2016年3月14日下午4:37:01  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/

package com.zizaike.is.commodity;

import java.util.Date;
import java.util.List;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.commodity.RoomPrice;

/**
 * ClassName:RoomPriceService <br/>
 * Function: 房价. <br/>
 * Date: 2016年3月14日 下午4:37:01 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public interface RoomPriceService {
    /**
     * 
     * add:增加房价. <br/>
     * 
     * @author snow.zhang
     * @param roomPrice
     * @throws ZZKServiceException
     * @since JDK 1.7
     */
    void insertOrUpdate(List<RoomPrice> list) throws ZZKServiceException;

    /**
     *
     * function:转移所有当天的. <br/>
     *
     * @author alex
     * @throws ZZKServiceException
     * @since JDK 1.7
     */
    void priceHistoryTransfer() throws ZZKServiceException;
    /**
     * 
     * queryByRoomTypeAndDate:查询房间型日期相关. <br/>  
     *  
     * @author snow.zhang  
     * @param userId
     * @param roomTypeId
     * @param start
     * @param end
     * @return
     * @throws ZZKServiceException 
     * @since JDK 1.7
     */
    List<RoomPrice> queryByRoomTypeAndDate(Integer userId,Integer roomTypeId,String start,String end) throws ZZKServiceException;
}
