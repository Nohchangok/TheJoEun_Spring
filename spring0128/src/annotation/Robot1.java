package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//빈객체의 id를 직접 넣어줄 수 있다.
@Component("robooooot")
public class Robot1{
	
	//setter도 없고 private인데도 주입이 된다!
	@Qualifier("missile")
	@Autowired
	private Attack attack;
	
	public void fight() {
		attack.attack();
	}
}
