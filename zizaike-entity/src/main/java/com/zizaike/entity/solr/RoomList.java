/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:RoomList.java  <br/>
 * Package Name:com.zizaike.entity.solr  <br/>
 * Date:2015年11月21日下午3:06:04  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.solr;  

import java.util.List;

/**  
 * ClassName:RoomList <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2015年11月21日 下午3:06:04 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class RoomList implements java.io.Serializable {

    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = 141024384141125664L;
    
    private int uid;
    
    private List<Room> roomList;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
    
    

}
  
