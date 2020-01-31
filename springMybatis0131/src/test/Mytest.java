package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.user.dao.UserDao;
import spring.user.dto.UserDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/config/SpringContext.xml")

public class Mytest {

	@Autowired
	ApplicationContext context;
	
	@Autowired
	UserDao userDao;
	
	@Test @Ignore
	public void test() {
		userDao.insert(new UserDto("mybatis1", "mybatis","mybatis"));
	}

	@Test @Ignore
	public void test1() {
		List<UserDto> list = userDao.readAll();
		for (UserDto userDto : list) {
			System.out.println(userDto);
		}
	}
	
	@Test
	public void test2() {
		userDao.delete("mybatis1");
		System.out.println("삭제완료");
	}
}
