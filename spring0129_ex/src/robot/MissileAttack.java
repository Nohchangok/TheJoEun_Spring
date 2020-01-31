package robot;

public class MissileAttack implements Attack {

	@Override
	public void attack() {
		System.out.println("미사일로 공격합니다.");
	}
}
//ex에 패키지 하나 추가해서
//생성자를 통한 주입1 //생성자만 만들서 주입.
//setter를 통한 주입1 //setter만 만들어서 주입.
//두개 클래스 따로 만들어서
