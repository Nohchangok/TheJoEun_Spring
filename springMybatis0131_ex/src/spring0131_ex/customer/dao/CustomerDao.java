package spring0131_ex.customer.dao;

import java.util.List;

import spring0131_ex.customer.dto.CustomerDto;

public interface CustomerDao {
	//crud
	
	public void insert(CustomerDto customer);
	
	public void update(CustomerDto customer);
	
	public void delete(String userId);
	
	public CustomerDto readUserId(String userId);
	
	public CustomerDto readCustomerId(int customerId);
	
	public List<CustomerDto> readAll(int limit);

}
