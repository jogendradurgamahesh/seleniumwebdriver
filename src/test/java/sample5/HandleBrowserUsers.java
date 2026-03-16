package sample5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserUsers {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		 Set<String>windowIds= driver.getWindowHandles();
		
		 
//		 approach 1:converting set to list  recommended when you have 2 or 3 browesers
/*		 List<String>windowList=new ArrayList<String>(windowIds);
		String parentId= windowList.get(0);
		String childId= windowList.get(1);
		
		System.out.println("Parent id "+parentId);
		System.out.println("Child id "+childId);
		
		//display parent title
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
//		now switch to child page and dis play title
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());     */
		 
		 
//		 approach 2:when you morn than 4 browsers then use for loop
		 for(String winId:windowIds) {
			String title= driver.switchTo().window(winId).getTitle();
			System.out.println("Title "+title);
			
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		 }
		
		driver.quit();
	}

}
