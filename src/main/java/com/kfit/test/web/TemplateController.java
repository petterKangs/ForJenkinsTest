package com.kfit.test.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模板测试.
 * 
 * @author Administrator
 * 
 */
@Controller
public class TemplateController {
	/**
	 * 
	 * 返回html模板.
	 */

	@RequestMapping("/helloHtml")
	public String helloHtml(Map<String, Object> map) {
		map.put("hello", "from TemplateController.helloHtml");
		return "/helloHtml";

	}
	/**
	 * 
	 * 返回html模板.
	 */
	
	@RequestMapping("/layuiHtml")
	public String layuiHtml() {
		return "/layui";
		
	}

}
