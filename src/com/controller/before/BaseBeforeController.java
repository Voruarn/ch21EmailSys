package com.controller.before;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.exception.UserLoginNoException;

@Controller
public class BaseBeforeController {
	/*
	 *前台用户登录权限控制，处理方法执行前 执行该方法 
	 * @throws UserLoginNoException
	 */
	
	@ModelAttribute
	public void isLogin(HttpSession session,HttpServletRequest request)
		throws UserLoginNoException{
		if(session.getAttribute("emailuser")==null)
			throw new UserLoginNoException("(BaseBeforeController.isLogin)没有登录");
	}
	
	
}
