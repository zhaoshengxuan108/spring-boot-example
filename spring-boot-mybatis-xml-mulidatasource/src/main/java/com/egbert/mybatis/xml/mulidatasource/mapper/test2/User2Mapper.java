package com.egbert.mybatis.xml.mulidatasource.mapper.test2;

import com.egbert.mybatis.xml.mulidatasource.model.User;

import java.util.List;

public interface User2Mapper {
	
	List<User> getAll();
	
	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}