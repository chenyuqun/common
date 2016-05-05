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
import java.util.List;

import com.zizaike.entity.open.ctrip.GetMappingInfoType;

/**  
 * ClassName:MappingInfoEntity <br/>  
 * Function: MappingInfo. <br/>  
 * Date:     2016年3月2日 下午6:51:03 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class MappingInfoVo implements Serializable{

    private static final long serialVersionUID = -3748480489968489699L;
    /**
     * hotels
     */
    private List<Integer> hotels;
    /**
     * 
     */
    private GetMappingInfoType getMappingInfoType;
    /**
     * 0代表中国，1代表海外
     */
    private int isOverSea;
    public List<Integer> getHotels() {
        return hotels;
    }
    public void setHotels(List<Integer> hotels) {
        this.hotels = hotels;
    }
    public GetMappingInfoType getGetMappingInfoType() {
        return getMappingInfoType;
    }
    public void setGetMappingInfoType(GetMappingInfoType getMappingInfoType) {
        this.getMappingInfoType = getMappingInfoType;
    }

    public int getIsOverSea() {
        return isOverSea;
    }

    public void setIsOverSea(int isOverSea) {
        this.isOverSea = isOverSea;
    }

    @Override
    public String toString() {
        return "MappingInfoVo{" +
                "hotels=" + hotels +
                ", getMappingInfoType=" + getMappingInfoType +
                ", isOverSea=" + isOverSea +
                '}';
    }
}
  
