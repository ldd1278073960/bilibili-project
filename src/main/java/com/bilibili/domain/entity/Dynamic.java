package com.bilibili.domain.entity;

public class Dynamic {
    /**
     * 动态id
     */
    private Integer dId;

    /**
     * 视频id（默认为0代表该动态不是视频投稿）
     */
    private Integer vId;

    /**
     * 说说id（默认为0代表该动态不是说说）
     */
    private Integer sId;

    /**
     * 是否使用（1为使用，0为删除）
     */
    private Integer idDelete;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getIdDelete() {
        return idDelete;
    }

    public void setIdDelete(Integer idDelete) {
        this.idDelete = idDelete;
    }
}