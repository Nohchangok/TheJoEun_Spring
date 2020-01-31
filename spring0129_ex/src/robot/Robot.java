package robot;

public class Robot {
	private Attack attack;
	
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
	public void fight() {
		System.out.println("로봇이 공격합니다.");
		attack.attack();
	}
}
