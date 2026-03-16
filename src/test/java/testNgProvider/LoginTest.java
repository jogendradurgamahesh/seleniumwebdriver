package testNgProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class LoginTest {
	
	 WebDriver driver;

	    @BeforeMethod
	    void setup() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @Test(dataProvider = "loginData")
	    void loginTest(String email, String password) {

	        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

	        driver.findElement(By.id("input-email")).clear();
	        driver.findElement(By.id("input-email")).sendKeys(email);

	        driver.findElement(By.id("input-password")).clear();
	        driver.findElement(By.id("input-password")).sendKeys(password);

	        driver.findElement(By.xpath("//input[@value='Login']")).click();

	        boolean status = driver.getPageSource().contains("My Account");

	        Assert.assertTrue(status, "Login failed for: " + email);
	    }

	    @DataProvider(name = "loginData")
	    Object[][] getData() {

//	        String path = System.getProperty("user.dir")
//	                + "/src/test/java/testData/LoginData.xlsx";
	    	
	    	String path = System.getProperty("user.dir")
	    	        + "/testData/LoginData.xlsx";

	        return ExceUtil.getExcelData(path, "Sheet1");
	    }

	    @AfterClass
	    void tearDown() {
	        driver.quit();
	    }

}
