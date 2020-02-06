package account.mapper;

import java.util.List;

import account.dto.AccountVO;

public interface AccountMapper {
	public int insertAccount(AccountVO account);
	public int updateAccount(AccountVO account);
	public int deleteAccount(AccountVO account);
	public AccountVO selectAccountOne(int id);
	
}