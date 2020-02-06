package account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import account.dto.AccountVO;
import account.mapper.AccountMapper;

//계좌 생성 서비스.
@Service
public class AccountCreateService {

	@Autowired
	private AccountMapper mapper;
	
	public int createAcoount(AccountVO account) {
		return mapper.insertAccount(account);
	}

}
