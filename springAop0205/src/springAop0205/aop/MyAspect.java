package springAop0205.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	
	//boy�� girl�� �ٽ� ���ɻ���(�޼ҵ�)�� �����ϱ� ���� �ߴ� ������� ����.
	public void before(JoinPoint jp) {
		System.out.println("���� ���� ���� ����.");
		System.out.println("jp :"+jp); //�ٽɰ�ü�� ���� ������ ���� �� �ִ� ��ü.
		System.out.println(jp.getTarget().getClass());
		System.out.println(jp.getThis().getClass());
	}
	
	public void after() {
		System.out.println("���� ���� �ݰ� ������.");
	}
	
	public void afterReturn(JoinPoint jp, String msg) {
		System.out.println("msg "+msg); //���ϵ� ���� ����.
		System.out.println("���� ����.");
	}
	
	public void afterThrow(JoinPoint jp, Throwable th) {
		System.out.println("���� ������.");
	}
	
	//�ٽ� ���� ������ �ѷ��� �Ѵ�.
	public String around(ProceedingJoinPoint pjp) {
		String str = "â���� ����~~";
		try {
			System.out.println("���� ���� ����.");
			str = (String)pjp.proceed(); //�ٽɰ��ɻ����� doSomething()
			System.out.println("���� �ݰ� ������.");
			
			return str;
			
		} catch (Throwable e) {
			System.out.println("���� ������.");
			return str;
		}finally {
			//after return
			System.out.println("���� ��ٴ�.");
		} 
	}

}
