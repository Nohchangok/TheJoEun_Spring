package springAop0205.aopAnno;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springAop0205/aopAnno/applicationContext.xml")
public class AopAnnoTest {

	@Autowired
	ApplicationContext context;
	
	@Test
	public void test() {
		IPerson boy = context.getBean("boy", IPerson.class);
		System.out.println(boy.doSomething());
	}

}
