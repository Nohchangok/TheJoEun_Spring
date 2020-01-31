package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring0131_ex.customer.dao.CustomerDao;
import spring0131_ex.customer.dto.CustomerDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/config/CustomerContext.xml")

public class Mytest {

	@Autowired
	ApplicationContext context;

	@Autowired
	CustomerDao customerDao;

	@Test @Ignore
	public void insertTest() {
		customerDao.insert(new CustomerDto(0, "ÀÌ¼¾½º", "ÀÌ½ÂÁØ", LocalDate.parse("2019-01-01", DateTimeFormatter.ISO_DATE),
				LocalDateTime.now()));
	}

	@Test @Ignore
	public void updateTest() {
		customerDao.update(new CustomerDto(1,"´¢´¢´¢", "³ë¶¥½º", LocalDate.parse("2019-10-10", DateTimeFormatter.ISO_DATE),
				LocalDateTime.now()));
		System.out.println("¾÷µ¥ÀÌÆ® ¼º°ø");
	}
	
	@Test @Ignore
	public void deleteTest() {
		customerDao.delete("ÀÌ¼¾½º");
		System.out.println("»èÁ¦¿Ï·á");
	}
	
	@Test @Ignore
	public void selectTest1() {
		CustomerDto customerDto = customerDao.readCustomerId(1);
		System.out.println(customerDto);
	}
	
	@Test @Ignore
	public void selectTest2() {
		CustomerDto customerDto = customerDao.readUserId("kim");
		System.out.println(customerDto);
	}
	
	@Test 
	public void selectTest3() {
		List<CustomerDto> customerDto = customerDao.readAll(3);
		System.out.println(customerDto);
	}
	
	
}
