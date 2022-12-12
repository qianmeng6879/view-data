package edu.cdtc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Member)实体类
 *
 * @author makejava
 * @since 2022-12-08 10:12:53
 */
public class Member implements Serializable {
    private static final long serialVersionUID = 122781854369202633L;
    
    private Integer id;
    
    private String username;
    
    private String password;
    
    private String email;
    
    private Date createTime;
    
    private Date updateTime;
    
    private Integer isDeleted;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}

