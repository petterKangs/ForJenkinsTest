/*package com.kfit.test.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kfit.test.bean.Demo;
import com.kfit.test.dao.DemoDao;
import com.kfit.test.dao.DemoRepository;

@Service
public class DemoService {

	@Resource
	private DemoRepository demoRepository;
	@Resource
	private DemoDao demoDao;

	@Transactional
	public void save(Demo demo) {
		demoRepository.save(demo);
	}

	public Demo getById(long id) {
		// demoRepository.findOne(id);//��demoRepository����ֱ��ʹ��findOne���л�ȡ.
		return demoDao.getById(id);

	}

}
*/