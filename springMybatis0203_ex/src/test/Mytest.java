package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring0203_ex.customer.dao.CustomerDaoImpl;
import spring0203_ex.customer.dto.CustomerDto;
import spring0203_ex.customer.mapperInterface.CustomerMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/config/springContext.xml")
public class Mytest {

	@Autowired
	CustomerDaoImpl customer;
	
	
	@Test @Ignore
	public void insertTest() {
		customer.insertCustomer(0,"aa121212", "노창옥",LocalDate.parse("1999-11-11", DateTimeFormatter.ISO_DATE),LocalDateTime.now());
	}
	
	@Test @Ignore
	public void selectTest() {
		System.out.println(customer.selectCustomer(1, 4));
	}
	
	@Test @Ignore
	public void updateTest() {
		Map<String, Object> customerMap = new HashMap<String, Object>();
		customerMap.put("user_id", "test");
		customerMap.put("name", "testname");
		customerMap.put("birth", LocalDate.parse("1999-11-11",DateTimeFormatter.ISO_DATE));
		customerMap.put("regDate",LocalDateTime.now());
		customerMap.put("customer_id", 1);
		customer.updateCustomer(customerMap);
	}
	
	@Test @Ignore
	public void deleteTest() {
		customer.deleteCustomer(1);
		System.out.println("삭제완료");
	}

	@Test @Ignore
	public void selectTest2() {
		Map<String, Integer> customerMap = new HashMap<String, Integer>();
		customerMap.put("customerId", 2);
		System.out.println(customer.selectOne(customerMap));
		
	}
}
