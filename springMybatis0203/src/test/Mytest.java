package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.user.dao.UserDaoImpl;
import spring.user.dto.UserDto;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/config/springContext.xml")
public class Mytest {

	@Autowired
	private UserDaoImpl userDao;
	@Test
	public void test() {
		userDao.insertUser(new UserDto("hello", "hello", "hello"));
	}

}
