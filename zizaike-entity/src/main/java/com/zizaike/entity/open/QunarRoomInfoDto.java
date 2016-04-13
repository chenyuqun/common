package com.zizaike.entity.open;

/**
 * Project Name: code <br/>
 * Function:QunarRoomInfoDto. <br/>
 * date: 2016/4/12 10:17 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public class QunarRoomInfoDto extends RoomInfoDto{
    private Integer fieldChuangxingTid;

    private Integer fieldCHuangshuTid;

    private String title;

    private String checkinAt;

    private String checkoutAt;

    private Integer wifi;

    public Integer getFieldChuangxingTid() {
        return fieldChuangxingTid;
    }

    public void setFieldChuangxingTid(Integer fieldChuangxingTid) {
        this.fieldChuangxingTid = fieldChuangxingTid;
    }

    public Integer getFieldCHuangshuTid() {
        return fieldCHuangshuTid;
    }

    public void setFieldCHuangshuTid(Integer fieldCHuangshuTid) {
        this.fieldCHuangshuTid = fieldCHuangshuTid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCheckinAt() {
        return checkinAt;
    }

    public void setCheckinAt(String checkinAt) {
        this.checkinAt = checkinAt;
    }

    public String getCheckoutAt() {
        return checkoutAt;
    }

    public void setCheckoutAt(String checkoutAt) {
        this.checkoutAt = checkoutAt;
    }

    public Integer getWifi() {
        return wifi;
    }

    public void setWifi(Integer wifi) {
        this.wifi = wifi;
    }
}
