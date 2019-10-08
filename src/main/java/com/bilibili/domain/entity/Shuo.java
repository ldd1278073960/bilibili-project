package com.bilibili.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class Shuo {
    private Integer sId;

    private Integer uId;

    private String content;

    /**
     * 发布时间
     */
    private Date addDate;

    /**
     * 是否使用（1为使用，0为删除）
     */
    private Integer idDelete;

}