package com.example.demo.entity;

import java.util.Date;

/**
 * @author "LiXunXun"
 * @date 2020/1/14 0014
 */
public class User {

    private Long tmUserId;
    private String userName;
    private String passWord;
    private Long createBy;
    private Date createDate;
    private Long updateBy;
    private Date updateDate;

    public Long getTmUserId() {
        return tmUserId;
    }

    public void setTmUserId(Long tmUserId) {
        this.tmUserId = tmUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
