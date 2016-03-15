/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:GetMappingInfoResponseList.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年3月2日上午10:30:42  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip;  

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.zizaike.entity.open.alibaba.request.RequestData;

/**  
 * ClassName:GetMappingInfoResponseList <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年3月2日 上午10:30:42 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("GetMappingInfoResponseList")
public class GetMappingInfoResponseList extends RequestData implements Serializable{
    
    private static final long serialVersionUID = 1468357886702973752L;
    @XStreamAlias("SupplierID")
    private int supplierID;
    @XStreamAlias("SupplierName")
    private String supplierName;
    @XStreamAlias("HotelResponseItem")
    private  List<HotelResponseItem> hotelResponseItem;
    public int getSupplierID() {
        return supplierID;
    }
    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }
    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public List<HotelResponseItem> getHotelResponseItem() {
        return hotelResponseItem;
    }
    public void setHotelResponseItem(List<HotelResponseItem> hotelResponseItem) {
        this.hotelResponseItem = hotelResponseItem;
    }
    @Override
    public String toString() {
        return "GetMappingInfoResponseList [supplierID=" + supplierID + ", supplierName=" + supplierName
                + ", hotelResponseItem=" + hotelResponseItem + "]";
    }
   

   
   
   
   
    
}
  
