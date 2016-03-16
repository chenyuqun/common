/**  
 * Project Name:commodity-service  <br/>
 * File Name:RoomPriceService.java  <br/>
 * Package Name:com.zizaike.commodity.service  <br/>
 * Date:2016年3月14日下午4:37:01  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/

package com.zizaike.is.commodity;

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
    void updateBatch(List<RoomPrice> list) throws ZZKServiceException;
}
