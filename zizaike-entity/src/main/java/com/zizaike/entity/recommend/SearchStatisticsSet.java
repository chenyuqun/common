package com.zizaike.entity.recommend;

import java.io.Serializable;
/**
 * 
 * ClassName: SearchStatistics <br/>  
 * Function: 查询统计集合. <br/>  
 * date: 2015年12月8日 下午5:25:13 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class SearchStatisticsSet implements Serializable{
    private static final long serialVersionUID = 5855592540150642859L;
    private SearchStatistics statistics;
    private Double score;
    public SearchStatistics getStatistics() {
        return statistics;
    }
    public void setStatistics(SearchStatistics statistics) {
        this.statistics = statistics;
    }
    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }
    
    
    
}