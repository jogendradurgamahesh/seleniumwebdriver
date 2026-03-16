package sample5;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//  Provide some string and search for it
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		searchbox.sendKeys("selenium");
		driver.findElement(By.className("wikipedia-search-button")).click();

		Thread.sleep(3000);

		// Count number of links in search results
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		System.out.println("Total links found: " + links.size());

		String mainWindow = driver.getWindowHandle();

		//		 Click on each link using for loop
		for(WebElement link:links) {
			System.out.println("Clicking on :"+link.getText());
			link.click();
			Thread.sleep(2000);
		}
		//			get Window Ids
		Set<String>windowId=driver.getWindowHandles();
		System.out.println(windowId);

		for(String wid:windowId) {
			driver.switchTo().window(wid);

			System.out.println("Title: "+driver.getTitle());

			if (!wid.equals(mainWindow)) {
				driver.close();
			}
		}


		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.quit();




	}

}
