package spring0131_ex.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring0131_ex.customer.dao.CustomerDao;
import spring0131_ex.customer.dto.CustomerDto;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	
	@Override
	public void insertCustomer(CustomerDto customer) {
		customerDao.insert(customer);
	}

	@Override
	public void updateCustomer(CustomerDto customer) {
		customerDao.update(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		customerDao.delete(customerId);
	}

	@Override
	public List<CustomerDto> getCustomerList() {
		return customerDao.readAll();
	}

	@Override
	public CustomerDto getCustomerId(int customerId) {
		return customerDao.readCustomerId(customerId);
	}
	

	@Override
	public CustomerDto getUserId(String userId) {
		return customerDao.readUserId(userId);
	}

}
