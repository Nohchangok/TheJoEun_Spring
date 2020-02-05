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
		reviewDto.setReview("형주야봐봐");
		review.insertReview(reviewDto);
		
		//id기준으로 cnt값 추출.
		int customerId = reviewDto.getCustomerId(); //2
		
		//id기준으로 review를 카운터한 갯수 추출.
		int cnt = review.ReviewCut(customerId);
		
		//customerId 값 추출
		int id = reviewDto.getCustomerId();
		
		//customerId로 review작성시 cnt의 총갯수가 customer테이블로 1씩 추가되어 업데이트 되는 메소드.
		customer.updateReviewCnt(cnt, id);
	}
	
	@Test @Ignore
	public void reviewCut() {
		int cnt = review.ReviewCut(4);
	}
	
}
