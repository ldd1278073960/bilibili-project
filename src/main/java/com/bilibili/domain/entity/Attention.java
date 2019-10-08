package com.bilibili.domain.entity;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
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


}