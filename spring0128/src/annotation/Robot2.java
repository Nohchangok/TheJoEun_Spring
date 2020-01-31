package annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot2 {
	
	//1차로 타입을 비교해보고, 속성명이 빈객체의 id와 같은애가 있으면 우선 주입시켜준다.
	@Autowired
	private Attack punch;
	
	public void fight() {
		punch.attack();
	}
	
	//객체가 생성시에 실행할 메소드
	@PostConstruct
	public void init() {
		System.out.println("로봇 사용 준비 완료!");
	}
	
	//객체가 소멸시에 실행할 메소드
	@PreDestroy
	public void destroy() {
		System.out.println("로봇 이제 갈때가 됨...");
	}
}



