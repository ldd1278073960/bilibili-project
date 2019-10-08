package com.bilibili.domain.vo;

import com.bilibili.domain.entity.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author Administrator
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class VideoVo extends Video {

    /**
     * 点赞表
     */
    Point points;

    /**
     * 评论表
     */
    List<Comment> comments;

    /**
     * 收藏表
     */
    Collect collects;

    /**
     * 用户表
     */
    List<User> users;
}
