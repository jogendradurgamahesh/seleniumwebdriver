package sample24cricbuzz;

//public class HitSixes {
//
//}




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//public class HitSixes {




public class HitSixes {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get(
            "https://www.cricbuzz.com/live-cricket-scorecard/138743/" +
            "indu19-vs-uaeu19-1st-match-group-a-acc-mens-u19-asia-cup-2025"
        );

        System.out.println("Page loaded");

        // Click Highlights
        driver.findElement(By.xpath("//a[normalize-space()='Highlights']")).click();
        Thread.sleep(2000);
        System.out.println("Clicked Highlights");

        // Click Sixes
        driver.findElement(By.xpath("//div[normalize-space()='Sixes']")).click();
        Thread.sleep(2000);
        System.out.println("Clicked Sixes filter");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 🔥 IMPORTANT: Scroll the commentary container (NOT window)
        WebElement commentaryContainer = driver.findElement(
                By.xpath("//div[contains(@class,'cb-col cb-col-100 cb-ltst-wgt-hgt')]")
        );

        for (int i = 0; i < 6; i++) {
            js.executeScript(
                    "arguments[0].scrollTop = arguments[0].scrollHeight",
                    commentaryContainer
            );
            Thread.sleep(1500);
        }

        // Get commentary lines
        List<WebElement> commentaryLines = driver.findElements(
                By.xpath("//span[contains(@class,'cb-com-ln')]")
        );

        System.out.println("Total commentary lines: " + commentaryLines.size());

        Map<String, Integer> batsmanSixCount = new LinkedHashMap<>();

        for (WebElement line : commentaryLines) {

            String text = line.getText().toLowerCase();

            if (text.contains(" six ")) {

                // Example:
                // "vaibhav suryavanshi hits a massive six over long-on"

                String[] words = text.split(" ");
                if (words.length >= 2) {

                    String batsman = words[0] + " " + words[1];

                    batsmanSixCount.put(
                            batsman,
                            batsmanSixCount.getOrDefault(batsman, 0) + 1
                    );
                }
            }
        }

        System.out.println("\nBatsmen who scored six (>=1):");
        for (Map.Entry<String, Integer> entry : batsmanSixCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " six(es)");
        }

        driver.quit();
    }
}

