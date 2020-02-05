package springAop0205.aop;

public class Boy implements IPerson{
	
	@Override
	public String doSomething() {
		System.out.println("집에서 빨래를 한다.");
		
		return "I am a boy";
	}
}
