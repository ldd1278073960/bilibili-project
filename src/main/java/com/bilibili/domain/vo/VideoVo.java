package com.bilibili.domain.vo;

import com.bilibili.domain.entity.Collect;
import com.bilibili.domain.entity.Comment;
import com.bilibili.domain.entity.Point;
import com.bilibili.domain.entity.Video;
import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 */
@Data
public class VideoVo extends Video {

    /**
     * 点赞表
     */
    List<Point> points;

    /**
     * 评论表
     */
    List<Comment> comments;

    /**
     * 收藏表
     */
    List<Collect> collects;
}
