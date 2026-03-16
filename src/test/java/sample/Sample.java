package sample;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		//System.out.println("testing");
		
		
		//1.launch browser
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		
        //2.open url https://demo.opencart.com/
		
		driver.get("https://jayathisoft.com/");
	//	driver.get("https://opendart.com/");
		
      
		//3.validate title(Opendart Akademi)
		String act_title=driver.getTitle();
		
		
		//Job Training & Placement in India | ₹8L–40L Jobs | JayathiSoft
		
		if(act_title.equals("Job Training & Placement in India | ₹8L–40L Jobs | JayathiSoft")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
//		4.close browser
	//	driver.close();
		driver.quit();
		
		
		
		
	}
}
