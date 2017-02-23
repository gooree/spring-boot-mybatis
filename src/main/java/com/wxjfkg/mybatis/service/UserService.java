package com.wxjfkg.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxjfkg.mybatis.dao.UserDao;
import com.wxjfkg.mybatis.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<User> findAll() {
		return userDao.findAll();
	}
	
	public int save(User user) {
		return userDao.save(user);
	}
	
}
