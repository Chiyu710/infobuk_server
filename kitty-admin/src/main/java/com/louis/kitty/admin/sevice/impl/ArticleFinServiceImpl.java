package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.ArticleTextFinMapper;
import com.louis.kitty.admin.model.ArticleTextFin;
import com.louis.kitty.admin.sevice.ArticleFinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleFinServiceImpl implements ArticleFinService {


	@Autowired
	ArticleTextFinMapper articleTextFinMapper;

	@Override
	public ArticleTextFin getArticleFinByid(int id) {
		return articleTextFinMapper.selectByPrimaryKey(id);
	}
}
