package sample11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/demos/");
		driver.manage().window().maximize();
		
//		1.mouse hover
		WebElement d1=	driver.findElement(By.xpath("//a[normalize-space()='Contribute']"));
		WebElement d2=  driver.findElement(By.xpath("//a[normalize-space()='Events']"));
		
		Actions act=new Actions(driver);
//		act.moveToElement(d1).moveToElement(d2).build().perform();
//		act.moveToElement(d1).moveToElement(d2).click().perform();
		act.moveToElement(d1).moveToElement(d2).click().build().perform();
		
		
		  System.out.println("Mouse Hover Action Performed Successfully");

	}
	
	
	 

}
