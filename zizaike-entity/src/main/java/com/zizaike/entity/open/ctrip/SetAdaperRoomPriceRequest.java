/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SetAdaperRoomPriceRequest.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年2月3日上午10:06:57  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip;  

import java.util.List;

/**  
 * ClassName:SetAdaperRoomPriceRequest <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年2月3日 上午10:06:57 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class SetAdaperRoomPriceRequest {
    private int hotelID;
    /**
     * <!--是否优先处理，暂不用，默认为N-->
     */
    private String priority;
    /**
     * <!--提交人，集团名拼音-->
     */
    private String submitor;
    private String title;
    private List<SetRoomPriceItem> setRoomPriceItems;
    public int getHotelID() {
        return hotelID;
    }
    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getSubmitor() {
        return submitor;
    }
    public void setSubmitor(String submitor) {
        this.submitor = submitor;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<SetRoomPriceItem> getSetRoomPriceItems() {
        return setRoomPriceItems;
    }
    public void setSetRoomPriceItems(List<SetRoomPriceItem> setRoomPriceItems) {
        this.setRoomPriceItems = setRoomPriceItems;
    }
    
}
  
