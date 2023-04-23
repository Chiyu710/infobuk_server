package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.ArticleTextRaw;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ArticleTextRawMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleTextRaw record);

    int insertSelective(ArticleTextRaw record);

    ArticleTextRaw selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleTextRaw record);

    int updateByPrimaryKeyWithBLOBs(ArticleTextRaw record);

    int updateByPrimaryKey(ArticleTextRaw record);
}