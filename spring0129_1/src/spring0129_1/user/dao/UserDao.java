package spring0129_1.user.dao;

import java.util.List;

import spring0129_1.user.dto.UserDto;

public interface UserDao {
	//crud�� �ϴ� ����.
	public void insert(UserDto user);
	
	public List<UserDto> readAll();
	
	public void delete(String id);
	
	public void update(UserDto user);
	
	public UserDto read(String id);
}
