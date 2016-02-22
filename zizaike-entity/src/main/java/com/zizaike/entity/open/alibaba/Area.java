package com.zizaike.entity.open.alibaba;

import java.util.Date;
/**
 * 
 * ClassName: Area <br/>  
 * Function: 阿里地址映射. <br/>  
 * date: 2016年1月26日 上午11:53:35 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class Area {
    private Integer id;
    /**
     * 地区码
     */
    private String areaCode;
    /**
     * 地区名
     */
    private String areaName;
    /**
     * t_loc_type.typeCode
     */
    private String typeCode;

    private Integer active;

    private Date createAt;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
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
        return "Area [id=" + id + ", areaCode=" + areaCode + ", areaName=" + areaName + ", typeCode=" + typeCode
                + ", active=" + active + ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
    }
    
}