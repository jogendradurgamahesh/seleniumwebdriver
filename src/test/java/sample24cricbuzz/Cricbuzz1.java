package sample24cricbuzz;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.cricbuzz.com/live-cricket-scorecard/138743/indu19-vs-uaeu19-1st-match-group-a-acc-mens-u19-asia-cup-2025 ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		

		

		
		  List<WebElement> rows = driver.findElements(
		            By.xpath("//table[contains(@class,'batsman')]//tbody/tr")
		        );

		        for (WebElement row : rows) {

		            // Batsman name
		            String batsmanName = row.findElement(By.xpath("./td[1]")).getText();

		            // Sixes column (usually 6th or 7th)
		            String sixesText = row.findElement(By.xpath("./td[contains(@class,'six')] | ./td[7]")).getText();

		            if (!sixesText.isEmpty()) {
		                int sixes = Integer.parseInt(sixesText);

		                if (sixes > 0) {
		                    System.out.println(batsmanName + " hit " + sixes + " sixes");
		                }
		            }
		        }

		        driver.quit();

	}

}


















//package sample24cricbuzz;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class Cricbuzz1 {
//
//    public static void main(String[] args) {
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/138743/indu19-vs-uaeu19-1st-match-group-a-acc-mens-u19-asia-cup-2025");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//        // Wait until batsman table is loaded
//        List<WebElement> rows = wait.until(
//                ExpectedConditions.presenceOfAllElementsLocatedBy(
//                        By.xpath("//table[contains(@class,'batsman')]//tbody/tr[td]")
//                )
//        );
//
//        for (WebElement row : rows) {
//
//            String batsmanName = row.findElement(By.xpath("./td[1]//a")).getText();
//
//            String sixesText = row.findElement(By.xpath("./td[7]")).getText().trim();
//
//            if (!sixesText.isEmpty() && sixesText.matches("\\d+")) {
//
//                int sixes = Integer.parseInt(sixesText);
//
//                if (sixes > 0) {
//                    System.out.println(batsmanName + " hit " + sixes + " sixes");
//                }
//            }
//        }
//
//        // DO NOT close immediately
//        driver.quit();
//    }
//}

