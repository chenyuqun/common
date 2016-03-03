/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:MappingInfoEntity.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip.vo  <br/>
 * Date:2016年3月2日下午6:51:03  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip.vo;  

import java.io.Serializable;

import com.zizaike.entity.open.ctrip.BalanceType;
import com.zizaike.entity.open.ctrip.MappingType;
import com.zizaike.entity.open.ctrip.SetMappingOperateType;
import com.zizaike.entity.open.ctrip.SetType;

/**  
 * ClassName:MappingInfoEntity <br/>  
 * Function: MappingInfo. <br/>  
 * Date:     2016年3月2日 下午6:51:03 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class SetMappingInfoVo implements Serializable{

    private static final long serialVersionUID = 9158837008440893103L;
   /**
    * 母酒店
    */
    private String masterHotel;
    /**
     * 母房间
     */
    private String masterRoom;
    /**
     * 子酒店
     */
    private String hotel;
    /**
     * 子房间
     */
    private String room;
    /**
     * 价格计划
     */
    private String ratePlanCode;
    /**
     * 自在客酒店id
     */
    private String hotelGroupHotelCode;
    /**
     * 自在客房型id
     */
    private String hotelGroupRoomTypeCode;
    /**
     * 自在客价格计划id
     */
    private String hotelGroupRatePlanCode;
    /**
     * 自在客房间名
     */
    private String hotelGroupRoomName;
    /**
     * 价格类型
     */
    private BalanceType balanceType;
    /**
     * 获取信息类型
     */
    private MappingType mappingType;
    /**
     * 操作类型
     */
    private SetMappingOperateType setMappingOperateType;
    /**
     * 设置类型
     */
    private SetType setType;
    public String getMasterHotel() {
        return masterHotel;
    }
    public void setMasterHotel(String masterHotel) {
        this.masterHotel = masterHotel;
    }
    public String getMasterRoom() {
        return masterRoom;
    }
    public void setMasterRoom(String masterRoom) {
        this.masterRoom = masterRoom;
    }
    public String getHotel() {
        return hotel;
    }
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public String getRatePlanCode() {
        return ratePlanCode;
    }
    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }
    public String getHotelGroupHotelCode() {
        return hotelGroupHotelCode;
    }
    public void setHotelGroupHotelCode(String hotelGroupHotelCode) {
        this.hotelGroupHotelCode = hotelGroupHotelCode;
    }
    public String getHotelGroupRoomTypeCode() {
        return hotelGroupRoomTypeCode;
    }
    public void setHotelGroupRoomTypeCode(String hotelGroupRoomTypeCode) {
        this.hotelGroupRoomTypeCode = hotelGroupRoomTypeCode;
    }
    public String getHotelGroupRatePlanCode() {
        return hotelGroupRatePlanCode;
    }
    public void setHotelGroupRatePlanCode(String hotelGroupRatePlanCode) {
        this.hotelGroupRatePlanCode = hotelGroupRatePlanCode;
    }
    public String getHotelGroupRoomName() {
        return hotelGroupRoomName;
    }
    public void setHotelGroupRoomName(String hotelGroupRoomName) {
        this.hotelGroupRoomName = hotelGroupRoomName;
    }
    public BalanceType getBalanceType() {
        return balanceType;
    }
    public void setBalanceType(BalanceType balanceType) {
        this.balanceType = balanceType;
    }
    public MappingType getMappingType() {
        return mappingType;
    }
    public void setMappingType(MappingType mappingType) {
        this.mappingType = mappingType;
    }
    public SetType getSetType() {
        return setType;
    }
    public void setSetType(SetType setType) {
        this.setType = setType;
    }
    
    public SetMappingOperateType getSetMappingOperateType() {
        return setMappingOperateType;
    }
    public void setSetMappingOperateType(SetMappingOperateType setMappingOperateType) {
        this.setMappingOperateType = setMappingOperateType;
    }
    @Override
    public String toString() {
        return "SetMappingInfoVo [masterHotel=" + masterHotel + ", masterRoom=" + masterRoom + ", hotel=" + hotel
                + ", room=" + room + ", ratePlanCode=" + ratePlanCode + ", hotelGroupHotelCode=" + hotelGroupHotelCode
                + ", hotelGroupRoomTypeCode=" + hotelGroupRoomTypeCode + ", hotelGroupRatePlanCode="
                + hotelGroupRatePlanCode + ", hotelGroupRoomName=" + hotelGroupRoomName + ", balanceType="
                + balanceType + ", mappingType=" + mappingType + ", setMappingOperateType=" + setMappingOperateType
                + ", setType=" + setType + "]";
    }
    
    

}
  
