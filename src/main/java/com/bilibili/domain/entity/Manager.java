package com.bilibili.domain.entity;

public class Manager {
    /**
     * 管理员id
     */
    private Integer mId;

    /**
     * 管理员名
     */
    private String mName;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否使用（1为使用，0为删除）
     */
    private Integer isDelete;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}