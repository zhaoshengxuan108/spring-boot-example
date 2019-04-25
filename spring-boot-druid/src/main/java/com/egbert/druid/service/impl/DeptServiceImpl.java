package com.egbert.druid.service.impl;

import com.egbert.druid.dao.IDeptDAO;
import com.egbert.druid.service.IDeptService;
import com.egbert.druid.vo.Dept;
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
