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
import com.zizaike.entity.open.alibaba.Hotel;
import com.zizaike.entity.open.alibaba.RatePlan;
import com.zizaike.entity.open.alibaba.Rates;
import com.zizaike.entity.open.alibaba.RoomType;

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
     * addHotel:添加房间. <br/>  
     * @author alex 
     * @param hotel  
     * @since JDK 1.7
     */
    void addHotel(Hotel hotel);
    /**
     * 
     * updateHotel:  
     * @author alex 
     * @param hotel  
     * @since JDK 1.7  
     */
    void updateHotel(Hotel hotel);
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
    /**
     * 
     * addRatePlan:添加价格计划
     * @author alex 
     * @param object  
     * @since JDK 1.7
     */
    void addRatePlan(RatePlan object);
    /**
     * 
     * updateRatePlan:更新价格计划. <br/>  
     * @author alex 
     * @param object  
     * @since JDK 1.7
     */
    void updateRatePlan(RatePlan object);
    /**
     * 
     * updateRates:更新房态房价. <br/>  
     *  
     * @author alex 
     * @param object  
     * @since JDK 1.7
     */
    void updateRates(Rates object);
    
    
}
