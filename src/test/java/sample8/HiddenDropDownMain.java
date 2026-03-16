package sample8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDropDownMain {

	  public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	        driver.manage().window().maximize();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // 🔐 Login
	        driver.findElement(By.name("username")).sendKeys("Admin");
	        driver.findElement(By.name("password")).sendKeys("admin123");
	        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	        // ✅ Click PIM
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//span[text()='PIM']"))).click();

	        // ✅ Click Job Title dropdown (hidden dropdown)
	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")));
	        dropdown.click();

	        // ✅ Capture all dropdown options
	        List<WebElement> options = wait.until(ExpectedConditions
	                .visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='listbox']//span")));

	        System.out.println("Total options: " + options.size());

	        // ✅ Print all options
	        for (WebElement option : options) {
	            System.out.println(option.getText());
	        }
	        
	        for(WebElement option : options) {
	            if(option.getText().equals("Automation Tester")) {
	                option.click();
	                break;
	            }
	        }

	        driver.quit();
	    }
}
