package springAop0205.aopAnno;

import org.springframework.stereotype.Component;

@Component
public class Boy implements IPerson{
	
	@Override
	public String doSomething() {
		System.out.println("������ ������ �Ѵ�.");
		
		return "I am a boy";
	}
}
