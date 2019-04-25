package com.egbert.mybatis.xml.service.impl;

import com.egbert.mybatis.xml.dao.IDeptDAO;
import com.egbert.mybatis.xml.service.IDeptService;
import com.egbert.mybatis.xml.vo.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {

	@Resource
	private IDeptDAO deptDAO;
	
	@Override
	public List<Dept> list() {
		return deptDAO.findAll();
	}

	@Override
	public boolean add(Dept dept) {
		return deptDAO.doCreate(dept);
	}

}
