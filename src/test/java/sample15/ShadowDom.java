package sample15;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();

		//This Element is inside single shadow DOM.
		String cssSelectorForHost1 = "#shadow-root";
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#shadow-element"));

		
		
		//This Element is inside 2 nested shadow DOM.
        SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		shadow1.findElement(By.cssSelector("#nested-shadow-element"));


		//This Element is inside 3 nested shadow DOM.


		SearchContext shadow10 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow11 = shadow10.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow12 = shadow11.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		String shadow13= shadow12.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();

		System.out.println(shadow13);
	}

}
