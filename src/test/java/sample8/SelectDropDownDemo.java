package sample8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement dropCountryElement=driver.findElement(By.xpath("//select[@id='country']"));
	Select dropCountry=new Select(dropCountryElement);
	
	dropCountry.selectByVisibleText("France");
//	dropCountry.selectByValue("uk");
//	dropCountry.selectByIndex(9);
	
	
	
//	capturing all options
	List<WebElement>options=dropCountry.getOptions();
	System.out.println(options.size());
	
//	print all the options
	   //enhanced loop
//	for(WebElement options1:options.getOptions()) {
	for(WebElement options1:options) {
		System.out.println(options1.getText());
		
	}
	
//	for(int i=0;i<options.size();i++) {
//		System.out.println(options.get(i).getText());
//	}
//	
	
	WebElement selectedOption = dropCountry.getFirstSelectedOption();
	System.out.println("Final Selected Option: " + selectedOption.getText());
	

	}

}
