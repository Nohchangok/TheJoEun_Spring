package spring0129_1.user.dto;

public class UserDto {
	private String userId;
	private String name;
	private String nickname;
	
	public UserDto() {
		super();
	}
	
	public UserDto(String userId, String name, String nickname) {
		super();
		this.userId = userId;
		this.name = name;
		this.nickname = nickname;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", name=" + name + ", nickname=" + nickname + "]";
	}
	
}