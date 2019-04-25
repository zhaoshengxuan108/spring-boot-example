package com.egbert.druid.dao;

import com.egbert.druid.vo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IDeptDAO {
	public List<Dept> findAll();
	
	public boolean doCreate(Dept dept);
}
