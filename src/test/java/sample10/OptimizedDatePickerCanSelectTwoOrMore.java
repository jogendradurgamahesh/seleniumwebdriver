package sample10;

import java.sql.Driver;

//public class OptimizedDatePickerCanSelectTwoOrMore {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OptimizedDatePickerCanSelectTwoOrMore {

	//step 3:select month and year
	static void selectMonthAndYear(WebDriver driver,String expyear,String expmonth) {
		while(true) {
			String year	=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			if(year.equals(expyear)&& month.equals(expmonth)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();


		}
	}

	//4.select the date
	static void selectData(WebDriver driver,String expdate) {
		List<WebElement> dates=	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td/a"));

		for(WebElement d:dates) {
			if(d.getText().equals(expdate)) {
				d.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		//switch to frame
		driver.switchTo().frame(0);

		//			/method 1.using sendKeys()
		//findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/14/2025");

		//			method 2.Calendar Widget

		//step 1:extract target date 
		String expyear="2026";
		String expmonth="October";
		String expdate="14";

		//step 2:open calendar
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		
     selectMonthAndYear(driver, expyear, expmonth);
     selectData(driver, expdate);
     

	

	


	}

}



