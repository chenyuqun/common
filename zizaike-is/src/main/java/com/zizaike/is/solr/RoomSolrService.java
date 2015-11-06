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

import com.zizaike.core.framework.exception.ServiceException;
import com.zizaike.entity.solr.Place;
import com.zizaike.entity.solr.Room;

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
    List<Room> queryRoomByWords(String words,int locTypeid) throws ServiceException;
}
  
