package springAop0205.aop;

public class Boy implements IPerson{
	
	@Override
	public String doSomething() {
		System.out.println("������ ������ �Ѵ�.");
		
		return "I am a boy";
	}
}
