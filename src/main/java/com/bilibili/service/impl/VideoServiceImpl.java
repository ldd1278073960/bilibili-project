package com.bilibili.service.impl;

import com.bilibili.domain.entity.Video;
import com.bilibili.mapper.VideoMapper;
import com.bilibili.service.IVideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class VideoServiceImpl implements IVideoService {


    @Resource
   private VideoMapper videoMapper;


    @Override
    public List<Video> findByVideo() {
        return videoMapper.findByVideo();
    }
}
