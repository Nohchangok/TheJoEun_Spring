package spring.user.dao;

import java.util.List;

import spring.user.dto.UserDto;

public interface UserDao {
	//crud를 하는 아이.
	public void insert(UserDto user);
	
	public List<UserDto> readAll();
	
	public void delete(String id);
	
	public void update(UserDto user);
	
	public UserDto read(String id);
}
