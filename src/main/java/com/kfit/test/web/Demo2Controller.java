/*package com.kfit.test.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kfit.test.bean.Demo;
import com.kfit.test.service.DemoService;

@RestController
@RequestMapping("/demo2")
public class Demo2Controller {
	@Resource
	private DemoService demoService;

	*//**
	 * ���Ա������ݷ���.
	 * 
	 * @return
	 *//*
	@RequestMapping("/save")
	public String save() {
		Demo d = new Demo();
		d.setName("Angel");
		demoService.save(d);// ��������.
		return "ok.Demo2Controller.save";
	}

	// ��ַ��http://127.0.0.1:8080/demo2/getById?id=1

	@RequestMapping("/getById")
	public Demo getById(long id) {
		return demoService.getById(id);
	}

}
*/