package sample21;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//public class ParamTest {
//
//	WebDriver driver;
//	
//	@BeforeClass
//	@Parameters({"browser","url"})
//	void setup(String br,String url) throws InterruptedException {
//		
//		switch (br.toLowerCase()) {
//		case "chrome":driver=new ChromeDriver();break;
//		case "edge":driver=new EdgeDriver();break;
//		case "firefox":driver=new FirefoxDriver();break;
//		default:System.out.println("Invalid browser");return;
//		
//		
//		}	
//			
//		
//		
//		
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get(url);
//		driver.manage().window().maximize();
//		//Thread.sleep(3000);
//		
//	}
//	
//	@Test(priority = 1)
//	void testLogo() {
//	boolean status=	driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
//	Assert.assertEquals(status, true);
//		
//	}
//	
//	@Test(priority = 2)
//	void testTitle() {
//		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
//	}
//	
//	@Test(priority = 3)
//	void testUrl() {
//		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//	
//	@AfterClass
//	void tearDown() {
//		driver.quit();
//	}
//}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

    static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

    WebDriver getDriver() {
        return tdriver.get();
    }

    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String br,String url) throws InterruptedException {

        WebDriver driver = null;

        switch (br.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser");
                return;
        }

        tdriver.set(driver);

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().get(url);
        getDriver().manage().window().maximize();
    }

    @Test(priority = 1)
    void testLogo() {
        boolean status = getDriver()
                .findElement(By.xpath("//img[contains(@src,'branding')]"))
                .isDisplayed();
        Assert.assertFalse(status);
    }

    @Test(priority = 2)
    void testTitle() {
        Assert.assertEquals(getDriver().getTitle(), "OrangeHRM");
    }

    @Test(priority = 3)
    void testUrl() {
        Assert.assertEquals(
                getDriver().getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
        );
    }

    @AfterClass
    void tearDown() {
        getDriver().quit();
        tdriver.remove();
    }
}
