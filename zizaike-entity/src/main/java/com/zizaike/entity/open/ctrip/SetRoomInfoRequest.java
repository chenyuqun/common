/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SetRoomInfoRequest.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年2月3日上午11:53:25  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip;  

import java.util.Date;
import java.util.List;

/**  
 * ClassName:SetRoomInfoRequest <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年2月3日 上午11:53:25 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class SetRoomInfoRequest {
    private List<RoomInfoItem> roomInfoItems;
    private int roomID;
    private String startDate;
    private String endDate;
    private String editer;
    public List<RoomInfoItem> getRoomInfoItems() {
        return roomInfoItems;
    }
    public void setRoomInfoItems(List<RoomInfoItem> roomInfoItems) {
        this.roomInfoItems = roomInfoItems;
    }
    public int getRoomID() {
        return roomID;
    }
    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getEditer() {
        return editer;
    }
    public void setEditer(String editer) {
        this.editer = editer;
    }
    
    
}
  
