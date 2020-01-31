package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//��ü�� id�� ���� �־��� �� �ִ�.
@Component("robooooot")
public class Robot1{
	
	//setter�� ���� private�ε��� ������ �ȴ�!
	@Qualifier("missile")
	@Autowired
	private Attack attack;
	
	public void fight() {
		attack.attack();
	}
}
