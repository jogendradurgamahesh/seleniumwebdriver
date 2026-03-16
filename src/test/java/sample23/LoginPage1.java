package sample23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage1 {

	WebDriver driver;
	// WebDriverWait wait;

	//	https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

	//1.construtor
	public LoginPage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}

	
	//2.locators:click selectors hub and select set driver command and click to recording 

/*	By txt_username_loc=By.xpath("//input[@placeholder='username']");
	By txt_password_loc=By.xpath("//input[@placeholder='password']");
	By btn_login_loc=By.xpath("//button[normalize-space()='Login']");  */
	
	
//	@FindBy(xpath="//input[@placeholder='username']") WebElement txt_username;
	@FindBy(how=How.XPATH,using="//input[@placeholder='username']") WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='password']") WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement login_btn;
	
	@FindBy(tagName="a") List<WebElement> links;
	
	
	



	//3.Action Methods
/*	public void setUsername(String uname) {
	driver.findElement(txt_username_loc).sendKeys(uname);
		
	}

	public void setPassword(String password) {
	driver.findElement(txt_password_loc).sendKeys(password);
	
	}


	public void clickLogin() {
		driver.findElement(btn_login_loc).click();

	}   */
	
	
	public void setUsername(String uname) {
		txt_username.sendKeys(uname);
			
		}

		public void setPassword(String password) {
			txt_password.sendKeys(password);
		
		}


		public void clickLogin() {
			login_btn.click();

		}





}
