package batchPro.batchPro;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //스프링 프레임워크설정한 아이를 실행하도록 해야한다.
    	//설정정보를 이용해서 스프링에 빈 객체를 만들어서 담는다.
    	AbstractApplicationContext ctx = 
    			new GenericXmlApplicationContext("myScheduler.xml");
    }
}
