
package spring.user.mapperInterface;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import spring.user.dto.UserDto;

public interface UserMapper {
	//마이바티스 쿼리를 작성하던 XML을 anotaion방식으로 사용하기 위한 아이.
	
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
