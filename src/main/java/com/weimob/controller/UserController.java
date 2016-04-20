package com.weimob.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.weimob.mybatis.model.User;
import com.weimob.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/checkUser")	
	public ModelAndView checkUser(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("user");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user=userService.checkUser(username,password);
		System.out.println(user);
		mv.addObject("user",user);
		return mv;
	}
}
