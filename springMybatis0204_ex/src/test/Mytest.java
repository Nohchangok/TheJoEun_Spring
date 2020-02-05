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

import spring0204_ex.customer.dto.ReviewDto;
import spring0204_ex.customer.mapperInterface.CustomerMapper;
import spring0204_ex.customer.mapperInterface.ReviewMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/config/springContext.xml")
public class Mytest {

	@Autowired
	private CustomerMapper customer;
	
	@Autowired
	private ReviewMapper review;

	@Test 
	public void reviewInsert() {
		ReviewDto reviewDto = new ReviewDto();
		reviewDto.setCustomerId(3);
		reviewDto.setReview("���־ߺ���");
		review.insertReview(reviewDto);
		
		//id�������� cnt�� ����.
		int customerId = reviewDto.getCustomerId(); //2
		
		//id�������� review�� ī������ ���� ����.
		int cnt = review.ReviewCut(customerId);
		
		//customerId �� ����
		int id = reviewDto.getCustomerId();
		
		//customerId�� review�ۼ��� cnt�� �Ѱ����� customer���̺�� 1�� �߰��Ǿ� ������Ʈ �Ǵ� �޼ҵ�.
		customer.updateReviewCnt(cnt, id);
	}
	
	@Test @Ignore
	public void reviewCut() {
		int cnt = review.ReviewCut(4);
	}
	
}
