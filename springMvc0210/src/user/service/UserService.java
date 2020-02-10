package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.dto.User;
import user.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	UserMapper mapper;
	
	public int insertUser(User user) throws DuplicateUserId {
		//아이디 중복 체크
		User dbUser = mapper.selectUserOne(user.getUserId());
		
		//기존 아이디가 있으면 예외를 발생시켜서 아이디가 중복된다고
		if(dbUser != null) {
			throw new DuplicateUserId();
		}
		return mapper.insertUser(user);
	}
	
}
