package com.weimob.service;

import com.weimob.mybatis.model.User;

public interface UserService {

	User checkUser(String username, String password);

}
