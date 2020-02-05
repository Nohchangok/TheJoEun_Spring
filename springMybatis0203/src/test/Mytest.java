package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.user.dao.UserDaoImpl;
import spring.user.dto.UserDto;
import spring.user.mapperInterface.UserMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/config/springContext.xml")
public class Mytest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void test() {
		List<UserDto> list = userMapper.selectList();
		for (UserDto userDto : list) {
			System.out.println(userDto+"!");
		}
		//sqlSession.select(namespace, id)
	}

}
