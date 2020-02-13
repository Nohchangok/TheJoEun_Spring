package user.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import user.dto.CustomerDto;
import user.dto.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	//user/join
	@RequestMapping("/join")
	public String joinForm() {
		return "joinForm";
	}
	
	@GetMapping("/view")
	   public String getIndexView() {
	      return "view";
	   }
	
	//ajax방식으로 데이터를 보내는 방법.
	//화면이 아니라 데이터를 보내기 때문에 알맞은 형식으로 변겨해야한다.
	//그러나 직접 변경하는게 너~~무 귀찮으니 라이브러리를 가져다 쓰자!(jackson Databind)
	@RequestMapping("/userdata")
	public @ResponseBody User testResponse() {
		User user = new User("김형주", "김형주", "nono", LocalDate.now());
		
		return user;
	}
	
	/*
	 * @GetMapping("/customer") public String getView() { return "view"; }
	 * 
	 * @RequestMapping("/customerdata") public @ResponseBody CustomerDto test() {
	 * CustomerDto customer = new CustomerDto(0, "허허",
	 * "하하",LocalDate.parse("1994-12-12") , LocalDate.now());
	 * 
	 * return customer;
	 * 
	 * }
	 */
}
