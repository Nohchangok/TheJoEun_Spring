package account.service;

public class AccountException extends RuntimeException{
	
	public AccountException() {
		super();
	}
	
	public AccountException(String msg) {
		System.out.println(msg);
	}

}
