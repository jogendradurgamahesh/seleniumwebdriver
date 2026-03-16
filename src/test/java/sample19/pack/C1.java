package sample19.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	@Test
	void abc() {
		System.out.println("abc from c1");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("Before testmethod ");
	}

}
