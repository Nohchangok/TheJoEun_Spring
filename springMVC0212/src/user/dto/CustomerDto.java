package user.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDto {

	private int customerId;
	private String userId;
	private String name;
	private LocalDate birth;
	private LocalDate regDate;
	
	public CustomerDto() {
		super();
	}

	public CustomerDto(int customerId, String userId, String name, LocalDate birth, LocalDate regDate) {
		super();
		this.customerId = customerId;
		this.userId = userId;
		this.name = name;
		this.birth = birth;
		this.regDate = regDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", userId=" + userId + ", name=" + name + ", birth=" + birth
				+ ", regDate=" + regDate + "]";
	}

}