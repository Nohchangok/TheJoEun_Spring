package spring0130_ex.customer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import spring0130_ex.customer.dto.CustomerDto;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insert(CustomerDto customer) {
		String sql = "insert into customer(user_id, name, birth) values(?,?,?)";
		jdbcTemplate.update(sql,customer.getUserId(), customer.getName(),
				customer.getBirth());
	}

	@Override
	public void update(CustomerDto customer) {
		String sql = "update customer set user_id=?, name=?, birth=? where customer_id=?";
		jdbcTemplate.update(sql, customer.getUserId(), customer.getName(), customer.getBirth(),
				customer.getCustomerId());

	}

	@Override
	public void delete(int customerId) {
		String sql = "delete from customer where customer_id=?";
		jdbcTemplate.update(sql, customerId);
	}

	@Override
	public CustomerDto readUserId(String userId) {
		String sql = "select customer_id, user_id, name, birth from customer where user_id=?";
		CustomerDto customerDto = (CustomerDto)jdbcTemplate.queryForObject(sql, new Object[] {userId}, new CustomerMapper());
		return customerDto;
	}
	
	@Override
	public CustomerDto readCustomerId(int customerId) {
		String sql = "select customer_id, user_id, name, birth from customer where customer_id=?";
		CustomerDto customerDto = (CustomerDto)jdbcTemplate.queryForObject(sql, new Object[] {customerId}, new CustomerMapper());
		return customerDto;
	}
	
	class CustomerMapper implements RowMapper<CustomerDto>{

		@Override
		public CustomerDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			CustomerDto customerDto = new CustomerDto();
			customerDto.setCustomerId(rs.getInt("customer_id"));
			customerDto.setUserId(rs.getString("user_id"));
			customerDto.setName(rs.getString("name"));
			customerDto.setBirth(rs.getDate("birth").toLocalDate());
			return customerDto;
		}
		
	}

	@Override
	public List<CustomerDto> readAll() {
		String sql = "select customer_id, user_id, name, birth from customer";
		List<CustomerDto> customerList =  jdbcTemplate.query(sql, new CustomerMapper());
		return customerList;
	}

}
