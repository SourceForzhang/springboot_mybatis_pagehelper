package com.it.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.mapper.UserMapper;
import com.it.pojo.User;
import com.it.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		System.out.println("go_bypk");
		User user = userMapper.selectByPrimaryKey(id);
		System.out.println(user.getName());
		return user;
	}

	@Override
	public List<User> selectAll() {
		System.out.println("go_all");
		List<User> selectAll = userMapper.selectAll();
		System.out.println(selectAll);
		return selectAll;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
