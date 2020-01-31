package spring0129_1.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring0129_1.user.dto.UserDto;
import spring0129_1.user.service.UserService;

@Controller
public class UserController {
	
	//UserService는 UserServiceImpl에 implements로 되어있고 impl의 빈이름이 userService로 되어있음.
	@Autowired
	UserService userService;
	//유저를 넣어줘라는 요청이 있을 시 실행할 메소드.
	public void write(UserDto user) {
		userService.insertUser(user);
		//반환될 화면도 정해줌.
		
	}
		  
}
