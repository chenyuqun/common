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

import com.zizaike.entity.recommend.Recommend;

/**  
 * ClassName:TopArea <br/>  
 * Function: 热门+行政级别:省市. <br/>  
 * Date:     2015年11月19日 上午11:05:56 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class RecommendArea implements Serializable{
    private static final long serialVersionUID = -9063935075930146814L;
    /**
     * 热推数据
     */
    private List<Recommend> recommends;
    /**
     * 国家+行政数据
     */
    private List<CountryArea> countryAreas;
    public List<Recommend> getRecommends() {
        return recommends;
    }
    public void setRecommends(List<Recommend> recommends) {
        this.recommends = recommends;
    }
    public List<CountryArea> getCountryAreas() {
        return countryAreas;
    }
    public void setCountryAreas(List<CountryArea> countryAreas) {
        this.countryAreas = countryAreas;
    }
    @Override
    public String toString() {
        return "RecommendArea [recommends=" + recommends + ", countryAreas=" + countryAreas + "]";
    }
    
    
    
}
  
