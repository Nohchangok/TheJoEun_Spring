package accountTest;

import static org.junit.Assert.*;

import java.time.LocalDate;

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

	@Test 
	public void test1() {
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		
		System.out.println(year+"-"+month+"-"+day);
	}

}
