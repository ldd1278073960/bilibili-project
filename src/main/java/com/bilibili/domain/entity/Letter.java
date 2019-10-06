package com.bilibili.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class Letter {
    /**
    * 私信表id
    */
    private Integer lId;

    /**
    * 发送私信用户的id（user表）
    */
    private Integer sendId;

    /**
    * 接收私信用户得id（user表）
    */
    private Integer receiveId;

    /**
    * 私信内容
    */
    private String content;

    /**
    * 发送日期
    */
    private Date sendDate;

    /**
    * 状态（1为使用，0为删除）
    */
    private Integer isDelete;

}