package com.zizaike.entity.recommend;

import java.io.Serializable;
import java.util.Date;

import com.zizaike.entity.solr.BNBServiceType;
/**
 * 
 * ClassName: SearchServiceRecommend <br/>  
 * Function: 服务推荐. <br/>  
 * date: 2016年4月26日 下午2:23:40 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class SearchServiceRecommend implements Serializable{
    private static final long serialVersionUID = 1341219400782112316L;
    private Integer id;
    /**
     * 民宿id
     */
    private Integer uid;
    /**
     * 服务id
     */
    private Integer serviceId;
    /**
     * 服务类型
     */
    private BNBServiceType serviceType;
    /**
     * 是否有效
     */
    private Integer active;

    private Date createAt;

    private Date updateAt;
    /**
     * 服务ids
     */
    private String serviceIds;
    
    public String getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
    }

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

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    
    public BNBServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(BNBServiceType serviceType) {
        this.serviceType = serviceType;
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
}