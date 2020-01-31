package spring0129;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//������ �������� ��ġ�� �־���.
@ContextConfiguration(locations = "classpath:spring0129/springContext.xml")
public class HelloJunitTest {
	
	//������ ��ü�� ���� �޴´�.
	@Autowired
	private ApplicationContext context;
	
	@Test
	public void test() {
		Calculator calcul = new Calculator();
		//�μ� 10, 5�� sum�޼ҵ��� ���ڷ� ������ 15�� ���� ���ΰ�?
		//���� ��������  �ڿ� ���� �޼ҵ��� ����� ������?
		assertEquals(15, calcul.sum(10, 5));
	}
	
	@Test @Ignore
	public void springTest() {
		ApplicationContext context = new GenericXmlApplicationContext("spring0129/springContext.xml");
		Calculator calcul = context.getBean("calculator",Calculator.class);
		Calculator calcul1 = context.getBean(Calculator.class);
		
		//�ΰ�ü�� ������?
		assertSame(calcul, calcul1);
	}
	
	@Test
	public void springTest2() {
		Calculator calcule = context.getBean("calculator",Calculator.class);
		
		assertNotEquals(10, calcule.sum(2, 5));	
		
	}
	
	
	
	/*
	 * junit�� ������̼ǵ�.
	 * @Test : �׽�Ʈ�ϰ��� �ϴ� �޼ҵ带 ����.
	 * @After : @Test annotation�� ����ǰ� �Ŀ� ����Ǵ� ��.
	 * @Before : @Test annotation�� ����Ǳ� ���� ����Ǵ� ��.
	 * @AfterClass : @Test ���� �� �� �ѹ� �����Ѵ�.
	 * @BeforeClass : @Test ���� �� �� �ѹ� �����Ѵ�.
	 * 
	 * spring�� �׽�Ʈ�ϱ� ���� ���̺귯���� �߰��ؼ� junit�� Ȯ���ؼ� ����ؾ��Ѵ�.
	 * spring-test �����ӿ�ũ�� �ִµ� ����� ���������� junit�� Ȯ���Ͽ� �����.
	 * 
	 * @RunWith(SpringJUnit4ClassRunner.class)
	 * ������ ���ؽ�Ʈ ��ü�� �̸� ������ش�.
	 * @ContextConfiguration(location="����������ġ")
	 * */

}
