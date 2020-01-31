package spring0128;

public class Person {
	private Hello hello;
	private int age;
	public Person(Hello hello, int age) {
		this.hello = hello;
		this.age = age;
	}
	public Person() {
	}
	public Hello getHello() {
		return hello;
	}
	public void setHello(Hello hello) {
		this.hello = hello;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
