package com.kfit.test.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ģ�����.
 * 
 * @author Administrator
 * 
 */
@Controller
public class TemplateController {
	/**
	 * 
	 * ����htmlģ��.
	 */

	@RequestMapping("/helloHtml")
	public String helloHtml(Map<String, Object> map) {
		map.put("hello", "from TemplateController.helloHtml");
		return "/helloHtml";

	}
	/**
	 * 
	 * ����htmlģ��.
	 */
	
	@RequestMapping("/layuiHtml")
	public String layuiHtml() {
		return "/layui";
		
	}

}
