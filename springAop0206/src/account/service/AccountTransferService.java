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
		//��ȸ�� �ؼ�
		AccountVO myAccount = mapper.selectAccountOne(myId);
		int myBalance = myAccount.getBalance();
		if(sendMoney > myBalance) {
			throw new AccountException();
		}
		//�����¿��� ����
		myAccount.setBalance(myBalance-sendMoney);
		rs += mapper.updateAccount(myAccount);
		
		//���� ���¿� �ֱ�
		
		AccountVO receiveAccount = mapper.selectAccountOne(receiveId);
		int reBalance = receiveAccount.getBalance();
		
		receiveAccount.setBalance(reBalance+sendMoney);
		rs += mapper.updateAccount(receiveAccount);
		
		//�Ѵټ����Ѱ� �ƴϸ� exceptionó��
		if(rs!=2) {
			throw new AccountException("�����߸��Ǿ�Ἥ����������");
		}
		return rs;
	}

}
