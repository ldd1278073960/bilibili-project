package com.bilibili.domain.entity;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
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
    private String pointNum;

}