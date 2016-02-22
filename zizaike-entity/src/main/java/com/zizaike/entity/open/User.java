package com.zizaike.entity.open;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * ClassName: User <br/>  
 * Function: 用户. <br/>  
 * date: 2016年1月19日 下午6:08:59 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class User implements Serializable{
    
    private static final long serialVersionUID = 8946934372472467931L;
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 是否可用 
     */
    private Integer active;
    /**
     * 创建时间
     */
    private Date createAt;
    /**
     * 更新时间
     */
    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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