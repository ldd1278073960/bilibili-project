package com.bilibili.mapper;

import com.bilibili.domain.entity.Video;

import java.util.List;

/**
 * @author Administrator
 */
public interface VideoMapper {

    /**
     * 查询视频详情页面的所有信息
     * @return 返回video集合
     */
    List<Video> findByVideo();
}