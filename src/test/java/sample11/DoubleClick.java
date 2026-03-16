package sample11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		

		//input[@id='field1']
		//input[@id='field2']
		//button[normalize-space()='Copy Text']
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
	
	WebElement element1=	driver.findElement(By.xpath("//input[@id='field1']"));
	WebElement element2=	driver.findElement(By.xpath("//input[@id='field2']"));
	WebElement button=	driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	
	element1.clear();
	element1.sendKeys("Mahi");
	
	//double click action
	Actions act=new Actions(driver);
	
	act.doubleClick(button).perform();
	
	//String text=element2.getText(); it will not work because it is not innertext that's why we use getattribute
	String text=element2.getAttribute("value");
	System.out.println("text is: "+text);
	
	//vaidation
	if(text.equals("Mahi")) {
		System.out.println("Copied");
	}
	else {
		System.out.println("Not copied properly");
	}

	}

}
