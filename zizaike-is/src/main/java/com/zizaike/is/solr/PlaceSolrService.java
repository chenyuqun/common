/**  
 * Project Name:zizaike-is  <br/>
 * File Name:PlaceSolrService.java  <br/>
 * Package Name:com.zizaike.is.solr  <br/>
 * Date:2015年11月4日下午1:36:55  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  

  
package com.zizaike.is.solr;  


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.solr.Place;
import com.zizaike.entity.solr.dto.AssociateWordAndSearchCondition;
import com.zizaike.entity.solr.dto.AssociateWordsDTO;
import com.zizaike.entity.solr.dto.PlaceDTO;

/**  
 * ClassName:PlaceSolrService <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年11月4日 下午1:36:55 <br/>  
 * @author   zzk  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public interface PlaceSolrService extends CrudRepository<Place, Integer>{
    /**
     * 
     * queryPlaceByWords:通过输入字符查询全站Place相关信息. <br/>
     * 
     * @author alex
     * @param words
     * @return
     * @since JDK 1.7
     */
    List<Place> queryPlaceByWords(String words) throws ZZKServiceException;
    /**
     * 
     * queryPlaceByWordsAndLoc:通过输入字符在目标地点内查询目标Place相关信息. <br/>
     * 
     * @author alex
     * @param words
     * @return
     * @since JDK 1.7
     */
    List<AssociateWordsDTO> queryPlaceByWordsAndLoc(String words,Integer destId,Integer locid) throws ZZKServiceException;
    /**
     * 
     * queryPlaceByWordsAndLocCodition:级联查询+搜索结果. <br/>  
     *  
     * @author snow.zhang  
     * @param words
     * @param destId
     * @param locid
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    AssociateWordAndSearchCondition queryPlaceByWordsAndLocCodition(String words,Integer destId,Integer locid) throws ZZKServiceException;
    /**
     * 
     * queryPlaceByLocId:通过 locaid find. <br/>  
     *  
     * @author snow.zhang  
     * @param locid
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    List<PlaceDTO> queryPlaceByLocId(Integer locid) throws ZZKServiceException;
    /**
     * 
     * queryPlaceById:通过id获取Place信息 <br/>  
     * @author alex 
     * @param id
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    Place queryPlaceById(Integer id) throws ZZKServiceException;

}
  
