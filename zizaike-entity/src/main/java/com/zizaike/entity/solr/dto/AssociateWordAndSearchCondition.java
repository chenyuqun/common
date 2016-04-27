/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:AssociateWordAndSearchCondition.java  <br/>
 * Package Name:com.zizaike.entity.solr.dto  <br/>
 * Date:2016年4月15日下午4:03:15  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.solr.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * ClassName:AssociateWordAndSearchCondition <br/>
 * Function: 级联返回数组以及返回条件 <br/>
 * Date: 2016年4月15日 下午4:03:15 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
public class AssociateWordAndSearchCondition implements Serializable {
    private static final long serialVersionUID = 4377930849993738000L;
    /**
     * 关联列表
     */
    List<AssociateWordsDTO> associateWords;
    /**
     * 条件查询
     */
    Map searchCondition;
    
    
    public List<AssociateWordsDTO> getAssociateWords() {
        return associateWords;
    }

    public void setAssociateWords(List<AssociateWordsDTO> associateWords) {
        this.associateWords = associateWords;
    }

    public Map getSearchCondition() {
        return searchCondition;
    }

    public void setSearchCondition(Map searchCondition) {
        this.searchCondition = searchCondition;
    }

    @Override
    public String toString() {
        return "AssociateWordAndSearchCondition [associateWords=" + associateWords + ", searchCondition="
                + searchCondition + "]";
    }
    

}
