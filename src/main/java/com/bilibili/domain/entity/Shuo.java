package com.bilibili.domain.entity;

import java.util.Date;

public class Shuo {
    private Integer sId;

    private Integer uId;

    private String content;

    /**
     * 发布时间
     */
    private Date addDate;

    /**
     * 是否使用（1为使用，0为删除）
     */
    private Integer idDelete;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Integer getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(Integer idDelete) {
        this.idDelete = idDelete;
    }
}