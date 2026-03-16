package sample14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSLDemo {

	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);  //accepts ssl certificates
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://expired.badssl.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("Title "+driver.getTitle()); //Title Privacy error

	}

}
