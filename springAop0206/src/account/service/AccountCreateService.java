package account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import account.dto.AccountVO;
import account.mapper.AccountMapper;

//���� ���� ����.
@Service
public class AccountCreateService {

	@Autowired
	private AccountMapper mapper;
	
	public int createAcoount(AccountVO account) {
		return mapper.insertAccount(account);
	}

}
