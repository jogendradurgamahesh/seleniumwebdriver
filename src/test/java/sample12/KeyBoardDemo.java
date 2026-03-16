package sample12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardDemo {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://text-compare.com");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Mahesh Prince");
	        
	        Actions act=new Actions(driver);
	        
	        //ctrl+A->select
	        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	        
	        
	        //ctrl+c->copy text
	        
	        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
//	        
//	        
//	        //click tab->shift to next box
	        act.keyDown(Keys.TAB).perform();
//	        
//	        //ctrl+v->paste the text
	        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
//	        
	}

}
