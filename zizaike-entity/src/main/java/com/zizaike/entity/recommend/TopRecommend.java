package com.zizaike.entity.recommend;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * ClassName: TopRecommend <br/>  
 * Function: app top recommend <br/>  
 * date: 2015年11月25日 下午10:01:07 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class TopRecommend implements Serializable{
    private static final long serialVersionUID = -586688270574966701L;
    private Integer id;
    /**
     * 国家id
     */
    private Integer destId;
    /**
     * 多少个
     */
    private Integer topNumber;

    private Integer active;

    private Date createAt;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDestId() {
        return destId;
    }

    public void setDestId(Integer destId) {
        this.destId = destId;
    }

    public Integer getTopNumber() {
        return topNumber;
    }

    public void setTopNumber(Integer topNumber) {
        this.topNumber = topNumber;
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