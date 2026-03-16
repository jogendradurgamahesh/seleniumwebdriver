package sample24cricbuzz;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//public class CricketSixes {
//}

public class CricketSixes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/117425/ind-vs-rsa-3rd-t20i-south-africa-tour-of-india-2025");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

      
        List<WebElement> rows = driver.findElements(By.xpath(
                "(//div[@class='text-xs'])[7]/div[contains(@class,'scorecard-bat-grid') and contains(@class,'border-b')]"
        ));

        System.out.println("Total batting rows: " + rows.size());

        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.xpath("./div"));

            // Defensive check
            if (columns.size() < 5) continue;

            String sixes = columns.get(4).getText().trim();

            if (sixes.matches("\\d+") && Integer.parseInt(sixes) > 0) {
                String batsman = columns.get(0).getText();
                System.out.println(batsman + " hit sixes: " + sixes);
            }
        }
        
        
        
        
        List<WebElement> bowlingRows = driver.findElements(
        	    By.xpath("//div[@class='text-xs']/div[contains(@class,'scorecard-bowl-grid') and contains(@class,'border-b')]")
        	);

        	System.out.println("Total bowling rows: " + bowlingRows.size());

        	String bestBowler = "";
        	int maxWickets = 0;

        	for (WebElement row : bowlingRows) {

        	   
        	    String bowlerName = row.findElement(By.xpath(".//a")).getText().trim();

        	   
        	    List<WebElement> cols = row.findElements(By.xpath("./div"));

        	    if (cols.size() < 5) continue;

        	   
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

        
   

        
        
        
        
        

        driver.quit();
    }
}
    
