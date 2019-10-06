package com.bilibili.domain.entity;

import java.util.Date;

public class Letter {
    /**
     * 私信表id
     */
    private Integer lId;

    /**
     * 发送私信用户的id（user表）
     */
    private Integer sendId;

    /**
     * 接收私信用户得id（user表）
     */
    private Integer receiveId;

    /**
     * 私信内容
     */
    private String content;

    /**
     * 发送日期
     */
    private Date sendDate;

    /**
     * 状态（1为使用，0为删除）
     */
    private Integer isDelete;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    public Integer getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Integer receiveId) {
        this.receiveId = receiveId;
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