package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springAop0207_ex.customer.dto.CustomerDto;
import springAop0207_ex.customer.mapperInterface.CustomerMapper;
import springAop0207_ex.customer.mapperInterface.ReviewMapper;
import springAop0207_ex.customer.mapperInterface.ReviewTotalCountTransferService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/config/springContext.xml")
public class Mytest {

	@Autowired
	private CustomerMapper customer;
	
	@Autowired
	ReviewTotalCountTransferService service;

	@Test
	public void test() {
		service.reviewTotalCnt(1, "안되겠지?");
	}
	
	
}
