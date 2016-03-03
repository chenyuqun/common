/**  
 * Project Name:zizaike-is  <br/>
 * File Name:UserService.java  <br/>
 * Package Name:com.zizaike.is.open  <br/>
 * Date:2016年1月19日下午6:21:09  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.is.open;  

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.open.OpenChannelType;
import com.zizaike.entity.open.RoomTypeMapping;

public interface RoomTypeMappingService {
    /**
     * 
     * queryByHotelIdAndOpenRoomTypeId. <br/>  
     *  
     * @author snow.zhang  
     * @param openHotelId
     * @param openRoomTypeId
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    RoomTypeMapping queryByHotelIdAndOpenRoomTypeId(String openHotelId,String openRoomTypeId,OpenChannelType openChannelType) throws ZZKServiceException;
    /**
     * 
     * queryByRoomTypeId. <br/>
     * @author alex 
     * @param roomTypeId
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    RoomTypeMapping queryByRoomTypeId(String roomTypeId) throws ZZKServiceException;
    /**
     * 
     * addOrUpdate:添加更新 <br/>  
     *  
     * @author snow.zhang  
     * @param roomTypeMapping
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    void addOrUpdate(RoomTypeMapping roomTypeMapping) throws ZZKServiceException;
}
  
