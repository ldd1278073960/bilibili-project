package com.bilibili.domain.entity;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
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

}