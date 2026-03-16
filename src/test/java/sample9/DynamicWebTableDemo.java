package sample9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		WebElement  uname=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		uname.clear();
		uname.sendKeys("Admin");

		WebElement  pname=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pname.clear();
		pname.sendKeys("admin123");


		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click() ;


		//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']
		//		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		//		driver.findElement(By.xpath("//ul[@class='oxd-pagination__ul']//li//button[@type='button']"));
		//		

		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);

		List<WebElement> pagination = driver.findElements(By.xpath("//ul[@class='oxd-pagination__ul']/li"));

		int totalPages = pagination.size()-2;  
		// removing "Prev" and "Next" buttons
		System.out.println("Total Pages: " + totalPages);


		//selected page
		for(int p=1;p<=totalPages;p++) {
			if(p>1) {
				WebElement activePage=driver.findElement(By.xpath("//ul[@class='oxd-pagination__ul']//*[text()='"+p+"']"));
				activePage.click();
				Thread.sleep(3000);
			}

			List<WebElement> rows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
			System.out.println("Rows in page " + p + ": " + rows.size());

//printing data in req page			
			for(int i=1;i<rows.size();i++) {
			String id=	driver.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div/div[2]")).getText();
			String name=driver.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div/div[3]")).getText();
			String status=driver.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div/div[6]")).getText();
			System.out.println(id +" | " +name + " | "+status);
			
			}
			
			
			
			
		System.out.println("REading all pages");	
		
		driver.findElement(By.xpath("//button[@class='oxd-pagination-page-item oxd-pagination-page-item--page' and @type='button'][1]")).click();
			
		for(int p1=1;p<=totalPages;p++) {
			if(p1>1) {
				 driver.findElement(By.xpath("//button[text()='" + p1 + "']")).click();
	                Thread.sleep(1500);
	            }

	            List<WebElement> allRows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
	            
	            for (int i = 1; i <= allRows.size(); i++) {

	                String empId = driver.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div/div[2]")).getText();
	                String empName = driver.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div/div[3]")).getText();
	                String jobTitle = driver.findElement(By.xpath("//div[@class='oxd-table-body']/div[" + i + "]/div/div[4]")).getText();

	                System.out.println(empId + " | " + empName + " | " + jobTitle);
	            }
			
			
			
			


		}



	}}

}
