package com.zizaike.entity.user;

/**
 * ClassName: collect <br/>  
 * Function: 用户收藏. <br/>  
 * date: 2016年4月25日 下午2:30:44 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class Collect {
    private Integer id;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * h 民宿 id,r 房间 id
     */
    private Integer hid;
    /**
     * h 民宿,r 房间
     */
    private String type;
    /**
     * 收藏时ip
     */
    private String ip;

    private Integer createAt;

    private Integer updateAt;
    /**
     * 备注
     */
    private String remark;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}