package spring0129_1.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring0129_1.user.dao.UserDao;
import spring0129_1.user.dto.UserDto;

//������ ������ �� Ŭ������ �����ϱ� ���� ������̼��� �ٿ���.
//�������� ������ �����. (Component)�� ����.
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	@Override
	public void insertUser(UserDto user) {
		//dao�� �̿��ؼ� user�� ������ �����Ѵ�.
		userDao.insert(user);
	}

	@Override
	public List<UserDto> getUserList() {
		//dao�� �̿��ؼ� user����Ʈ�� ������ ��ȯ�Ѵ�.
		return userDao.readAll();
	}

	@Override
	public void deleteUser(String id) {
		//id�� �Ķ���ͷ� �޾Ƽ� dao�� �̿��� user�� �����Ѵ�.
		userDao.delete(id);
	}

	@Override
	public void updateUser(UserDto user) {
		//dao�� �̿��� user�� ������ �����Ѵ�.
		userDao.update(user);
		
	}

	@Override
	public UserDto getUser(String id) {
		return userDao.read(id);
	}

}
