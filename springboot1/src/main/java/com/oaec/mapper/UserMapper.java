package com.oaec.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.oaec.pojo.User;

public interface UserMapper {

	@Select("select * from users")
	List<User> queryAllUsers();
	
	@Insert("insert into users values(seq_users.nextval,#{user_name},#{user_pwd},#{user_type},#{user_extra})")
	int insertUser(User user);
	
	
}
