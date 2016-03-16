package com.zizaike.entity.recommend;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * ClassName: TeacherShare <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 讲师统计 <br/>
 * date: 2016年3月15日 下午3:10:58 <br/>
 * 
 * @author alex
 * @version
 * @since JDK 1.7
 */
public class TeacherShare implements Serializable {
    private Integer id;

    private Integer userId;

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
}