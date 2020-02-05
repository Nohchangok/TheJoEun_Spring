package spring0204_ex.customer.mapperInterface;

import org.apache.ibatis.annotations.Param;

import spring0204_ex.customer.dto.ReviewDto;

public interface ReviewMapper {
	
	public void insertReview(ReviewDto reviewDto);
	
	//customer_id이 같은 것끼리 카운터한 갯수
	public int ReviewCut(int customerId);

}
