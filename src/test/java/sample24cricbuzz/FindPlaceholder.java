package sample24cricbuzz;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindPlaceholder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  By.xpath("//input[@placeholder='Search']")

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	WebElement search=	driver.findElement(By.xpath("//input[@placeholder='Search']"));
    String placeholderText = search.getAttribute("placeholder");
    System.out.println("PlaceholderText: "+placeholderText );
	
    
    String baseUrl=  url.split("demo/index.php")[0];
    System.out.println(baseUrl);
		
		driver.quit();
	}

}
