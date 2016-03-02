package com.zizaike.entity.open.ctrip.vo;  

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.request.RequestData;

/**
 * 
 * ClassName: GetHotelInfoResponse <br/>  
 * Function: GetCtripRoomTypeInfo 信息. <br/>  
 * date: 2016年2月29日 下午6:35:03 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class HotelGroupInterfaceRoomTypeVo extends RequestData implements Serializable{
    private static final long serialVersionUID = 1290354413204068391L;
    /**
     * 自在客房型id
     */
    @XStreamAlias("HotelGroupRoomTypeCode")
    private Integer hotelGroupRoomTypeCode;
    /**
     * 自在客酒店id
     */
    @XStreamAlias("HotelGroupHotelCode")
    private Integer hotelGroupHotelCode;
    /**
     * 自在客价格计划
     */
    @XStreamAlias("HotelGroupRatePlanCode")
    private Integer hotelGroupRatePlanCode;
    

    public Integer getHotelGroupRoomTypeCode() {
        return hotelGroupRoomTypeCode;
    }

    public void setHotelGroupRoomTypeCode(Integer hotelGroupRoomTypeCode) {
        this.hotelGroupRoomTypeCode = hotelGroupRoomTypeCode;
    }


    public Integer getHotelGroupHotelCode() {
        return hotelGroupHotelCode;
    }

    public void setHotelGroupHotelCode(Integer hotelGroupHotelCode) {
        this.hotelGroupHotelCode = hotelGroupHotelCode;
    }

    public Integer getHotelGroupRatePlanCode() {
        return hotelGroupRatePlanCode;
    }

    public void setHotelGroupRatePlanCode(Integer hotelGroupRatePlanCode) {
        this.hotelGroupRatePlanCode = hotelGroupRatePlanCode;
    }

    @Override
    public String toString() {
        return "HotelGroupInterfaceRoomTypeVo [hotelGroupRoomTypeCode=" + hotelGroupRoomTypeCode
                + ", hotelGroupHotelCode=" + hotelGroupHotelCode + ", hotelGroupRatePlanCode=" + hotelGroupRatePlanCode
                + "]";
    }

        
    
}
  
