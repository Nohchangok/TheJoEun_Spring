package spring0128;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloTest {

	public static void main(String[] args) {
		//스프링 컨테이너에는 우리가 만들어서 설정한 bean객체가 들어있다.
		//그 빈을 이용하려면 스프링 컨테이너를 실행시켜줘야한다.
		ApplicationContext context = 
				new GenericXmlApplicationContext("spring0128/springContext.xml");
		
		//스프링 컨테이너를 통해서 우리가 넣은 빈을 가져다가 사용한다.
		//getBean메소드로 가져올 수 있음.id값으로
		//Hello hello = (Hello)context.getBean("myHello");
		Hello hello = context.getBean("myHello", Hello.class);
		System.out.println("컨테이너 속에 있던 빈을 이용!");
		System.out.println(hello.getName());
		System.out.println(hello.getGreeting());
		
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getHello().getName());
		System.out.println(person.getHello().getGreeting());
		System.out.println(person.getAge());
		
		Person person1 = context.getBean("person", Person.class);
		System.out.println(person == person1);//같다!
	}
	//프로젝트 spring0128_ex 생성 후 //기본프로젝트->메이븐-> 디펜던시추가> 스프링설정> 빈등록
	//참조변수를 속성으로 갖는 클래스 만들어서!
	//스프링으로 빈 설정하고 출력해보세요!
}




