package com.egbert.druid.service;

import com.egbert.druid.vo.Dept;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IDeptService {

	@Transactional(readOnly=true)
	List<Dept> list();
	
	@Transactional(propagation= Propagation.REQUIRED)
	boolean add(Dept dept);
	
}
