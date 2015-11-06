/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SolrSearchablePlaceFields.java  <br/>
 * Package Name:com.zizaike.entity.solr.model  <br/>
 * Date:2015年11月3日下午3:46:19  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.solr.model;  

import org.springframework.data.solr.core.query.Field;

/**
 * 
 * ClassName: SolrSearchablePlaceFields <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2015年11月3日 下午3:46:50 <br/>  
 *  
 * @author alex  
 * @version   
 * @since JDK 1.7
 */
public enum SolrSearchablePlaceFields implements Field{
    ID(SearchablePlace.ID_FIELD),
    VERSION(SearchablePlace.VERSION_FIELD),
    GOOGLE_MAP_ADDRESS(SearchablePlace.GOOGLE_MAP_ADDRESS_FIELD),
    STATUS(SearchablePlace.STATUS_FIELD),
    LOCID(SearchablePlace.LOCID_FIELD),
    AUTO_ERROR(SearchablePlace.AUTO_ERROR_FIELD),
    POI_NAME(SearchablePlace.POI_NAME_FIELD),
    POI_RANK(SearchablePlace.POI_RANK_FIELD),
    DEST_ID(SearchablePlace.DEST_ID_FIELD),
    POI_TYPE(SearchablePlace.POI_TYPE_FIELD),
    GOOGLE_MAP_LAT(SearchablePlace.GOOGLE_MAP_LAT_FIELD),
    ADMIN_UID(SearchablePlace.ADMIN_UID_FIELD),
    GOOGLE_MAP_LNG(SearchablePlace.GOOGLE_MAP_LNG_FIELD),   
    ;
    private String fieldName;
    
    private SolrSearchablePlaceFields(String fieldName) {
        this.fieldName = fieldName; 
    }
    
    @Override
    public String getName() {
        return fieldName;
    }
}
  
