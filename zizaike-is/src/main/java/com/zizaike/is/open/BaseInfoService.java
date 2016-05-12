/**  
 * Project Name:zizaike-is  <br/>
 * File Name:BaseInfoService.java  <br/>
 * Package Name:com.zizaike.is.open  <br/>
 * Date:2016年3月7日下午5:57:25  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.is.open;  

import com.alibaba.fastjson.JSONObject;
import com.zizaike.core.framework.exception.ZZKServiceException;

import com.zizaike.entity.open.QunarRoomInfoDto;

import com.zizaike.entity.open.OpenDiscount;

import com.zizaike.entity.open.RoomInfoDto;

/**  
 * ClassName:BaseInfoService <br/>  
 * Function: 基础信息服务. <br/>
 * Date:     2016年3月7日 下午5:57:25 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public interface BaseInfoService {
    /**
     * 
     * 获取退款政策和早餐信息: <br/>
     *  
     * @author alex 
     * @param nid
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    RoomInfoDto getRefundAndBreakfast(int nid)throws ZZKServiceException;

    /**
     * 自在客房价房态
     * @return
     * @throws ZZKServiceException
     */
    JSONObject getZizaikePrice(String roomId,String checkIn,String checkOut);

    /**
     * 获取qunar专用的RoomInfo
     * @param nid
     * @return
     * @throws ZZKServiceException
     */
    QunarRoomInfoDto getQunarRoomInfo(int nid)throws ZZKServiceException;

    /***
     * getOpenConfig: <br/>
     *
     * @author alex
     * @param openConfig
     * @return
     * @throws ZZKServiceException
     * @since JDK 1.7
     */
    OpenDiscount getOpenDiscount(OpenDiscount openDiscount)throws ZZKServiceException;

}
  
