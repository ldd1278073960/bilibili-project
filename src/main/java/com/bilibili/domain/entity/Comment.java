package com.bilibili.domain.entity;

import java.util.Date;

public class Comment {
    /**
     * 评论表id
     */
    private Integer cId;

    /**
     * 用户表id
     */
    private Integer uId;

    /**
     * 视频id
     */
    private Integer vId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论日期
     */
    private Date sendDate;

    /**
     * 状态（1为使用，0为删除）
     */
    private Integer isDelete;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}