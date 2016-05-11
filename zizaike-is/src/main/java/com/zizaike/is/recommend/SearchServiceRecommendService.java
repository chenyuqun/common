package com.zizaike.is.recommend;

import java.util.List;
import java.util.Map;

import com.zizaike.core.common.page.Page;
import com.zizaike.core.common.page.PageList;
import com.zizaike.entity.recommend.SearchServiceRecommend;

/**
 * 
 * ClassName: SearchServiceRecommendService <br/>  
 * Function: 搜索服务推荐. <br/>  
 * date: 2016年4月26日 下午4:16:29 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public interface SearchServiceRecommendService {
    /**
     * 
     * query:查询推荐服务. <br/>  
     *  
     * @author snow.zhang  
     * @return  
     * @since JDK 1.7
     */
    PageList<SearchServiceRecommend> query(Page page,Map<String, Object> paramMap);
    /**
     * 
     * queryAll:全部推荐. <br/>  
     *  
     * @author snow.zhang  
     * @return  
     * @since JDK 1.7
     */
    List<SearchServiceRecommend> queryAll();
}