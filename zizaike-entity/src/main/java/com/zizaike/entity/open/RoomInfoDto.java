/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:RoomInfoDto.java  <br/>
 * Package Name:com.zizaike.entity.open  <br/>
 * Date:2016年3月7日下午6:13:25  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open;  
/**  
 * ClassName:RoomInfoDto <br/>  
 * Date:     2016年3月7日 下午6:13:25 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class RoomInfoDto {
    private String refundRule;
    private int uid;
    private int value;
    private String name;
    private Integer destId;
    public String getRefundRule() {
        return refundRule;
    }
    public void setRefundRule(String refundRule) {
        this.refundRule = refundRule;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getDestId() {
        return destId;
    }

    public void setDestId(Integer destId) {
        this.destId = destId;
    }
}

