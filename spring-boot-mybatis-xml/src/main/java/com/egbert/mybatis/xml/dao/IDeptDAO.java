package com.egbert.mybatis.xml.dao;

import com.egbert.mybatis.xml.vo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IDeptDAO {
	public List<Dept> findAll();
	
	public boolean doCreate(Dept dept);
}
