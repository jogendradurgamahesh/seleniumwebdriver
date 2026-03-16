package sample12;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
        
     WebElement regLink=  driver.findElement(By.xpath("//a[normalize-space()='Register']"));

     //instead of using clicking in same tab i want topen in new tab
     //regLink.click();
     
     
     //ctrl+link
     Actions act=new Actions(driver);
     act.keyDown(Keys.CONTROL).click(regLink).keyUp	(Keys.CONTROL).perform();
     
     //switch to reg page
    List<String>ids=new ArrayList(driver.getWindowHandles());
    
    driver.switchTo().window(ids.get(1)); //switch to reg page
//    driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mahesh");
    
     
     driver.switchTo().window(ids.get(0));//switch to main page
     driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mahesh");
   
	}

}
