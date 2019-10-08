package com.bilibili.domain.entity;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
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

}