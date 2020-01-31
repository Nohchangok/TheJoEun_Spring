package test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring0130_ex.customer.dao.CustomerDao;
import spring0130_ex.customer.dto.CustomerDto;
import spring0130_ex.customer.service.CustomerService;
import spring0130_ex.customer.service.CustomerServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="file:src/config/beans.xml")
public class CustomerTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	CustomerService customerService;
	
	
	@Test @Ignore
	public void test() throws SQLException {
		DataSource ds = context.getBean("dataSource", DataSource.class);
		assertNotNull(ds.getConnection());
	}
	
	
	@Test @Ignore
	public void insetTest() {
		CustomerDto customerDto = new CustomerDto(3, "sssss", "한글", LocalDate.now());
		//customerDao.insert(customerDto);
		customerService.insertCustomer(customerDto);
	}
	
	@Test @Ignore
	public void updateTest() {
		CustomerDto customerDto = new CustomerDto(1, "NONO", "모릅니다", LocalDate.now());
		customerDao.update(customerDto);
	}
	
	@Test @Ignore
	public void deleteTest() {
		customerDao.delete(1);
	}
	
	@Test @Ignore
	public void listTest(){
		System.out.println(customerDao.readAll());
	}
	
	@Test 
	public void readUserId(){
		//CustomerDto customerDto = customerDao.readUserId("kim");
		//System.out.println(customerDto);
		CustomerDto customerDto = customerService.getUserId("sssss");
		System.out.println(customerDto);
	}
	
	@Test @Ignore
	public void readCustomerId(){
		System.out.println(customerDao.readCustomerId(1));
	}

}
