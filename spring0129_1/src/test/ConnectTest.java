package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring0129_1.user.controller.UserController;
import spring0129_1.user.dao.UserDao;
import spring0129_1.user.dto.UserDto;

@RunWith(SpringJUnit4ClassRunner.class)//스프링 컨테이너 생성.
@ContextConfiguration(locations = "file:src/config/beans.xml")
public class ConnectTest {

   @Autowired
   ApplicationContext context;
   
   @Autowired//메소드마다 객체 받아오니까 아예 주입받아 쓰자.
   UserDao dao;
   
   @Test @Ignore
   public void test() throws SQLException {
      DataSource ds = context.getBean(DataSource.class);
      assertNotNull(ds.getConnection());
   }
   @Test @Ignore
   public void daoTest() {
//      UserDao dao = context.getBean(UserDao.class);
      UserDto dto = new UserDto("test1", "name1", "nick1");
      dao.insert(dto);
   }
   
   @Test @Ignore
   public void readAllTest() {
      assertNotNull(dao.readAll());
      System.out.println(dao.readAll());
   }
   
   @Test
   public void writeTest() {
      UserDto user = new UserDto();
      user.setUserId("test3");
      user.setName("name3");
      user.setNickname("nick3");
      UserController cont = context.getBean(UserController.class);
      cont.write(user);
   }
   
   

}