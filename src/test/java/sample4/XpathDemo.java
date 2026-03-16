package sample4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
//		1.xpath with single attribute
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Prince");
		
		
		//2.xpath with multiple attribute  input[@placeholder='Search store']

		//driver.findElement(By.xpath("//input[@name='q'][@id='small-searchterms']")).sendKeys("Prince");
		
		
//		3.Xpath with 'and' 'or' operators
		
		//driver.findElement(By.xpath("//input[@name='q'and @id='small-searchterms']")).sendKeys("Prince");
		
       //driver.findElement(By.xpath("//input[@name='q' or @id='small-searchterm']")).sendKeys("Prince");
		
		
		
//		4.xpath with innertext using text()
		driver.findElement(By.xpath("//a[text()='Apple MacBook Pro']")).click();
		

	
		
		/*	boolean isDis=	driver.findElement(By.xpath("//*[text()='Featured products']")).isDisplayed();
	System.out.println(isDis);
		
		String text =	driver.findElement(By.xpath("//*[text()='Featured products']")).getText();
	System.out.println(text);
	
	if(text.equals("Featured products")) {
		System.out.println("Passed");
	}
	else {
		System.out.println("Failed");
	}      */
		
		
		
//		5.xpath with contains()
		//driver.findElement(By.xpath("//*[contains(@placeholder,'Search sto')]")).sendKeys("Prince");
		
		
//		6.xpath with start-with()
		//driver.findElement(By.xpath("//*[starts-with(@placeholder,'Se')]")).sendKeys("Prince");		
		
		
//		7.chained xpath
//	boolean status=	driver.findElement(By.xpath("//a[@title='Show products in category Electronics']/img")).isDisplayed();
//	System.out.println(status);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
