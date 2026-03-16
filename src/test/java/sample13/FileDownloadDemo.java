package sample13;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownloadDemo {

	public static void main(String[] args) {

        String downloadPath = System.getProperty("user.dir") + "\\downloads";

        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();

        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);

        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("sample-upload.txt")).click();

        System.out.println("Download started");

    }
}
