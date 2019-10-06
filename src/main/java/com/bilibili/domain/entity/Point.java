package com.bilibili.domain.entity;

public class Point {
    /**
     * 点赞id
     */
    private Integer pId;

    /**
     * 用户id
     */
    private Integer uId;

    /**
     * 视频id
     */
    private Integer vId;

    /**
     * 是否使用（1为使用，0为删除）
     */
    private Integer isDelete;

    /**
     * 点赞数量
     */
    private Integer pointNum;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getPointNum() {
        return pointNum;
    }

    public void setPointNum(Integer pointNum) {
        this.pointNum = pointNum;
    }
}