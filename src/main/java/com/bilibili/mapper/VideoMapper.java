package com.bilibili.mapper;

import com.bilibili.domain.entity.Video;

/**
 * @author Administrator
 */
public interface VideoMapper {

    /**
     * 查询视频详情页面的所有信息
     *
     * @return
     */
    Video findByVideo();
}