/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:RecommendVo.java  <br/>
 * Package Name:com.zizaike.entity.recommend.hot.vo  <br/>
 * Date:2015年11月4日下午8:32:34  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.recommend.hot.vo;


import com.zizaike.entity.recommend.hot.RecommendType;

/**
 * ClassName:RecommendVo <br/>
 * Function:vo <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015年11月4日 下午8:32:34 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public class RecommendVo implements java.io.Serializable {
    
    private static final long serialVersionUID = 3352043506657521192L;
    /**
     * 类型
     */
    private RecommendType recommendType;
    /**
     * 名称
     */
    private String recommendName;
    /**
     * englishName
     */
    private String eName;
    /**
     * 国家代码
     */
    private Integer destId;
    
    
    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public RecommendType getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(RecommendType recommendType) {
        this.recommendType = recommendType;
    }

    public String getRecommendName() {
        return recommendName;
    }

    public void setRecommendName(String recommendName) {
        this.recommendName = recommendName;
    }

    public Integer getDestId() {
        return destId;
    }

    public void setDestId(Integer destId) {
        this.destId = destId;
    }

}
