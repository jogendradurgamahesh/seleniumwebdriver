package sample23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	// WebDriverWait wait;

	//	https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

	//1.construtor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	//	  wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	
	//	2.locators:click selectors hub and select set driver command and click to recording 
	By txt_username_loc=By.xpath("//input[@placeholder='username']");
	By txt_password_loc=By.xpath("//input[@placeholder='password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
//	By txt_username_loc=By.cssSelector("input[name='username']");
//	By txt_password_loc=By.cssSelector("input[name='password']");
//	By btn_login_loc=By.cssSelector("//button[normalize-space()='Login']");


	//3.Action Methods
	public void setUsername(String uname) {
	driver.findElement(txt_username_loc).sendKeys(uname);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(txt_username_loc)).sendKeys(uname);

	}

	public void setPassword(String password) {
	driver.findElement(txt_password_loc).sendKeys(password);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(txt_password_loc)).sendKeys(password);
	}


	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	//	 wait.until(ExpectedConditions.elementToBeClickable(btn_login_loc)).click();
	}





}
