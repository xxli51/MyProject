package com.example.demo.entity;

import java.util.Date;

/**
 * @author "LiXunXun"
 * @date 2020/1/15 0015
 */
public class Category {
    private Long tmCategoryId;
    private String categoryName;
    private Long createBy;
    private Date createDate;
    private Long updateBy;
    private Date updateDate;

    public Long getTmCategoryId() {
        return tmCategoryId;
    }

    public void setTmCategoryId(Long tmCategoryId) {
        this.tmCategoryId = tmCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
