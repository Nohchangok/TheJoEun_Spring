package account.dto;

import java.time.LocalDateTime;

public class AccountVO {
	
	private int id;
	private String owner;
	private int balance;
	private LocalDateTime udate;
	
	public AccountVO() {
		super();
	}

	public AccountVO(int id, String owner, int balance, LocalDateTime udate) {
		super();
		this.id = id;
		this.owner = owner;
		this.balance = balance;
		this.udate = udate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public LocalDateTime getUdate() {
		return udate;
	}

	public void setUdate(LocalDateTime udate) {
		this.udate = udate;
	}

	@Override
	public String toString() {
		return "AccountVO [id=" + id + ", owner=" + owner + ", balance=" + balance + ", udate=" + udate + "]";
	}

}
