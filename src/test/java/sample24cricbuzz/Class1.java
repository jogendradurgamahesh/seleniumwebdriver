package sample24cricbuzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
 public static void main(String[] args) {
	
	   WebDriver driver = new ChromeDriver();
       driver.get("https://www.cricbuzz.com/live-cricket-scorecard/12345/india-vs-australia");
       driver.manage().window().maximize();
       
      String currentUrl= driver.getCurrentUrl();
      System.out.println(currentUrl);
      
      
      
    String baseUrl=  currentUrl.split("/live-cricket-scorecard/12345/india-vs-australia")[0];
    System.out.println(baseUrl);
      
      driver.quit();
}
}
