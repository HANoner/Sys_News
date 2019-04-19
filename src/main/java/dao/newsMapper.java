package dao;

import com.qianfeng.entity.news;

public interface newsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(news record);

    int insertSelective(news record);

    news selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(news record);

    int updateByPrimaryKey(news record);
}