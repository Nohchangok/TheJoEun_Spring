package robot;

public class Robot {
	private Attack attack;
	
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
	public void fight() {
		System.out.println("�κ��� �����մϴ�.");
		attack.attack();
	}
}
