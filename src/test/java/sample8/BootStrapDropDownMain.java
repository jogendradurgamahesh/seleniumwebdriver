package sample8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrapDropDownMain {

	 public static void main(String[] args) {

//	        WebDriver driver = new ChromeDriver();
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//	        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
//	        driver.manage().window().maximize();
//
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	        // ✅ Switch to iframe properly
//	        WebElement frame = wait.until(
//	                ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe")));
//	        driver.switchTo().frame(frame);
//	        
////	        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("iframe"), 0));
////	        driver.switchTo().frame(1);   // ✅ switch to second iframe
//
//	        // ✅ Wait for dropdown button
//	        WebElement dropdown = wait.until(
//	                ExpectedConditions.elementToBeClickable(
//	                        By.xpath("//button[contains(@class,'multiselect')]")));
//
//	        dropdown.click();
//
//	        // ✅ Select Java
//	        driver.findElement(By.xpath("//input[@value='Java']")).click();
//
//	        // ✅ Capture all options
//	        List<WebElement> options = driver.findElements(
//	                By.xpath("//ul[contains(@class,'multiselect-container')]//label"));
//
//	        System.out.println("Number of options: " + options.size());
//
//	        for (WebElement op : options) {
//	            System.out.println(op.getText());
//	        }
//
//	        driver.quit();
//	    }
//	
	
	
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	        driver.manage().window().maximize();

	        // Get all iframes
	        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	        System.out.println("Total iframes: " + frames.size());

	        // Loop through frames and switch
	        for (int i = 0; i < frames.size(); i++) {

	            driver.switchTo().frame(i);

	            List<WebElement> dropdown = driver.findElements(
	                    By.xpath("//button[contains(@class,'multiselect')]"));

	            if (dropdown.size() > 0) {

	                dropdown.get(0).click();

	                driver.findElement(By.xpath("//input[@value='Java']")).click();

	                List<WebElement> options = driver.findElements(
	                        By.xpath("//ul[contains(@class,'multiselect-container')]//label"));

	                System.out.println("Number of options: " + options.size());

	                for (WebElement op : options) {
	                    System.out.println(op.getText());
	                }

	                break;
	            }

	            driver.switchTo().defaultContent();
	        }

	        driver.quit();}
	
	
	
	
	
	
//	   public static void main(String[] args) {
//
//	        WebDriver driver = new ChromeDriver();
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//	        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
//	        driver.manage().window().maximize();
//
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	        // ✅ Switch to iframe properly
//	        WebElement frame = wait.until(
//	                ExpectedConditions.presenceOfElementLocated(By.cssSelector("iframe")));
//	        driver.switchTo().frame(frame);
//
//	        // ✅ Wait for dropdown button
//	        WebElement dropdown = wait.until(
//	                ExpectedConditions.elementToBeClickable(
//	                        By.xpath("//button[contains(@class,'multiselect')]")));
//
//	        dropdown.click();
//
//	        // ✅ Select Java
//	        driver.findElement(By.xpath("//input[@value='Java']")).click();
//
//	        // ✅ Capture all options
//	        List<WebElement> options = driver.findElements(
//	                By.xpath("//ul[contains(@class,'multiselect-container')]//label"));
//
//	        System.out.println("Number of options: " + options.size());
//
//	        for (WebElement op : options) {
//	            System.out.println(op.getText());
//	        }
//
//	        driver.quit();
//	    }
}
