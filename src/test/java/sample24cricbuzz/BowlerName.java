package sample24cricbuzz;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BowlerName {
	
	 public static void main(String[] args) throws Exception {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

//	        driver.get(
//	            "https://www.cricbuzz.com/live-cricket-scorecard/138743/" +
//	            "indu19-vs-uaeu19-1st-match-group-a-acc-mens-u19-asia-cup-2025"
//	        );
	        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/117425/ind-vs-rsa-3rd-t20i-south-africa-tour-of-india-2025");

	        System.out.println("Page loaded");
	        
	        
	        List<WebElement> bowlingRows = driver.findElements(
	        	    By.xpath("//div[@class='text-xs']/div[contains(@class,'scorecard-bowl-grid') and contains(@class,'border-b')]")
	        	);

	        	System.out.println("Total bowling rows: " + bowlingRows.size());

	        	String bestBowler = "";
	        	int maxWickets = 0;

	        	for (WebElement row : bowlingRows) {

	        	    // ✅ Bowler name
	        	    String bowlerName = row.findElement(By.xpath(".//a")).getText().trim();

	        	    // ✅ All numeric columns
	        	    List<WebElement> cols = row.findElements(By.xpath("./div"));

	        	    if (cols.size() < 5) continue;

	        	    // ✅ Wickets column (correct index)
	        	    String wicketsText = cols.get(3).getText().trim();

	        	    if (wicketsText.matches("\\d+")) {
	        	        int wickets = Integer.parseInt(wicketsText);

	        	        if (wickets > maxWickets) {
	        	            maxWickets = wickets;
	        	            bestBowler = bowlerName;
	        	        }
	        	    }
	        	}

	        	System.out.println("Best Bowler (by wickets): " + bestBowler + " -> " + maxWickets);

}
}