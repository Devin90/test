package com.weimob.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimob.mybatis.client.UserMapper;
import com.weimob.mybatis.model.User;
import com.weimob.mybatis.model.UserExample;
import com.weimob.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User checkUser(String username, String password) {
		UserExample example = new UserExample();
		example.createCriteria().andUserNameEqualTo(username).andPassWordEqualTo(password);
		List<User> list = userMapper.selectByExample(example);
		if(list.size()==1){
			return list.get(0);
		}else{
			return null;
		}
	}

}
