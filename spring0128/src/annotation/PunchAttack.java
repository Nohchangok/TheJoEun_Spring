package annotation;

public class PunchAttack implements Attack {
	
	//�����ڸ� �ܺο��� �� ����� ���Ƶ� �� ������ �����ϴ�!
	private PunchAttack(){}
	
	@Override
	public void attack() {
		System.out.println("��ġ��ġ.");
	}
}
