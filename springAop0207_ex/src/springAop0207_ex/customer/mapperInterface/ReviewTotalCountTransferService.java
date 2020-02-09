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
	
	
	//�������̺� �߰� �� customer���̺� ��Ż�����÷��� �߰��ϱ�.
	@Transactional
	public void reviewTotalCnt(int reCustomerId, String msg) {
		//�����߰��ϱ�.
		reviewDto.setCustomerId(reCustomerId);
		reviewDto.setReview(msg);
		review.insertReview(reviewDto);
		
		//id�������� review�� ī������ ���� ����.
		int cnt = review.ReviewCut(reCustomerId);
		
		//customer���̺� review���̺� customer_id�� ������ customer_id�� �ִ��� Ȯ��
		
		//select�Ͽ� 
		CustomerDto customerId = customer.selectOneCustomer(customerDto, reCustomerId);
		
		if(customerId != null) {
			customer.updateReviewCnt(cnt, reCustomerId);			
			System.out.println("����!");
		}else {
			System.out.println("customer ���̺� �´� id���� ����~~");
			//�ͼ���ó���� �ؼ� �ѹ�ó���� ���ش�.
		}
		//customerId�� review�ۼ��� cnt�� �Ѱ����� customer���̺�� 1�� �߰��Ǿ� ������Ʈ �Ǵ� �޼ҵ�.
	}
	

}
