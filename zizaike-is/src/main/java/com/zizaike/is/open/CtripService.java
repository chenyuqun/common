/**  
 * Project Name:zizaike-is  <br/>
 * File Name:CtripService.java  <br/>
 * Package Name:com.zizaike.is.open  <br/>
 * Date:2016年2月3日下午3:09:50  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.is.open;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.open.alibaba.Rates;
import com.zizaike.entity.open.ctrip.GetHotelInfoResponse;
import com.zizaike.entity.open.ctrip.GetMappingInfoResponseList;
import com.zizaike.entity.open.ctrip.HotelGroupInterfaceRoomTypeEntity;
import com.zizaike.entity.open.ctrip.vo.HotelGroupInterfaceRoomTypeVo;
import com.zizaike.entity.open.ctrip.vo.MappingInfoVo;
import com.zizaike.entity.open.ctrip.vo.SetMappingInfoVo;

/**
 * ClassName:CtripService <br/>
 * Function: 携程服务. <br/>
 * Date: 2016年2月3日 下午3:09:50 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public interface CtripService {
    
    String  service (String request)throws ZZKServiceException;
    /**
     * 
     * updateRates:更新价格. <br/>    
     *  
     * @author alex 
     * @param object  
     * @since JDK 1.7
     */
    void updateRates(Rates object) throws ZZKServiceException;
    /**
     * 
     * setMappingInfo:设置mappingInfo. <br/>  
     *  
     * @author snow.zhang  
     * @param map
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    void setMappingInfo(SetMappingInfoVo setMappingInfoVo )throws ZZKServiceException;
    /**
     * 
     * getHotelInfo:得到酒店信息. <br/>  
     *  
     * @author snow.zhang
     * @param currentPage 当前页数  
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    GetHotelInfoResponse getHotelInfo(Integer currentPage )throws ZZKServiceException;
    /**
     * 
     * getMappingInfo:得到mappinfo. <br/>  
     *  
     * @author snow.zhang  
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    GetMappingInfoResponseList getMappingInfo(MappingInfoVo mappingInfoEntity)throws ZZKServiceException;
    /**
     * 
     * getCtripRoomTypeInfo:户型对照表. <br/>  
     *  
     * @author snow.zhang  
     * @param hotelGroupInterfaceRoomTypeVo
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    public HotelGroupInterfaceRoomTypeEntity getCtripRoomTypeInfo(HotelGroupInterfaceRoomTypeVo hotelGroupInterfaceRoomTypeVo)throws ZZKServiceException;
    
}
