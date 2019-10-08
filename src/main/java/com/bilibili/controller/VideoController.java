package com.bilibili.controller;

import com.bilibili.domain.entity.Video;
import com.bilibili.service.IVideoService;
import com.bilibili.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@RestController
@Slf4j
@RequestMapping("/video")
public class VideoController {

    @Resource
    private IVideoService iVideoService;

    @RequestMapping("/all")
    public Object findByVideo(){
        try {
            List<Video> byVideo = iVideoService.findByVideo();
            return Result.success(byVideo);
        }catch (Exception e){
            log.error(e.getMessage());
            return Result.error();
        }

    }

}
