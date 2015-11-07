/**  
 * Project Name:zizaike-is  <br/>
 * File Name:UserService.java  <br/>
 * Package Name:com.zizaike.is.solr  <br/>
 * Date:2015年10月28日下午4:03:13  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.is.solr;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.solr.User;
import com.zizaike.entity.solr.dto.AssociateWordsDTO;

/**
 * ClassName:UserService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015年10月28日 下午4:03:13 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public interface UserSolrService extends CrudRepository<User, Integer> {
    /**
     * 
     * queryUserById:通过id查询User相关信息. <br/>
     * 
     * @author snow.zhang
     * @param id
     * @return
     * @since JDK 1.7
     */
    User queryUserById(Integer id) throws ZZKServiceException;
    /**
     * 
     * queryUserById:通过查询User相关信息. <br/>
     * 
     * @author alex
     * @param words,destId,locid
     * @return
     * @since JDK 1.7
     */
    List<AssociateWordsDTO> queryUserByWordsAndLoc(String words,Integer destId,Integer locid) throws ZZKServiceException;
}
