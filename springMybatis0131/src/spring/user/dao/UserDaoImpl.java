package spring.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import spring.user.dto.UserDto;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(UserDto user) {
		//update는 내가만든 메소드가 아닌 updateQuery랑 같은것.
		session.update("userSession.insertUser",user);
	}

	@Override
	public List<UserDto> readAll() {
		return session.selectList("userSession.selectUserList");
	}

	@Override
	public void delete(String id) {
		session.update("userSession.deleteUser",id);
	}

	@Override
	public void update(UserDto user) {
		session.update("userSession.updateUser", user);
	}

	@Override
	public UserDto read(String id) {
		return session.selectOne("userSession.selectUserById", id);
	}

}
