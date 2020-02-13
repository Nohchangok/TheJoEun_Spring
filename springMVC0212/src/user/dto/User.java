package user.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


public class User {
	
	private String userId;
	private String name;
	private String nickname;
	
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birth;

	public User(String userId, String name, String nickname, LocalDate birth) {
		super();
		this.userId = userId;
		this.name = name;
		this.nickname = nickname;
		this.birth = birth;
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getNickname() {
		return nickname;
	}

	public LocalDate getBirth() {
		return birth;
	}
	
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", nickname=" + nickname + ", birth=" + birth + "]";
	}
	
}
