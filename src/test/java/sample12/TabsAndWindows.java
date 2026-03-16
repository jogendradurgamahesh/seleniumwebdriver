package sample12;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabsAndWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
       
       //switch to new tab
       driver.switchTo().newWindow(WindowType.TAB); //introduced in selenium4.x
       
       driver.get("https://text-compare.com");
       driver.manage().window().maximize();

	}

}
