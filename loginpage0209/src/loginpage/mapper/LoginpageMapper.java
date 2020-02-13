package loginpage.mapper;

import java.util.List;

import loginpage.dto.UserDto;

public interface LoginpageMapper {
	
	public int insertUser(UserDto user);
	
	public UserDto selectUserOne(String userId);
//	public int updateUser(UserDto user);
//	
//	public int deleteUser(String userId);
//	
//	public List<UserDto> selectUserList();
//	
	
}
