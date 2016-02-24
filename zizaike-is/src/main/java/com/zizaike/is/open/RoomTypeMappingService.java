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
    RoomTypeMapping queryByHotelIdAndOpenRoomTypeId(String openHotelId,String openRoomTypeId) throws ZZKServiceException;
}
  
