package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.sevice.ArticleRawService;
import org.springframework.stereotype.Service;

@Service
public class ArticleRawServiceImpl implements ArticleRawService {


	@Override
	public String manualSummary(String raw_text) {
		return raw_text+"finish";
	}
}
