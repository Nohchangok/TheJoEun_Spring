package spring0128_ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class GameStart {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/spring0128_ex/springContext.xml");
		
		//player1 player1 = context.getBean("player1", player1.class);
		//player1.fight();
		
		player2 player2 = (player2)context.getBean("player2");
		player2.fight();
	}

}
