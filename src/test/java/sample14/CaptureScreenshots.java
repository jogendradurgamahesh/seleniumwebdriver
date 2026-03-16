package sample14;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CaptureScreenshots {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();


		//       1.capture fullpage screenshot

		/*		TakesScreenshot sc=(TakesScreenshot)driver;
		File sourceFile= sc.getScreenshotAs(OutputType.FILE);

//		File targetFile=new File("C:\\Users\\HELLO PC\\OneDrive\\Documents\\selenium\\seleniumwebdriver\\screenshots\\fullpage.png");
		File targetFile=new File(System.getProperty("user.dir")+ "\\screenshots\\fullpage.png");

		//copying sourcefile to targetfile
		sourceFile.renameTo(targetFile);
		 */


		//		2.capturing specific section
			WebElement featuredProduct=	driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
		File sourceFile1=featuredProduct.getScreenshotAs(OutputType.FILE);
		File destinationFile1=new File(System.getProperty("user.dir")+"\\\\screenshots\\\\specificpage.png");
		sourceFile1.renameTo(destinationFile1);  



		//	3.capture screenshot of specific weblelement
		/*		WebElement specificElement=	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile2=specificElement.getScreenshotAs(OutputType.FILE);
		File destinationFile2=new File(System.getProperty("user.dir")+"\\\\screenshots\\\\logo.png");
		sourceFile2.renameTo(destinationFile2);  */


		driver.quit();













	}

}
