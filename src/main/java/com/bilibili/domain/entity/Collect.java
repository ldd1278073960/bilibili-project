package com.bilibili.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
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

    /**
     * 收藏数量
     */
    private String collectNum;

}