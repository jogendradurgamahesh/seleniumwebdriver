package sample7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
//		1.using webelement going to frame 1
		WebElement frame1=  driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		WebElement i1= driver.findElement(By.xpath("//input[@name='mytext1']"));
		i1.sendKeys("Mahesh");
		
		String value1 = i1.getAttribute("value");

		if(value1.equals("Mahesh")) {
		    System.out.println("Frame1 Test Passed");
		} else {
		    System.out.println("Frame1 Test Failed");
		}
		
		driver.switchTo().defaultContent();//switch to main page 
		
		
		//now switching to another frame
//		2.using webelement going to frame 2
		
		
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		WebElement i2= driver.findElement(By.xpath("//input[@name='mytext2']"));
		i2.sendKeys("Prince");
		
		String value2 = i2.getAttribute("value");

		if(value2.equals("Prince")) {
		    System.out.println("Frame2 Test Passed");
		} else {
		    System.out.println("Frame2 Test Failed");
		}
		
		driver.switchTo().defaultContent();
		
		
//		3.using webelement going to frame 3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		WebElement i3= driver.findElement(By.xpath("//input[@name='mytext3']"));
		i3.sendKeys("Jogi");
		
		 String value3 = i3.getAttribute("value");

	        if (value3.equals("Jogi")) {
	            System.out.println("Frame3 Text Test Passed");
	        } else {
	            System.out.println("Frame3 Text Test Failed");
	        }

		
		//inner frame-part of frame3
		driver.switchTo().frame(0);//switching to frame using index
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
		
		
		//going to frame 4
		WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		
		WebElement i4= driver.findElement(By.xpath("//input[@name='mytext4']"));
		i4.sendKeys("Jogiiiii");
		
		 String value4 = i4.getAttribute("value");

	        if (value4.equals("Jogiiiii")) {
	            System.out.println("Frame4 Text Test Passed");
	        } else {
	            System.out.println("Frame4 Text Test Failed");
	        }
	        driver.switchTo().defaultContent();

	}

}
