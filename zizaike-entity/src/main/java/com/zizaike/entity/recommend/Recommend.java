package com.zizaike.entity.recommend;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONType;

/**
 * 
 * ClassName: Recommend <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 热门推荐. <br/>
 * date: 2015年11月4日 下午7:19:35 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
@JSONType(ignores={"id","rank","active","createAt","updateAt"})
public class Recommend implements java.io.Serializable {
    private static final long serialVersionUID = 613716594315093471L;
    private Integer id;
    /**
     * 国家代码
     */
    private Integer destId;

    /**
     * type
     */
    private RecommendType recommendType;
    /**
     * english name
     */
    private String engName;
    /**
     * name
     */
    private String recommendName;
    
    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    /**
     * 排序值
     */
    private Integer rank;
    /**
     * 是否可用
     */
    private Integer active;
    /**
     * 关联id
     */
    private Integer relationId;
    /**
     * 创建时间
     */
    private Date createAt;
    /**
     * 更新时间
     */
    private Date updateAt;
    

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDestId() {
        return destId;
    }

    public void setDestId(Integer destId) {
        this.destId = destId;
    }

    public String getRecommendName() {
        return recommendName;
    }

    public void setRecommendName(String recommendName) {
        this.recommendName = recommendName;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
    public RecommendType getRecommendType() {
        return this.recommendType;
    }

    public void setRecommendType(RecommendType recommendType) {
        this.recommendType = recommendType;
    }

    @Override
    public String toString() {
        return "Recommend [id=" + id + ", destId=" + destId + ", recommendType=" + recommendType + ", engName=" + engName
                + ", recommendName=" + recommendName + ", rank=" + rank + ", active=" + active + ", relationId="
                + relationId + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
    }
    
}