package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Kid {

	public static void main(String[] args) {
		//���Ͻý��� ��θ� ���� �������� ����!
		ApplicationContext context 
		= new FileSystemXmlApplicationContext("src/annotation/beans.xml");
		Robot robot = context.getBean("robot", Robot.class);
		System.out.println(robot);
		robot.fight();
		
		Robot1 robot1 = (Robot1)context.getBean("robooooot");
		robot1.fight();
		
		Robot2 robot2 = (Robot2)context.getBean("robot2");
		robot2.fight();
		
		//������ ����
		((AbstractApplicationContext) context).close();
	}
}




