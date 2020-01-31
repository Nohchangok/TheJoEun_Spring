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

	//������ ��������ִ� Ŭ����
	//�������� �����ִ� ���� jdbcTemplat
	@Autowired
	private JdbcTemplate jdbcTemlate;
	
	//jdbc��� ��ü�� ���� �־��ַ���.
	//datasource�� connect��ü
	//connect(����)�Ȱ� ����ϰڴ�.

// ������ ����ؼ� ���!!
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
		//query(������, ���)
		//query�޼ҵ�� �ι�° �Ķ���������� ����Ʈ�� ����� ��ȯ�����ش�.
		List<UserDto> userList = jdbcTemlate.query(sql, new UserMapper());		
		return userList;
	}
	
	//����� ���� �ο츦 �޾��� Ŭ����.
	//jdbcTemplate�� ����ο���� ����Ʈ�� ����� ���ؼ��� RowMapper���¿��� �Ѵ�.
	//���� RowMapper�������̽��� ������ Ŭ������ ���� �� ���̸� �̿��ؼ� ����.
	class UserMapper implements RowMapper<UserDto>{
		@Override
		public UserDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			//�ϳ��� �ο츦 �ϳ��� DTO ��ü�� ���ν�Ű�� �κ��� ����
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
		
		//queryForObject �޼ҵ�.
		//select�� �̿��ؼ� row �ϳ� ������ �� ���.
		//<T> queryForObject(String sql, [,sql �Ķ����], RowMapper<T> rm)
		UserDto user = (UserDto)jdbcTemlate.queryForObject(sql, new Object[] {id}, new UserMapper());
		return user;
	}

}
