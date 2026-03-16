package sample11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByOffset {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	        driver.manage().window().maximize();

	       

	        Actions act = new Actions(driver);
	        
	        
//          minumum slider
	        
	        WebElement src = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
	        
//	        src.getLocation().getX();
//	        src.getLocation().getY();
	        
	        System.out.println("Default Location is: "+ src.getLocation());

	       
	        

	        act.dragAndDropBy(src, 100, 193).perform();
	        System.out.println("present Location is: "+ src.getLocation());
	      
	
//	        maximum slider
	        WebElement src1 = driver.findElement(By.xpath("//span[2]"));
	        System.out.println(src1.getLocation());
	        
	        act.dragAndDropBy(src1, -113, 251).perform();
	        System.out.println(src1.getLocation());


	}

}
