package springAop0205.aopAnno;

import org.springframework.stereotype.Component;

@Component
public class Girl implements IPerson{
	
	@Override
	public String doSomething() {
		System.out.println("������ Ƽ�� ����");
		
		return "I am a girl";
	}
}
