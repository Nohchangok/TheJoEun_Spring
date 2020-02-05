package springAop0205.aopAnno;

import org.springframework.stereotype.Component;

@Component
public class Boy implements IPerson{
	
	@Override
	public String doSomething() {
		System.out.println("집에서 빨래를 한다.");
		
		return "I am a boy";
	}
}
