/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:PlaceSolr.java  <br/>
 * Package Name:com.zizaike.entity.solr  <br/>
 * Date:2015年11月21日上午11:06:08  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.solr;  

import java.util.List;

import org.apache.solr.client.solrj.beans.Field;

/**  
 * ClassName:PlaceSolr <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年11月21日 上午11:06:08 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class RoomSolr implements java.io.Serializable {

    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = 1731774511368490147L;
    
    private int matches;
    
    private int ngroups;
    
    private List<RoomList> roomGroup;

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getNgroups() {
        return ngroups;
    }

    public void setNgroups(int ngroups) {
        this.ngroups = ngroups;
    }

    public List<RoomList> getRoomGroup() {
        return roomGroup;
    }

    public void setRoomGroup(List<RoomList> roomGroup) {
        this.roomGroup = roomGroup;
    } 
    
    
   
}
  
