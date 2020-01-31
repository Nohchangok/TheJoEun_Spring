package spring0128_ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class player2 {
	
	private String name;
	private Turn turn;
	private Attack attack;
	
	public void setName(String name) {
		this.name = name;
	}
	
//	@Qualifier("nextTurn")
//	@Autowired
//	public void setTurn(Turn turn) {
//		this.turn = turn;
//	}
//	
//	@Qualifier("missPoint")
//	@Autowired
//	public void setAttack(Attack attack) {
//		this.attack = attack;
//	}
//	
	public void fight() {
		System.out.println(name + "Ω√¿€");
		//attack.attack();
		//turn.turn();
	}
	

}
