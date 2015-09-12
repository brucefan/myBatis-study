package com.mapper;

import java.util.List;

import com.entity.User;

public interface UserMapper {

	public User selectUser(User param);
	
	public List<User> selectUsers();
}
