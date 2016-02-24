package com.zizaike.entity.open;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * ClassName: RoomTypeMapping <br/>  
 * Function: 房型对应表. <br/>  
 * date: 2016年2月24日 上午10:32:37 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class RoomTypeMapping implements Serializable{
    private static final long serialVersionUID = -5634521327443307832L;

    private Integer id;

    private String openHotelId;

    private String openRoomTypeId;

    private String hotelId;

    private String roomTypeId;

    private String roomName;

    private Integer channel;

    private Integer active;

    private Date createAt;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenHotelId() {
        return openHotelId;
    }

    public void setOpenHotelId(String openHotelId) {
        this.openHotelId = openHotelId;
    }

    public String getOpenRoomTypeId() {
        return openRoomTypeId;
    }

    public void setOpenRoomTypeId(String openRoomTypeId) {
        this.openRoomTypeId = openRoomTypeId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "RoomTypeMapping [id=" + id + ", openHotelId=" + openHotelId + ", openRoomTypeId=" + openRoomTypeId
                + ", hotelId=" + hotelId + ", roomTypeId=" + roomTypeId + ", roomName=" + roomName + ", channel="
                + channel + ", active=" + active + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
    }
    
}