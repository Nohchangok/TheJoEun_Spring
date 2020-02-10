package user.mapper;

import java.util.List;

import user.dto.User;

public interface UserMapper {
	
	public int insertUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(String userId);
	
	public List<User> selectUserList();
	
	public User selectUserOne(String userId);

}
