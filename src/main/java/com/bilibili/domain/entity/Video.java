package com.bilibili.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class Video {
    /**
    * 视频id
    */
    private Integer vId;

    /**
    * 用户id
    */
    private Integer uId;

    /**
    * 视频名字
    */
    private String vName;

    /**
    * 视频详情
    */
    private String particulars;

    /**
    * 视频图片
    */
    private String vImg;

    /**
    * 投稿日期
    */
    private Date upDate;

    /**
    * 视频类型（1番剧,2动画,3鬼畜,4游戏,5生活）
    */
    private Integer type;

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
    * 是否使用（1为使用，0为删除，2为待审核）
    */
    private Integer isDelete;

}