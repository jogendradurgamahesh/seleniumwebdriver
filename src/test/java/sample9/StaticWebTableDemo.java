package sample9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//  1.find total no of rows in a element
		int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //multiple tables it is preferred
	//	int row=driver.findElements(By.tagName("tr")).size(); //we can use but when we have single table only 
		System.out.println("No of rows : "+row);



//       2.find no of cols

		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //multiple tables it is preferred
		//int cols=driver.findElements(By.tagName("th")).size();
		System.out.println("No of cols : "+cols);

		
//		3.read specific row and col (5th row and 1st col)
	String name=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(name);
		
		//System.out.println("BookName "+"\t"+" Author"+"\t"+"Subject "+"\t"+"price");
		
//		4.read  data from all rows and cols 
//		for(int r=2;r<=row;r++) {
//			for(int c=1;c<=cols;c++) {
//			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
//			System.out.print(value+"\t");
//			}
//			System.out.println();
//		}


//    5.capture bookname by searching author
//		for(int r=2;r<=row;r++) {
//		String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//		//	System.out.println(authorName);
//			if(authorName.equals("Mukesh")) {
//			String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//			System.out.println("book by mukesh: "+book +"\t"+ "AuthorName "+"\t"+authorName);
//			}
//			
//		}
		
		
//		6.Total price of all books
		int total=0;
		for(int r=2;r<=row;r++) {
		int prices=	Integer.parseInt(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText());
		total+=prices;
		
		}
		System.out.println(total);
		


	}}
