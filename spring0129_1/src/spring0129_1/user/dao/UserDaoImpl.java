package spring0129_1.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import spring0129_1.user.dto.UserDto;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	//쿼리를 실행시켜주는 클래스
	//쿼리문을 날려주는 아이 jdbcTemplat
	@Autowired
	private JdbcTemplate jdbcTemlate;
	
	//jdbc라는 객체를 만들어서 넣어주려고.
	//datasource가 connect대체
	//connect(연결)된걸 사용하겠다.

// 빈으로 등록해서 사용!!
//	@Autowired
//	public UserDaoImpl(DataSource dataSource) {
//		System.out.println("construct userDao");
//		this.jdbcTemlate = new JdbcTemplate(dataSource);
//	}
	
	@Override
	public void insert(UserDto user) {
		String sql = "insert into users(user_id, name, nickname) values(?,?,?)";
		jdbcTemlate.update(sql, user.getUserId(), user.getName(), user.getNickname());
	}

	@Override
	public List<UserDto> readAll() {
		String sql = "select user_id, name, nickname from users";
		//query(쿼리문, 결과)
		//query메소드는 두번째 파라미터형태의 리스트를 만들어 반환시켜준다.
		List<UserDto> userList = jdbcTemlate.query(sql, new UserMapper());		
		return userList;
	}
	
	//결과로 받은 로우를 받아줄 클래스.
	//jdbcTemplate이 결과로우들을 리스트로 만들기 위해서는 RowMapper형태여야 한다.
	//따라서 RowMapper인터페이스를 구현한 클래스를 만들어서 그 아이를 이용해서 쓴다.
	class UserMapper implements RowMapper<UserDto>{
		@Override
		public UserDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			//하나의 로우를 하나의 DTO 객체로 맵핑시키는 부분을 구현
			UserDto user = new UserDto();
			user.setUserId(rs.getString("user_id"));
			user.setName(rs.getString("name"));
			user.setNickname(rs.getString("Nickname"));
			return user;
		}
		
	}

	@Override
	public void delete(String id) {
		String sql = "delete from users where user_id=?";
		jdbcTemlate.update(sql, id);
	}

	@Override
	public void update(UserDto user) {
		String sql = "update user set name = ?, nickname = ? where user_id = ?";
		jdbcTemlate.update(sql, user.getName(), user.getNickname(), user.getUserId());
		
	}

	@Override
	public UserDto read(String id) {
		String sql = "select user_id, name, nickname from users where user_id = ?";
		
		//queryForObject 메소드.
		//select를 이용해서 row 하나 가져올 때 사용.
		//<T> queryForObject(String sql, [,sql 파라미터], RowMapper<T> rm)
		UserDto user = (UserDto)jdbcTemlate.queryForObject(sql, new Object[] {id}, new UserMapper());
		return user;
	}

}
