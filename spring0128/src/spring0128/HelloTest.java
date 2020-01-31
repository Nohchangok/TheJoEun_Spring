package spring0128;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloTest {

	public static void main(String[] args) {
		//������ �����̳ʿ��� �츮�� ���� ������ bean��ü�� ����ִ�.
		//�� ���� �̿��Ϸ��� ������ �����̳ʸ� �����������Ѵ�.
		ApplicationContext context = 
				new GenericXmlApplicationContext("spring0128/springContext.xml");
		
		//������ �����̳ʸ� ���ؼ� �츮�� ���� ���� �����ٰ� ����Ѵ�.
		//getBean�޼ҵ�� ������ �� ����.id������
		//Hello hello = (Hello)context.getBean("myHello");
		Hello hello = context.getBean("myHello", Hello.class);
		System.out.println("�����̳� �ӿ� �ִ� ���� �̿�!");
		System.out.println(hello.getName());
		System.out.println(hello.getGreeting());
		
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getHello().getName());
		System.out.println(person.getHello().getGreeting());
		System.out.println(person.getAge());
		
		Person person1 = context.getBean("person", Person.class);
		System.out.println(person == person1);//����!
	}
	//������Ʈ spring0128_ex ���� �� //�⺻������Ʈ->���̺�-> ��������߰�> ����������> ����
	//���������� �Ӽ����� ���� Ŭ���� ����!
	//���������� �� �����ϰ� ����غ�����!
}




