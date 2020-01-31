package spring0129_1.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring0129_1.user.dao.UserDao;
import spring0129_1.user.dto.UserDto;

//서비스의 역할을 할 클래스를 지정하기 위해 어노테이션을 붙여줌.
//스프링의 빈으로 등록함. (Component)와 같음.
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	@Override
	public void insertUser(UserDto user) {
		//dao를 이용해서 user를 가져와 실행한다.
		userDao.insert(user);
	}

	@Override
	public List<UserDto> getUserList() {
		//dao를 이용해서 user리스트를 가져와 반환한다.
		return userDao.readAll();
	}

	@Override
	public void deleteUser(String id) {
		//id를 파라미터로 받아서 dao를 이용해 user를 삭제한다.
		userDao.delete(id);
	}

	@Override
	public void updateUser(UserDto user) {
		//dao를 이용해 user의 정보를 갱신한다.
		userDao.update(user);
		
	}

	@Override
	public UserDto getUser(String id) {
		return userDao.read(id);
	}

}
