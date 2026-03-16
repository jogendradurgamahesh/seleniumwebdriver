package sample3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
//		1.tag and id:tag#id->tag is optional but # is mandatory
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Prince");
	
		
//		2.tag and class     tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("Mahi");
		//driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("Mahi");

//		3.tag  and attribute      tag[attribute='value"']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Prince");
		
		
		
//		4.tag class and attribute    input.
	driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Mahi");	
		
		
		
		
		
		
	}

}
