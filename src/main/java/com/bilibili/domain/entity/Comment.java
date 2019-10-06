package com.bilibili.domain.entity;

import lombok.Data;

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
    * 视频表id
    */
    private Integer vId;

    /**
    * 评论内容
    */
    private String content;

    /**
    * 状态（1为使用，0为删除）
    */
    private Integer isDelete;

    /**
     * 评论时间
     */
    private String sendDate;
}