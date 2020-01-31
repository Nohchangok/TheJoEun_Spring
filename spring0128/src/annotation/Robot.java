package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//요 마크가 달린놈이 빈으로 등록 된다!
//id 기본은~ 클래스명의 첫글자를 소문자로한게 된다. robot
@Component
public class Robot {
	private Attack attack;
	
	//컨테이너가 갖고있는 빈중에 해당되는 빈을 넣어준다.
	@Qualifier("punch")//같은타입이 여러개 있을시에 추가로 특정타입을 지정할 수 있음.
	@Autowired//타입으로 같은타입이 빈으로 있으면 주입시킴
	public void setAttack(Attack attack) {
		System.out.println("SET메소드실행");
		this.attack = attack;
	}
	
	public void fight() {
		System.out.println("로봇이 공격합니다.");
		attack.attack();
	}
}
