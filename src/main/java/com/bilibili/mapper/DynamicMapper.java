package com.bilibili.mapper;

import com.bilibili.domain.entity.Dynamic;

public interface DynamicMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Dynamic record);

    int insertSelective(Dynamic record);

    Dynamic selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Dynamic record);

    int updateByPrimaryKey(Dynamic record);
}