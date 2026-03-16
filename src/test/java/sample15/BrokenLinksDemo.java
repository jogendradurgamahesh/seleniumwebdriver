package sample15;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");

		driver.manage().window().maximize();


		List<WebElement>links=	driver.findElements(By.tagName("a"));
		System.out.println("Links: "+links.size());
		
		
		int brokenLinks=0;
		for( WebElement link: links) {
		String url=	link.getAttribute("href");
		
		
		if(url==null || url.isEmpty()) {
			System.out.println("Not possible");
			continue;
			
		}
		
		//hit url to server
		try {
		URL linkurl=new URL(url); //converted href value  from string to url
		HttpURLConnection conn= (HttpURLConnection) linkurl.openConnection(); //open connection to server
		conn.connect();
		
		if(conn.getResponseCode()>=400) {
			System.out.println(url+"=========> Brokenlink");
			brokenLinks++;
		}
		else {
			System.out.println(url+"=========>Not a broken");
		}
		}
		catch (Exception e) {
            System.out.println(url + " --> Exception: " + e.getMessage());
        }
	
		}
	
	
	System.out.println("No of broken "+brokenLinks  );
	
	
	
	}

}
