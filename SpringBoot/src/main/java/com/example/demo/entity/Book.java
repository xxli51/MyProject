package com.example.demo.entity;

import java.util.Date;

/**
 * @author "LiXunXun"
 * @date 2020/1/15 0015
 */
public class Book {

    private Long tmBookId;
    private String cover;
    private String title;
    private String author;
    private String date;
    private String press;
    private String abs;
    private Long tmCategoryId;
    private Long createBy;
    private Date createDate;
    private Long updateBy;
    private Date updateDate;

    public Long getTmBookId() {
        return tmBookId;
    }

    public void setTmBookId(Long tmBookId) {
        this.tmBookId = tmBookId;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public Long getTmCategoryId() {
        return tmCategoryId;
    }

    public void setTmCategoryId(Long tmCategoryId) {
        this.tmCategoryId = tmCategoryId;
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
