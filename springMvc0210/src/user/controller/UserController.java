package user.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import user.dto.User;
import user.service.DuplicateUserId;
import user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/hello")
	public String helloMvcView() {
//		return "/WEB-INF/view/hello.jsp";
		
		return "hello";
	}
	
	//input의 method방식이 post인 경우 && inputForm.jsp의 for의 action이 /insertPost일 경우 아래의 메소드 실행.
	//insert를 실행시키는 메소드
	@RequestMapping(value= "/insertPost", method = RequestMethod.POST)
	public ModelAndView insertUser(@RequestParam("birthStr") String birth,User user) {
		ModelAndView mv = new ModelAndView();
		try {
			user.setBirth(LocalDate.parse(birth));
			int rs = service.insertUser(user);
			if(rs==1) {
				mv.addObject("result", "삽입성공했음");
			}else {
				mv.addObject("result", "삽입실패했음");
			}
		}catch(DuplicateUserId e) {
			mv.addObject("result", "아이디가 중복되었음");
		}
		mv.setViewName("list");
		return mv;
	}
	
	//insert폼으로 연결시켜주는 메소드
	//url로 접근시 method방식이 get인 메소드를 실행하여 inputForm.jsp 화면을 보여줌
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insertUserForm() {
		return "inputForm";
		
	}
	
	//update폼을 연결시켜주는 메소드
	@GetMapping("/update")
	public String updateUserForm(Model model, String userId) {
		User user = service.selectUserOne(userId);
		
		model.addAttribute("user",user);
		
		return "updateForm";
		
	}
	
	@PostMapping("/update")
	public String updateUserController(Model model, @RequestParam("birthStr") String birth, User user) {
		
		user.setBirth(LocalDate.parse(birth));
		int rs = service.updateUser(user);
		
		if(rs==1) {
			model.addAttribute("result", "수정 성공했슈");
			return "list";
		}else {
			return "redirect:/update?userId="+user.getUserId();
		}
	}
	
	@RequestMapping("/list")
	public String selectUserList(Model model) {
		List<User> list = service.selectUserList();
		model.addAttribute("userList",list);
		return "list";
	}
}
