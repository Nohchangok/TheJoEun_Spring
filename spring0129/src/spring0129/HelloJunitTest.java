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
//스프링 설정파일 위치를 넣어줌.
@ContextConfiguration(locations = "classpath:spring0129/springContext.xml")
public class HelloJunitTest {
	
	//스프링 객체를 주입 받는다.
	@Autowired
	private ApplicationContext context;
	
	@Test
	public void test() {
		Calculator calcul = new Calculator();
		//두수 10, 5를 sum메소드의 인자로 넣으면 15가 나올 것인가?
		//앞의 예측값과  뒤에 실행 메소드의 결과가 같은가?
		assertEquals(15, calcul.sum(10, 5));
	}
	
	@Test @Ignore
	public void springTest() {
		ApplicationContext context = new GenericXmlApplicationContext("spring0129/springContext.xml");
		Calculator calcul = context.getBean("calculator",Calculator.class);
		Calculator calcul1 = context.getBean(Calculator.class);
		
		//두객체가 같은가?
		assertSame(calcul, calcul1);
	}
	
	@Test
	public void springTest2() {
		Calculator calcule = context.getBean("calculator",Calculator.class);
		
		assertNotEquals(10, calcule.sum(2, 5));	
		
	}
	
	
	
	/*
	 * junit의 어노테이션들.
	 * @Test : 테스트하고자 하는 메소드를 선언.
	 * @After : @Test annotation이 실행되고 후에 실행되는 놈.
	 * @Before : @Test annotation이 실행되기 전에 실행되는 놈.
	 * @AfterClass : @Test 실행 후 딱 한번 실행한다.
	 * @BeforeClass : @Test 실행 전 딱 한번 실행한다.
	 * 
	 * spring을 테스트하기 위한 라이브러리도 추가해서 junit을 확장해서 사용해야한다.
	 * spring-test 프레임워크가 있는데 요놈이 스프링에서 junit을 확장하여 사용함.
	 * 
	 * @RunWith(SpringJUnit4ClassRunner.class)
	 * 스프링 콘텍스트 객체를 미리 만들어준다.
	 * @ContextConfiguration(location="설정파일위치")
	 * */

}
