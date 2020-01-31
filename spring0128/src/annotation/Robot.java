package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//�� ��ũ�� �޸����� ������ ��� �ȴ�!
//id �⺻��~ Ŭ�������� ù���ڸ� �ҹ��ڷ��Ѱ� �ȴ�. robot
@Component
public class Robot {
	private Attack attack;
	
	//�����̳ʰ� �����ִ� ���߿� �ش�Ǵ� ���� �־��ش�.
	@Qualifier("punch")//����Ÿ���� ������ �����ÿ� �߰��� Ư��Ÿ���� ������ �� ����.
	@Autowired//Ÿ������ ����Ÿ���� ������ ������ ���Խ�Ŵ
	public void setAttack(Attack attack) {
		System.out.println("SET�޼ҵ����");
		this.attack = attack;
	}
	
	public void fight() {
		System.out.println("�κ��� �����մϴ�.");
		attack.attack();
	}
}
