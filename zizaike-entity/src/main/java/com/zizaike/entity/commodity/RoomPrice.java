package com.zizaike.entity.commodity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * ClassName: RoomPrice <br/>  
 * Function: 房间价格. <br/>  
 * date: 2016年3月14日 下午3:43:14 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class RoomPrice {
    private Integer id;
    /**
     * 民宿舍id
     */
    private Integer userId;
    /**
     * 房型id
     */
    private Integer roomTypeId;
    
    @JSONField(format = "yyyy-MM-dd")
    private Date date;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 是否有效果
     */
    private Integer active;

    private Date createAt;

    private Integer createUId;

    private Integer updateUId;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateUId() {
        return createUId;
    }

    public void setCreateUId(Integer createUId) {
        this.createUId = createUId;
    }

    public Integer getUpdateUId() {
        return updateUId;
    }

    public void setUpdateUId(Integer updateUId) {
        this.updateUId = updateUId;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "RoomPrice [id=" + id + ", userId=" + userId + ", roomTypeId=" + roomTypeId + ", date=" + date
                + ", price=" + price + ", active=" + active + ", createAt=" + createAt + ", createUId=" + createUId
                + ", updateUId=" + updateUId + ", updateAt=" + updateAt + "]";
    }
    
}