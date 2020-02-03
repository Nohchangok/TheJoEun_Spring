package spring.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import spring.user.dto.UserDto;
import spring.user.mapperInterface.UserMapper;

@Repository("userDao")
public class UserDaoImpl {
	
	@Autowired
	private UserMapper userMapper;
	
	public void insertUser(UserDto user) {
		userMapper.insertUser(user);
	}
	
	public void deleteUser(String userId) {
		userMapper.deleteUser(userId);
	}
	

}
