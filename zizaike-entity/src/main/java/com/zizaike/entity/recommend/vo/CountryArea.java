/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:TopArea.java  <br/>
 * Package Name:com.zizaike.entity.recommend.vo  <br/>
 * Date:2015年11月19日上午11:05:56  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.recommend.vo;  

import java.io.Serializable;
import java.util.List;

import com.zizaike.entity.recommend.DestConfig;
import com.zizaike.entity.recommend.Loctype;

/**  
 * ClassName:TopArea <br/>  
 * Function: 热门:行政级别:省市. <br/>  
 * Date:     2015年11月19日 上午11:05:56 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class CountryArea implements Serializable{
    private static final long serialVersionUID = -7132110776034990313L;
    /**
     * 国家
     */
    private DestConfig country;
    /**
     * 地区列表
     */
    private List<Loctype> areaList;
    public DestConfig getCountry() {
        return country;
    }
    public void setCountry(DestConfig country) {
        this.country = country;
    }
    public List<Loctype> getAreaList() {
        return areaList;
    }
    public void setAreaList(List<Loctype> areaList) {
        this.areaList = areaList;
    }
    
    
}
  
