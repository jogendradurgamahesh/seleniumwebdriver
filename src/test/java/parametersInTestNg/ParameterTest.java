package parametersInTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {


	WebDriver driver;
	
	@Test()
	@Parameters({"browser","url","username"})
	public void yahooLoginTest(String browser,String url,String username) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		
		driver.findElement(By.xpath("//*[@class='_yb_11glrwn  _yb_rc8mhy undefined']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
	}
	
	
}
