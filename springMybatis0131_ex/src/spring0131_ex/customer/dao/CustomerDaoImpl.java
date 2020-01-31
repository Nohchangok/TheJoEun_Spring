package spring0131_ex.customer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import spring0131_ex.customer.dto.CustomerDto;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SqlSession session;

	@Override
	public void insert(CustomerDto customer) {
		session.update("customerSession.insertCustomer", customer);
	}

	@Override
	public void update(CustomerDto customer) {
		session.update("customerSession.updateCustomer", customer);
	}

	@Override
	public void delete(String userId) {
		session.delete("customerSession.deleteCustomer", userId);
	}

	@Override
	public CustomerDto readUserId(String userId) {
		return session.selectOne("selectCustomerByUserId", userId);
	}
	
	@Override
	public CustomerDto readCustomerId(int customerId) {
		return session.selectOne("selectCustomerByCustomerId", customerId);
	}

	@Override
	public List<CustomerDto> readAll(int limit) {
		return session.selectList("selectCustomerList", limit);
	}

}
