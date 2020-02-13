package loginpage.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class UserDto {
	
	private int customerId;
	private String userId;
	private String password;
	private	String name;
	private	String email;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birth;
	private LocalDate regDate;
	
	public UserDto() {
		super();
	}

	public UserDto(int customerId, String userId, String password, String name, String email, LocalDate birth,
			LocalDate regDate) {
		super();
		this.customerId = customerId;
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return "UserDto [customerId=" + customerId + ", userId=" + userId + ", password=" + password + ", name=" + name
				+ ", email=" + email + ", birth=" + birth + ", regDate=" + regDate + "]";
	} 
	
	
}
