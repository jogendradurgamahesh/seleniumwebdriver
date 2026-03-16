package sample19.pack2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	void testTitle() {
		
		String exp_title="Mahesh Prince";
		String act_title="Mahesh Prince";
		
/*		if(exp_title.equals(act_title)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}  */
		
		Assert.assertEquals(exp_title, act_title );
	}
}
