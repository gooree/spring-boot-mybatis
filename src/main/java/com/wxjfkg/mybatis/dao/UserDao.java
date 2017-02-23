package com.wxjfkg.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wxjfkg.mybatis.entity.User;

@Mapper
public interface UserDao {

	public List<User> findAll();
	
	public int save(User user);
	
}
