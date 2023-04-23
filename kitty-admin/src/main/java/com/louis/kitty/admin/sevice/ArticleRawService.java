package com.louis.kitty.admin.sevice;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public interface ArticleRawService {


	/**
	 * 查找用户的菜单权限标识集合
	 * @param raw_text
	 * @return fin_text
	 */
	String manualSummary(String raw_text);


}
