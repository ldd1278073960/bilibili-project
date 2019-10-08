package com.bilibili.service;

import com.bilibili.domain.entity.Video;

import java.util.List;

/**
 * @author Administrator
 */
public interface IVideoService {

    /**
     * 查询视频详情页面的所有信息
     * @return 返回video集合
     */
    List<Video> findByVideo();

}
