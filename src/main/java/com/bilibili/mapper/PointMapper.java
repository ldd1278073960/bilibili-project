package com.bilibili.mapper;

import com.bilibili.domain.entity.Point;

import java.util.List;

/**
 * @author Administrator
 */
public interface PointMapper {

    /**
     * 点赞数量
     * @return 点赞的集合
     */
    List<Point> findByPoint();

}