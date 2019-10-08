package com.bilibili.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class Comment {
    /**
     * 评论表id
     */
    private Integer cId;

    /**
     * 用户表id
     */
    private Integer uId;

    /**
     * 视频id
     */
    private Integer vId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论日期
     */
    private Date sendDate;

    /**
     * 状态（1为使用，0为删除）
     */
    private Integer isDelete;

}