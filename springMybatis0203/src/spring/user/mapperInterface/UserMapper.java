
package spring.user.mapperInterface;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import spring.user.dto.UserDto;

public interface UserMapper {
	//���̹�Ƽ�� ������ �ۼ��ϴ� XML�� anotaion������� ����ϱ� ���� ����.
	
	@Insert("insert into users values(#{userId},#{name},#{nickname})")
	public void insertUser(UserDto user);
	
	@Update("update users set name=#{name}, nickname=#{nickname} where user_id=#{userId}")
	public void updateUser(UserDto user);
	
	@Delete("delete from users where user_id=#{userId}")
	public void deleteUser(String userId);
	
	public List<UserDto> selectList();
	
	@Select("select * from users where user_id=#{userId}")
	public UserDto selectOne(String userId);
}
