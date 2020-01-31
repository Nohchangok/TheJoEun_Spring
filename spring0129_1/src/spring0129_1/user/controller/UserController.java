package spring0129_1.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring0129_1.user.dto.UserDto;
import spring0129_1.user.service.UserService;

@Controller
public class UserController {
	
	//UserService�� UserServiceImpl�� implements�� �Ǿ��ְ� impl�� ���̸��� userService�� �Ǿ�����.
	@Autowired
	UserService userService;
	//������ �־����� ��û�� ���� �� ������ �޼ҵ�.
	public void write(UserDto user) {
		userService.insertUser(user);
		//��ȯ�� ȭ�鵵 ������.
		
	}
		  
}
