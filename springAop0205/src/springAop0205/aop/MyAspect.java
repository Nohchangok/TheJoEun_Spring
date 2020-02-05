package springAop0205.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
	
	//boy와 girl이 핵심 관심사항(메소드)을 실행하기 전에 했던 공통관심 사항.
	public void before(JoinPoint jp) {
		System.out.println("집에 문을 열고 들어간다.");
		System.out.println("jp :"+jp); //핵심객체에 대한 정보를 받을 수 있는 객체.
		System.out.println(jp.getTarget().getClass());
		System.out.println(jp.getThis().getClass());
	}
	
	public void after() {
		System.out.println("집에 문을 닫고 나간다.");
	}
	
	public void afterReturn(JoinPoint jp, String msg) {
		System.out.println("msg "+msg); //리턴된 값을 받음.
		System.out.println("문이 잠겼다.");
	}
	
	public void afterThrow(JoinPoint jp, Throwable th) {
		System.out.println("문을 던진다.");
	}
	
	//핵심 관심 사항을 둘러서 한다.
	public String around(ProceedingJoinPoint pjp) {
		String str = "창옥아 힘내~~";
		try {
			System.out.println("문을 열고 들어간다.");
			str = (String)pjp.proceed(); //핵심관심사항의 doSomething()
			System.out.println("문을 닫고 나간다.");
			
			return str;
			
		} catch (Throwable e) {
			System.out.println("집이 터진다.");
			return str;
		}finally {
			//after return
			System.out.println("문을 잠근다.");
		} 
	}

}
