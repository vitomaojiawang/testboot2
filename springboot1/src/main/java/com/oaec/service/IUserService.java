package com.oaec.service;

import java.util.List;

import com.oaec.pojo.User;

public interface IUserService {
	
	List<User> selectUsers();
	
	int insertUsers(User user);
}
