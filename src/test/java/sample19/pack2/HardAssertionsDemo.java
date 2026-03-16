package sample19.pack2;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {

	@Test
	void test() {
				Assert.assertEquals("mahi", "mahi"); //pass
		//		Assert.assertEquals(123, 143);       //fail
		//		Assert.assertEquals(123, "mahi");    //fail
		//		Assert.assertEquals(123, "123");     //fail


		//Assert.assertNotEquals("mahi", "mahi");  //fail
		//	Assert.assertNotEquals("mahi", "mahi1"); //pass
		
		
		
	//	Assert.assertTrue(true); //pass
	//	Assert.assertTrue(false); //fail
	//	Assert.assertTrue(1==2);  //fail
//		Assert.assertTrue(2==2);   //pass
		
		
//		Assert.assertFalse(false);  //pass
//		Assert.assertFalse(true);    //fail
//		Assert.assertFalse(1==2);     //pass
//		Assert.assertFalse(2==2);     //fail
		
		
	//	Assert.fail();
		


	}
}
