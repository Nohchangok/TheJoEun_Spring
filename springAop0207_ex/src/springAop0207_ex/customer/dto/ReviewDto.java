package springAop0207_ex.customer.dto;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewDto {
	
	private int reviewId;
	private int customerId;
	private String review;
	
	public ReviewDto() {
		super();
	}

	public ReviewDto(int reviewId, int customerId, String review) {
		super();
		this.reviewId = reviewId;
		this.customerId = customerId;
		this.review = review;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "ReviewDto [reviewId=" + reviewId + ", customerId=" + customerId + ", review=" + review + "]";
	}
	
}
