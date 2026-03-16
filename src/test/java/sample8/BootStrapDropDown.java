package sample8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//div[@class='form-check form-check-inline']//input[@type='checkbox']")).click();
//		
//		driver.findElement(By.xpath("//label[normalize-space()='Monday']")).click();
		
		
		
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver. manage ( ) . timeouts ( ) . implicitlyWait (Duration. ofSeconds(10) ) ;
			driver. get ( "https://www.jquery-az.com/boots/demo.php?ex=63.0_2" ) ;
			driver. manage() .window() . maximize();
			driver.findElement(By .xpath( "//button[contains (@class,'multiselect')]")).click() ;
		
			
		
			// I) Select single option
		driver.findElement(By.xpath("//input[@value='Java']")).click ( ) ;
//			
//			
//			// 2) capture all the options and find out size
			List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
			System.out.println("Number of options: "+options.size());
//			/ / 14
//			// 3) printing options from dropdown
			for(WebElement op:options)
			System.out.println(op.getText ( ) ) ;

	}

}
