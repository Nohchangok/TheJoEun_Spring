package springAop0205.aop;

public class Girl implements IPerson{
	
	@Override
	public String doSomething() {
		System.out.println("������ Ƽ�� ����");
		
		return "I am a girl";
	}
}
