package com.bilibili.domain.vo;

import com.bilibili.domain.entity.Point;
import com.bilibili.domain.entity.Video;
import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 */
@Data
public class VideoVo extends Video {

    List<Point> points;

}
