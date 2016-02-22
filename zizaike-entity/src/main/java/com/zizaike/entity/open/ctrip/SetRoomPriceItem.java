/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SetRoomPriceItem.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年2月3日上午9:53:49  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip;  


import java.util.Date;
import java.util.List;

/**  
 * ClassName:SetRoomPriceItem <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年2月3日 上午9:53:49 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class SetRoomPriceItem {
 private List<PriceInfo> priceInfos;
 private int roomID;
 private String startDate;
 private String endDate;
 private String currency;
public List<PriceInfo> getPriceInfos() {
    return priceInfos;
}
public void setPriceInfos(List<PriceInfo> priceInfos) {
    this.priceInfos = priceInfos;
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
public String getCurrency() {
    return currency;
}
public void setCurrency(String currency) {
    this.currency = currency;
}
 
}
  
