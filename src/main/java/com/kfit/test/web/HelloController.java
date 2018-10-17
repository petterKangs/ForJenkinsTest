/*package com.kfit.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.kfit.test.bean.Demo;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {

		return "!!!!!!!!!!!!!!";

	}

	@RequestMapping("/getFastJson")
	public String getFastJson() {

		Demo demo = new Demo();
		demo.setId(2);
		demo.setName("Angel2");
		return JSONObject.toJSONString(demo);

	}

}
*/