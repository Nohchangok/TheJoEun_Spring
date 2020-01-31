package spring0129_1.user.service;

import java.util.List;

import spring0129_1.user.dto.UserDto;

public interface UserService {
	//유저관련된 비지니스 로직을 수행하는 아이에 대한 인터페이스를 정의.
	
	//유저를 입력하는 메소드 형태.
	public void insertUser(UserDto user);
	
	//유저리스트를 받아오는 메소드 형태
	public List<UserDto> getUserList();
	
	//유저를 삭제하는 메소드 형태.
	public void deleteUser(String id);
	
	//유저를 수정하는 메소드 형태.
	public void updateUser(UserDto user);
	
	//유저를 하나 받아오는 메소드 형태.
	public UserDto getUser(String id);
	
}
