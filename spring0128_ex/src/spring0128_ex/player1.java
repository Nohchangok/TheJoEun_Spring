package spring0128_ex;

public class player1 {
	
	private String name;
	private Turn turn;
	private Attack attack;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTurn(Turn turn) {
		this.turn = turn;
	}
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
	public void fight() {
		System.out.println(name + "Ω√¿€");
		attack.attack();
		turn.turn();
	}
	

}
