package sample2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.godaddy.com/en-in/offers/domain-airo?isc=insemairoc&countryview=1&currencyType=INR&cdtl=c_17623973925.g_145884810616.k_kwd-109021299.a_714629196639.d_c.ctv_g&bnb=nb&gad_source=1&gad_campaignid=17623973925&gbraid=0AAAAAD_AGdz5JQ_DkiJ9OjdT2173ktC7P&gclid=Cj0KCQjwvJHIBhCgARIsAEQnWlDN9w0YQffvsu00R9J9rlZmqzrXWHGbdR2sNA2o8t2dv44NBfX8OYUaAq9YEALw_wcB");
		driver.manage().window().maximize();


		//	1.name
		driver.findElement(By.name("searchText")).sendKeys("Mahesh");

		//2.id
		//				boolean isDisplayed=driver.findElement(By.id("primary-nav")).isDisplayed();
		//			System.out.println(isDisplayed);

		//		//3 & 4linktext and partial linktext
		//driver.findElement(By.linkText("About Us")).click();

		driver.findElement(By.partialLinkText("About")).click();



		//	5.By className
		List<WebElement>headerCount=driver.findElements(By.className("hf-pymupmi"));
		System.out.println("Total: "+headerCount.size());

		//	6.By tagname
		List<WebElement>t1=	driver.findElements(By.tagName("a"));
		System.out.println("Toatl: "+t1.size());



		List<WebElement>i1=	driver.findElements(By.tagName("img"));
		System.out.println("Toatl: "+i1.size());





		driver.quit();





	}


}
