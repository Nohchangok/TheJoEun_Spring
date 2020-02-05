package springAop0205.aopAnno;

public interface IPerson {
	
	//프록시 객체를 만들기 위해서는 인터페이스가 정의되어 있어야 한다.
	//런타임시 위빙하기 위함.
	//이 인터페이스는 타겟(핵심관심사항) 역할을 하는 놈이 구현하면 됨.
	public String doSomething();
}
