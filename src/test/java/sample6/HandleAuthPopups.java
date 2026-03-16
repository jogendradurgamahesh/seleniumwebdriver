package sample6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthPopups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//syntax
//		 driver.get("https://username:password@the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		System.out.println(driver.getPageSource().contains("Congratulations"));
		
		

	}

}
