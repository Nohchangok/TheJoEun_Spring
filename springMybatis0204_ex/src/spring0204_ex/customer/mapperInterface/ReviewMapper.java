package spring0204_ex.customer.mapperInterface;

import org.apache.ibatis.annotations.Param;

import spring0204_ex.customer.dto.ReviewDto;

public interface ReviewMapper {
	
	public void insertReview(ReviewDto reviewDto);
	
	//customer_id�� ���� �ͳ��� ī������ ����
	public int ReviewCut(int customerId);

}
