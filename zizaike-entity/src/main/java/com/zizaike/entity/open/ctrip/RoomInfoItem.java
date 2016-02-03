/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:RoomInfoItem.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年2月3日下午12:07:06  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip;  
/**  
 * ClassName:RoomInfoItem <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年2月3日 下午12:07:06 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class RoomInfoItem {
    private int stays;
    private String changeDefault;
    private int recommend;
    private int recommendIntl;
    private int holdDeadline;
    private String roomStatus;
    private int roomsInv;
    private int userLimited;
    private String note;
    private int reserveTime;
    /**
     * 保留房可否恢复(T-可，F-不可)
     */
    private String restorable;
    /**
     * 担保（此字段暂时不维护）
     */
    private String guarantee;
    private String checkType;
    private int guaranteeLCT;
    private int prepayLCT;
    private String allNeedGuarantee;
    private int roomGiftID;
    private int lateReserveTime;
    private String deductType;
    public int getStays() {
        return stays;
    }
    public void setStays(int stays) {
        this.stays = stays;
    }
    public String getChangeDefault() {
        return changeDefault;
    }
    public void setChangeDefault(String changeDefault) {
        this.changeDefault = changeDefault;
    }
    public int getRecommend() {
        return recommend;
    }
    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }
    public int getRecommendIntl() {
        return recommendIntl;
    }
    public void setRecommendIntl(int recommendIntl) {
        this.recommendIntl = recommendIntl;
    }
    public int getHoldDeadline() {
        return holdDeadline;
    }
    public void setHoldDeadline(int holdDeadline) {
        this.holdDeadline = holdDeadline;
    }
    public String getRoomStatus() {
        return roomStatus;
    }
    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }
    public int getRoomsInv() {
        return roomsInv;
    }
    public void setRoomsInv(int roomsInv) {
        this.roomsInv = roomsInv;
    }
    public int getUserLimited() {
        return userLimited;
    }
    public void setUserLimited(int userLimited) {
        this.userLimited = userLimited;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public int getReserveTime() {
        return reserveTime;
    }
    public void setReserveTime(int reserveTime) {
        this.reserveTime = reserveTime;
    }
    public String getRestorable() {
        return restorable;
    }
    public void setRestorable(String restorable) {
        this.restorable = restorable;
    }
    public String getGuarantee() {
        return guarantee;
    }
    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }
    public String getCheckType() {
        return checkType;
    }
    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }
    public int getGuaranteeLCT() {
        return guaranteeLCT;
    }
    public void setGuaranteeLCT(int guaranteeLCT) {
        this.guaranteeLCT = guaranteeLCT;
    }
    public String getAllNeedGuarantee() {
        return allNeedGuarantee;
    }
    public void setAllNeedGuarantee(String allNeedGuarantee) {
        this.allNeedGuarantee = allNeedGuarantee;
    }
    public int getRoomGiftID() {
        return roomGiftID;
    }
    public void setRoomGiftID(int roomGiftID) {
        this.roomGiftID = roomGiftID;
    }
    public int getLateReserveTime() {
        return lateReserveTime;
    }
    public void setLateReserveTime(int lateReserveTime) {
        this.lateReserveTime = lateReserveTime;
    }
    public String getDeductType() {
        return deductType;
    }
    public void setDeductType(String deductType) {
        this.deductType = deductType;
    }
    
    public int getPrepayLCT() {
        return prepayLCT;
    }
    public void setPrepayLCT(int prepayLCT) {
        this.prepayLCT = prepayLCT;
    }
    
    
    public RoomInfoItem(int stays, String changeDefault, int recommend, int recommendIntl, int holdDeadline,
            String roomStatus, int roomsInv, int userLimited, String note, int reserveTime, String restorable,
            String guarantee, String checkType, int guaranteeLCT, int prepayLCT, String allNeedGuarantee,
            int roomGiftID, int lateReserveTime, String deductType) {
        super();
        this.stays = stays;
        this.changeDefault = changeDefault;
        this.recommend = recommend;
        this.recommendIntl = recommendIntl;
        this.holdDeadline = holdDeadline;
        this.roomStatus = roomStatus;
        this.roomsInv = roomsInv;
        this.userLimited = userLimited;
        this.note = note;
        this.reserveTime = reserveTime;
        this.restorable = restorable;
        this.guarantee = guarantee;
        this.checkType = checkType;
        this.guaranteeLCT = guaranteeLCT;
        this.prepayLCT = prepayLCT;
        this.allNeedGuarantee = allNeedGuarantee;
        this.roomGiftID = roomGiftID;
        this.lateReserveTime = lateReserveTime;
        this.deductType = deductType;
    }
    public RoomInfoItem(){
        
    }

}
  
