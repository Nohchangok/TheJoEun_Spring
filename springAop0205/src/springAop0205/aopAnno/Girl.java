package springAop0205.aopAnno;

import org.springframework.stereotype.Component;

@Component
public class Girl implements IPerson{
	
	@Override
	public String doSomething() {
		System.out.println("집에서 티비를 본다");
		
		return "I am a girl";
	}
}
