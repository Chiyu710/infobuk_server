package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.ArticleTextFin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleTextFinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleTextFin record);

    int insertSelective(ArticleTextFin record);

    ArticleTextFin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleTextFin record);

    int updateByPrimaryKeyWithBLOBs(ArticleTextFin record);

    int updateByPrimaryKey(ArticleTextFin record);
}