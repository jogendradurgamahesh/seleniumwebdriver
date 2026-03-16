package sample5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args)  {

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
	

		//		1.isDisplayed()
//				WebElement driver1=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//				System.out.println("Dispalyed is "+driver1.isDisplayed());

//				boolean driver11=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//				System.out.println("Dispalyed is "+driver11);

//				boolean driver11=driver.findElement(By.xpath("//h1[text()='Register']")).isDisplayed();
//				System.out.println("Dispalyed is "+driver11);



		//		2.isEnabled()
//			WebElement driver2=	driver.findElement(By.xpath("//input[@id='FirstName']"));
//			System.out.println("Enable statues" +driver2.isEnabled());

//		boolean driver22=	driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//		System.out.println("Enable statues " +driver22);


		//	3.isSelected()
		WebElement s1=	driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement s2=	driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selected ");
		System.out.println(s1.isSelected());
		System.out.println(s2.isSelected());

		System.out.println("after selected ");
		s1.click();
		System.out.println(s1.isSelected());
		System.out.println(s2.isSelected());
		
		
//		boolean s22=	driver.findElement(By.xpath("//*[@id='Newsletter']")).isSelected();
//		System.out.println(s22);
		
	
		









	}

}
