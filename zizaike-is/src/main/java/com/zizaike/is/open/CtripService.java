/**  
 * Project Name:zizaike-is  <br/>
 * File Name:CtripService.java  <br/>
 * Package Name:com.zizaike.is.open  <br/>
 * Date:2016年2月3日下午3:09:50  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.is.open;

import java.util.Map;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.open.alibaba.Rates;
import com.zizaike.entity.open.ctrip.GetHotelInfoResponse;
import com.zizaike.entity.open.ctrip.request.DomesticCheckRoomAvailRequest;
import com.zizaike.entity.open.ctrip.response.DomesticCheckRoomAvailResponse;

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
    /**
     * 
     * domesticCheckRoomAvail:可定检查. <br/>
     * 
     * @author snow.zhang
     * @param domesticCheckRoomAvailRequest
     * @return
     * @throws ZZKServiceException
     * @since JDK 1.7
     */
    DomesticCheckRoomAvailResponse domesticCheckRoomAvail(DomesticCheckRoomAvailRequest domesticCheckRoomAvailRequest)
            throws ZZKServiceException;
    
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
    void setMappingInfo(Map<String,String> map )throws ZZKServiceException;
    /**
     * 
     * getHotelInfo:得到酒店信息. <br/>  
     *  
     * @author snow.zhang  
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    GetHotelInfoResponse getHotelInfo( )throws ZZKServiceException;
    
}
