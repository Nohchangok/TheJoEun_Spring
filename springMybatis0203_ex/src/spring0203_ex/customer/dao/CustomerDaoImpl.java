package spring0203_ex.customer.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring0203_ex.customer.dto.CustomerDto;
import spring0203_ex.customer.mapperInterface.CustomerMapper;

@Repository("customerDao")
public class CustomerDaoImpl {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public void insertCustomer(int customerId, String userId, String name, LocalDate birth, LocalDateTime regDate) {
		customerMapper.insertCustomer(customerId, userId, name, birth, regDate);
	}
	public List<CustomerDto> selectCustomer(int start, int end) {
		return customerMapper.selectList(start, end);
	}
	
	public void updateCustomer(Map<String, Object> customerMap) {
		customerMapper.updateCustomer(customerMap);
	}
	
	public void deleteCustomer(int customerId) {
		customerMapper.deleteCustomer(customerId);
	}
	
	public CustomerDto selectOne(Map<String, Integer> customerMap) {
		return customerMapper.selectOne(customerMap);
		
	}
	
	
}
