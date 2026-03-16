package sample11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
	        driver.manage().window().maximize();

	        driver.switchTo().frame("iframeResult");

	        Actions act = new Actions(driver);
	        
	    WebElement src=driver.findElement(By.xpath("//img[@id='img1']"));
	    WebElement des=	driver.findElement(By.xpath("//div[@id='div1']"));
	    
	    act.clickAndHold(src).moveToElement(des).release().perform();
	        
	        act.click().perform();


	}

}
