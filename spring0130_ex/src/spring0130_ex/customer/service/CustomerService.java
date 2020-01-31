package spring0130_ex.customer.service;

import java.util.List;

import spring0130_ex.customer.dto.CustomerDto;

public interface CustomerService {
	
	public void insertCustomer(CustomerDto customer);
	
	public void updateCustomer(CustomerDto customer);
	
	public void deleteCustomer(int customerId);
	
	public List<CustomerDto> getCustomerList();

	public CustomerDto getCustomerId(int customerId);
	
	public CustomerDto getUserId(String userId);
	
}
