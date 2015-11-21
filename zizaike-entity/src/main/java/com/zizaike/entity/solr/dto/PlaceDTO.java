/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:PlaceDTO.java  <br/>
 * Package Name:com.zizaike.entity.solr.dto  <br/>
 * Date:2015年11月20日下午4:32:22  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.solr.dto;  

import java.io.Serializable;

import com.zizaike.entity.solr.type.PoiType;

/**  
 * ClassName:PlaceDTO <br/>  
 * Function: 景区类型. <br/>  
 * Date:     2015年11月20日 下午4:32:22 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class PlaceDTO implements Serializable {

    private static final long serialVersionUID = -3099077490620291681L;
    private int id;
    private String poiName;
    private PoiType poiType;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPoiName() {
        return poiName;
    }
    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }
    public PoiType getPoiType() {
        return poiType;
    }
    public void setPoiType(PoiType poiType) {
        this.poiType = poiType;
    } 

}
  
