package com.bilibili.domain.entity;

public class Attention {
    /**
    * 关注表id
    */
    private Integer aId;

    /**
    * 用户id
    */
    private Integer uId;

    /**
    * 被关注表的id
    */
    private Integer uedId;

    /**
    * 状态值（1为使用，0为删除）
    */
    private Integer isDelete;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getUedId() {
        return uedId;
    }

    public void setUedId(Integer uedId) {
        this.uedId = uedId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}