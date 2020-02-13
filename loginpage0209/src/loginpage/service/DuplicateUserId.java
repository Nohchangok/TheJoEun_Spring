package loginpage.service;


//아이디 중복시 발생하는 예외
public class DuplicateUserId extends Exception {
	
	public DuplicateUserId(String msg) {
		super(msg);
	}
	
	public DuplicateUserId() {
		super();
	}

}
