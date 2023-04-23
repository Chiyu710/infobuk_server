package com.louis.kitty.admin.controller;


import com.louis.kitty.admin.model.ArticleTextFin;
import com.louis.kitty.admin.model.ArticleTextRaw;
import com.louis.kitty.admin.sevice.ArticleFinService;
import com.louis.kitty.admin.sevice.ArticleRawService;
import com.louis.kitty.admin.util.SummaryUtils;
import com.louis.kitty.core.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("article")
public class ArticleController {

	@Autowired
	private ArticleRawService articleRawService;

	@Autowired
	private ArticleFinService articleFinService;

	//@PreAuthorize("hasAuthority('sys:user:add') AND hasAuthority('sys:user:edit')")
	@PostMapping(value="/summary")
	public HttpResult summary(@RequestBody ArticleTextRaw raw_content) throws IOException {
		System.out.println(raw_content.toString());
		String text=SummaryUtils.callSummary(raw_content.getContent());
		return HttpResult.ok(text);
	}


	@PostMapping(value="/getArticle")
	public HttpResult getArticle(@RequestBody ArticleTextFin articleTextFin) throws IOException {

		return HttpResult.ok(articleFinService.getArticleFinByid(articleTextFin.getId()));
	}

}
