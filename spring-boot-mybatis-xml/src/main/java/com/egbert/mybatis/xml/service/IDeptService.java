package com.egbert.mybatis.xml.service;

import com.egbert.mybatis.xml.vo.Dept;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IDeptService {

	@Transactional(readOnly=true)
	public List<Dept> list();
	
	@Transactional(propagation= Propagation.REQUIRED)
	public boolean add(Dept dept);
	
}
