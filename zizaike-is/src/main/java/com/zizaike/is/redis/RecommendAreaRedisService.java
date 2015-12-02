package com.zizaike.is.redis;


import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.recommend.vo.RecommendArea;

public interface RecommendAreaRedisService {
    /**
     * 
     * query:地址与热推查询. <br/>  
     *  
     * @author snow.zhang  
     * @return  
     * @since JDK 1.7
     */
    RecommendArea query() throws ZZKServiceException;
    
    void save (RecommendArea value) throws ZZKServiceException;
}