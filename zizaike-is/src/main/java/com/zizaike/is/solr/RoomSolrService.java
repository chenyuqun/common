/**  
 * Project Name:zizaike-is  <br/>
 * File Name:RoomSolrService.java  <br/>
 * Package Name:com.zizaike.is.solr  <br/>
 * Date:2015年11月6日下午1:49:07  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  

package com.zizaike.is.solr;  

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.solr.Room;
import com.zizaike.entity.solr.RoomSolr;
import com.zizaike.entity.solr.SearchWordsVo;

/**  
 * ClassName:RoomSolrService <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年11月6日 下午1:49:07 <br/>  
 * @author   alex 
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public interface RoomSolrService extends CrudRepository<Room, Integer> {
    /**
     * 
     * queryRoomByWords:通过输入字符查询Room相关信息. <br/>
     * 
     * @author alex
     * @param words
     * @return
     * @since JDK 1.7
     */
    List<Room> queryRoomByWords(String words,int locTypeid) throws ZZKServiceException;
    /**
     * 
     * searchSolr:(这里用一句话描述这个方法的作用). <br/>  
     * TODO(这里描述这个方法适用条件 – 可选).<br/>  
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>  
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>  
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>  
     *  
     * @author alex 
     * @param words
     * @param desId
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    RoomSolr searchSolr(SearchWordsVo searchWordsVo) throws ZZKServiceException;

    /**
     * updateRoomPrice
     * 构建每天价格到Solr
     * @author alex
     * @throws ZZKServiceException
     */
    void updateRoomPrice(int roomTypeId) throws ZZKServiceException;
}
  
