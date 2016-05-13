package com.zizaike.entity.solr;

/**
 * Project Name: code <br/>
 * Function:RoomInfo. <br/>
 * date: 2016/5/13 20:33 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public class RoomInfo implements java.io.Serializable{
    private static final long serialVersionUID = 7242398989801744229L;
    private String title;
    private String roomModel;
    private String chuangxing;
    private int wifiI;
    private int breakfast;
    private int price;
    private int isSpeed;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRoomModel() {
        return roomModel;
    }

    public void setRoomModel(String roomModel) {
        this.roomModel = roomModel;
    }

    public String getChuangxing() {
        return chuangxing;
    }

    public void setChuangxing(String chuangxing) {
        this.chuangxing = chuangxing;
    }

    public int getWifiI() {
        return wifiI;
    }

    public void setWifiI(int wifiI) {
        this.wifiI = wifiI;
    }

    public int getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsSpeed() {
        return isSpeed;
    }

    public void setIsSpeed(int isSpeed) {
        this.isSpeed = isSpeed;
    }
}
