package sample14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsOnIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();

		String act_title=driver.getTitle();
		System.out.println(act_title);

		if(act_title.equals("nopCommerce demo store. Home page title")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}  
	}

}
