package account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import account.dto.AccountVO;
import account.mapper.AccountMapper;

@Service
public class AccountTransferService {
	
	@Autowired
	AccountMapper mapper;
	
	@Transactional
	public int transfer(int myId, int receiveId, int sendMoney) throws AccountException {
		int rs = 0;
		//조회를 해서
		AccountVO myAccount = mapper.selectAccountOne(myId);
		int myBalance = myAccount.getBalance();
		if(sendMoney > myBalance) {
			throw new AccountException();
		}
		//내계좌에서 빼고
		myAccount.setBalance(myBalance-sendMoney);
		rs += mapper.updateAccount(myAccount);
		
		//상대방 계좌에 넣기
		
		AccountVO receiveAccount = mapper.selectAccountOne(receiveId);
		int reBalance = receiveAccount.getBalance();
		
		receiveAccount.setBalance(reBalance+sendMoney);
		rs += mapper.updateAccount(receiveAccount);
		
		//둘다성공한게 아니면 exception처리
		if(rs!=2) {
			throw new AccountException("뭔가잘못되어써서서섯서서서");
		}
		return rs;
	}

}
