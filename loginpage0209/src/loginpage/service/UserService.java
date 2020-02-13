package loginpage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import loginpage.dto.UserDto;
import loginpage.mapper.LoginpageMapper;

@Service
public class UserService {
	
	@Autowired
	LoginpageMapper mapper;
	
	public int insertUser(UserDto user) throws loginpage.service.DuplicateUserId {
		
		UserDto dbUsers = mapper.selectUserOne(user.getUserId());
		
		if(dbUsers != null) {
			throw new DuplicateUserId("아이디가 중복되었음.");
		}
		return mapper.insertUser(user);
	}

}
