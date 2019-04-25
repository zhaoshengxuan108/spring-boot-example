package com.egbert.mybatis.xml.mulidatasource.mapper.test1;

import com.egbert.mybatis.xml.mulidatasource.model.User;

import java.util.List;

public interface User1Mapper {
	
	List<User> getAll();
	
	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}