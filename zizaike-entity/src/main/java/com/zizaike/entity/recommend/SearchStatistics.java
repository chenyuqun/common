package com.zizaike.entity.recommend;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONType;
import com.zizaike.entity.base.ChannelType;
/**
 * 
 * ClassName: SearchStatistics <br/>  
 * Function: 查询统计. <br/>  
 * date: 2015年12月8日 下午5:25:13 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
@JSONType(ignores={"id","channel","searchType","statisticsType","active","createAt","updateAt"})
public class SearchStatistics implements Serializable{
    private static final long serialVersionUID = 7825187615804629015L;

    private Integer id;
    /**
     * 关键字
     */
    private String keyWords;
    /**
     * t_loc_type.loc_id
     */
    private Integer locId;
    /**
     * t_loc_poi.id
     */
    private Integer poiId;
    /**
     * 计数
     */
    private Long count;
    /**
     * 渠道
     */
    private ChannelType channel;
    /**
     * 查询类型
     */
    private SearchType searchType;
    /**
     * 统计类型
     */
    private StatisticsType statisticsType;

    private Integer active;

    private Date createAt;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public Integer getLocId() {
        return locId;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
    }

    public Integer getPoiId() {
        return poiId;
    }

    public void setPoiId(Integer poiId) {
        this.poiId = poiId;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ChannelType getChannel() {
        return channel;
    }

    public void setChannel(ChannelType channel) {
        this.channel = channel;
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }

    public StatisticsType getStatisticsType() {
        return statisticsType;
    }

    public void setStatisticsType(StatisticsType statisticsType) {
        this.statisticsType = statisticsType;
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

    @Override
    public String toString() {
        return "SearchStatistics [id=" + id + ", keyWords=" + keyWords + ", locId=" + locId + ", poiId=" + poiId
                + ", count=" + count + ", channel=" + channel + ", searchType=" + searchType + ", statisticsType="
                + statisticsType + ", active=" + active + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
    }
    
    
}