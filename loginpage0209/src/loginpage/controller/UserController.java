package loginpage.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import loginpage.dto.UserDto;
import loginpage.service.DuplicateUserId;
import loginpage.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@GetMapping("/login")
	public String loginView() {
		return "login";
	}

	@GetMapping("/register")
	public String registerView() {
		return "register";
	}

	@PostMapping("/registerAdd")
	public void registerAdd(UserDto user) throws DuplicateUserId{
		
		user.setRegDate(LocalDate.now());
		System.out.println("레츠고");
		
		//이게왜안되지??
		int rs = service.insertUser(user);

		if (rs == 1) {
			System.out.println("삽입성공");
		} else {
			System.out.println("삽입실패");
		}
	}

	// 로그인 후 메인페이지
	@GetMapping("/main")
	public String mainView() {
		return "main";
	}

}
