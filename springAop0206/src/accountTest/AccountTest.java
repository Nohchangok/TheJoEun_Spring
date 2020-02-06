package accountTest;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import account.dto.AccountVO;
import account.service.AccountCreateService;
import account.service.AccountException;
import account.service.AccountTransferService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class AccountTest {

	@Autowired
	AccountCreateService createSev;
	
	@Autowired
	AccountTransferService transferSev;
	
	@Test @Ignore
	public void test() {
		int rs = createSev.createAcoount(new AccountVO(0, "noh", 2000000, null));
		System.out.println(rs+"로우 성공");
	}
	@Test 
	public void test1() {
		try {
			transferSev.transfer(1, 2, 100);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
