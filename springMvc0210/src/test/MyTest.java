package test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		LocalDate birth = LocalDate.now();
		System.out.println(birth.toString());
	}

}
