package springAop0207_ex.customer.mapperInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springAop0207_ex.customer.dto.CustomerDto;
import springAop0207_ex.customer.dto.ReviewDto;

@Service
public class ReviewTotalCountTransferService {
	
	@Autowired
	private CustomerMapper customer;
	
	@Autowired
	private ReviewMapper review;
	
	@Autowired
	ReviewDto reviewDto = new ReviewDto();
	
	@Autowired
	CustomerDto customerDto = new CustomerDto();
	
	
	//리뷰테이블 추가 후 customer테이블 토탈리뷰컬럼에 추가하기.
	@Transactional
	public void reviewTotalCnt(int reCustomerId, String msg) {
		//리뷰추가하기.
		reviewDto.setCustomerId(reCustomerId);
		reviewDto.setReview(msg);
		review.insertReview(reviewDto);
		
		//id기준으로 review를 카운터한 갯수 추출.
		int cnt = review.ReviewCut(reCustomerId);
		
		//customer테이블에 review테이블 customer_id와 동일한 customer_id가 있는지 확인
		
		//select하여 
		CustomerDto customerId = customer.selectOneCustomer(customerDto, reCustomerId);
		
		if(customerId != null) {
			customer.updateReviewCnt(cnt, reCustomerId);			
			System.out.println("성공!");
		}else {
			System.out.println("customer 테이블에 맞는 id값이 없어~~");
			//익셉션처리를 해서 롤백처리를 해준다.
		}
		//customerId로 review작성시 cnt의 총갯수가 customer테이블로 1씩 추가되어 업데이트 되는 메소드.
	}
	

}
