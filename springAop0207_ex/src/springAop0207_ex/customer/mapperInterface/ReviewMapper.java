package springAop0207_ex.customer.mapperInterface;

import org.apache.ibatis.annotations.Param;

import springAop0207_ex.customer.dto.ReviewDto;

public interface ReviewMapper {
	
	public int insertReview(ReviewDto reviewDto);
	
	//customer_id�� ���� �ͳ��� ī������ ����
	public int ReviewCut(int customerId);

}
