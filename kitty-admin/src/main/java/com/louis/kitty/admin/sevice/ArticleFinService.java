package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.ArticleTextFin;
import org.springframework.stereotype.Service;

@Service
public interface ArticleFinService {


	/**
	 * 已摘要文章展示
	 * @param raw_text
	 * @return fin_text
	 */
	ArticleTextFin getArticleFinByid(int id);


}
