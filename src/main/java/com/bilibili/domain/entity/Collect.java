package com.bilibili.domain.entity;

import java.util.Date;

public class Collect {
    /**
    * 收藏表id
    */
    private Integer cId;

    /**
    * 用户id
    */
    private Integer uId;

    /**
    * 视频id
    */
    private Integer vId;

    /**
    * 添加到收藏夹的时间
    */
    private Date addDate;

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

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}