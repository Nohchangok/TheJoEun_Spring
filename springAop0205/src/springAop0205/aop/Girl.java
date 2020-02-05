package springAop0205.aop;

public class Girl implements IPerson{
	
	@Override
	public String doSomething() {
		System.out.println("집에서 티비를 본다");
		
		return "I am a girl";
	}
}
