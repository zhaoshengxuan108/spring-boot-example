package com.egbert.mybatis.xml.service;

import com.egbert.mybatis.xml.StartSpringBootMain;
import com.egbert.mybatis.xml.vo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes= StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDeptService {

	@Resource
	private IDeptService deptService;
	
	@Test
	public void testHome() throws Exception {
		System.out.println(this.deptService.list());
	}
	
	@Test
	public void testAdd() {
		Dept dept = new Dept();
		dept.setDname("测试部");
		System.out.println(this.deptService.add(dept));
	}
}
