package com.bilibili.mapper;

import com.bilibili.domain.entity.Point;

import java.util.List;

/**
 * @author Administrator
 */
public interface PointMapper {

    List<Point> findByPoint();

}