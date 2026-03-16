package sample19.pack2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	
		@Test
	void hard_assertions() {
		System.out.println("testing...");
		System.out.println("testing...");
		
		Assert.assertEquals(1, 2);  //hard assertion
		
		System.out.println("testing...");
		System.out.println("testing...");
	}
	
	
	
	@Test
	void soft_assertions() {
		System.out.println("testing...");
		System.out.println("testing...");
		
		//soft assertion:we need to create an obj 
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);  //soft assertion
		
		System.out.println("testing...");
		System.out.println("testing...");
		
		sa.assertAll(); //mandatory
	}
}
