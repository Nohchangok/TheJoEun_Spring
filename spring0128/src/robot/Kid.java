package robot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Kid {

	public static void main(String[] args) {
		//�������� ���ؼ� �κ��� �����Ͽ� ����~
		ApplicationContext context 
		= new GenericXmlApplicationContext("robot/beans.xml");
		Robot robot = context.getBean("robot",Robot.class);
		Robot robot1 = context.getBean("robot",Robot.class);
		System.out.println(robot == robot1);
		
	}

}
