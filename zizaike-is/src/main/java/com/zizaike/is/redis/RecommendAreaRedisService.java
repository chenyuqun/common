package com.zizaike.is.redis;


import java.util.List;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.recommend.Loctype;
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

    /**
     * queryByDest:根据目的地查询
     * @author alex
     * @param destId
     * @return
     * @throws ZZKServiceException
     */
    List<Loctype> queryByDest(Integer destId) throws ZZKServiceException;

    void save (RecommendArea value) throws ZZKServiceException;
}