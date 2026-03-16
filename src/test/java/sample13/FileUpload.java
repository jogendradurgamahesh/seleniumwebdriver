package sample13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();


		//single file upload
//			       driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\HELLO PC\\OneDrive\\Documents\\demo1\\main.py");
//		
//			
//			     if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("main.py")) {
//			    	 System.out.println("Uploaded success");
//			     }
//			     else {
//			    	 System.out.println("Not uploaded");
//			     }




		//	       2.multiple file upload
		String file1="C:\\Users\\HELLO PC\\OneDrive\\Documents\\main\\Day2_Mahesh_scenario based and project oriented_answers.docx";
		String file2="C:\\Users\\HELLO PC\\OneDrive\\Documents\\main\\Day3_Mahesh_real time_answers.docx";

		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);

		int files_uploaded =driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

		//validation 1:checking no-of files
		if(files_uploaded==2) {
			System.out.println("success");
		}
		else {
			System.out.println("Not");
		}


		//	 validation 2:validate file names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Day2_Mahesh_scenario based and project oriented_answers.docx")
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Day3_Mahesh_real time_answers.docx"))
		{
			System.out.println("matching files");
		}
		else {
			System.out.println("Not matching");
		}












	}

}
