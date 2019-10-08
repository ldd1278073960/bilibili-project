package com.bilibili.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
public class User {
    private Integer uId;

    private String uName;

    private String password;

    private String uImg;

    private Date joinDate;

    private Date lastDate;

    private Date vipDate;

    private Integer coin;

    private String nickname;
}