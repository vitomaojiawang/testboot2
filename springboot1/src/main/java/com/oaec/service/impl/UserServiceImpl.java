package com.oaec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.oaec.mapper.UserMapper;
import com.oaec.pojo.User;
import com.oaec.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectUsers() {
		// TODO Auto-generated method stub
		return userMapper.queryAllUsers();
	}

	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	@Override
	public int insertUsers(User user) {
		int i = 0;
		i=i+userMapper.insertUser(user);
		int num=1/0;
		i=i+userMapper.insertUser(user);
		return i;
	}
	
	
}
