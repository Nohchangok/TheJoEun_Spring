package springAop0205.aopAnno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(public String *.doSomething())")
	public void myPt() {}
	
	@Before("myPt()")
	public void before() {
		System.out.println(System.currentTimeMillis());
		System.out.println("문을 열고 들어간다.");
	}
	
	@After("myPt()")
	public void after() {
		System.out.println("집을 나간다.");
	}
	
	@AfterReturning(pointcut = "myPt()",returning = "msg")
	public void afterReturning(JoinPoint jp, String msg) {
		System.out.println("도둑이 들었다 :"+msg);
	}
	
	@AfterThrowing(pointcut = "myPt()", throwing = "th")
	public void afterThrowing(JoinPoint jp, Throwable th) {
		System.out.println("집이터진다.");
		th.printStackTrace();
		System.out.println("신고해");
	}
}
