package com.bilibili.domain.entity;

import java.util.Date;

public class Video {
    /**
    * 视频id
    */
    private Integer vId;

    /**
    * 用户id
    */
    private Integer uId;

    /**
    * 视频名字
    */
    private String vName;

    /**
    * 视频详情
    */
    private String particulars;

    /**
    * 视频图片
    */
    private String vImg;

    /**
    * 投稿日期
    */
    private Date upDate;

    /**
    * 视频类型（1番剧,2动画,3鬼畜,4游戏,5生活）
    */
    private Integer type;

    /**
    * 点赞数
    */
    private Integer pointNum;

    /**
    * 投币数
    */
    private Integer coinNum;

    /**
    * 收藏数
    */
    private Integer collectNum;

    /**
    * 是否使用（1为使用，0为删除，2为待审核）
    */
    private Integer isDelete;

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public String getParticulars() {
        return particulars;
    }

    public void setParticulars(String particulars) {
        this.particulars = particulars;
    }

    public String getvImg() {
        return vImg;
    }

    public void setvImg(String vImg) {
        this.vImg = vImg;
    }

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPointNum() {
        return pointNum;
    }

    public void setPointNum(Integer pointNum) {
        this.pointNum = pointNum;
    }

    public Integer getCoinNum() {
        return coinNum;
    }

    public void setCoinNum(Integer coinNum) {
        this.coinNum = coinNum;
    }

    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}