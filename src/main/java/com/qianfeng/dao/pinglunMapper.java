package com.qianfeng.dao;

import com.qianfeng.entity.pinglun;

public interface pinglunMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(pinglun record);

    int insertSelective(pinglun record);

    pinglun selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(pinglun record);

    int updateByPrimaryKey(pinglun record);
}