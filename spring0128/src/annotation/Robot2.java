package annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot2 {
	
	//1���� Ÿ���� ���غ���, �Ӽ����� ��ü�� id�� �����ְ� ������ �켱 ���Խ����ش�.
	@Autowired
	private Attack punch;
	
	public void fight() {
		punch.attack();
	}
	
	//��ü�� �����ÿ� ������ �޼ҵ�
	@PostConstruct
	public void init() {
		System.out.println("�κ� ��� �غ� �Ϸ�!");
	}
	
	//��ü�� �Ҹ�ÿ� ������ �޼ҵ�
	@PreDestroy
	public void destroy() {
		System.out.println("�κ� ���� ������ ��...");
	}
}



