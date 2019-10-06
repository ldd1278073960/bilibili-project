package com.bilibili.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class Video {
    private Integer vId;

    private Integer uId;

    private Integer tId;

    private String vName;

    private String title;

    private String vImg;

    /**
    * 投稿日期
    */
    private Date upDate;

    /**
    * 评论id
    */
    private Integer cId;

    /**
    * 点赞数
    */
    private Integer pointNum;

    /**
    * 投币数
    */
    private Integer coinNum;

    /**
    * 收藏数
    */
    private Integer collectNum;

    /**
    * 是否需要大会员
    */
    private Integer free;


}