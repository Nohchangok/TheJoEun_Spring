package annotation;

public class PunchAttack implements Attack {
	
	//생성자를 외부에서 못 만들게 막아도 빈 생성이 가능하다!
	private PunchAttack(){}
	
	@Override
	public void attack() {
		System.out.println("펀치펀치.");
	}
}
