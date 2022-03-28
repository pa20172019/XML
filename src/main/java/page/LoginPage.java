package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
 public class LoginPage {
	
	WebDriver driver;
    
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	
	}
	
    //Element List
	/*
	 * WebElement userNameElement =
	 * driver.findElement(By.xpath("//input[@id=\"username\"]")); By userNameField =
	 * By.xpath("//input[@id=\"username\"] ");
	 */
	@FindBy (how = How.XPATH, using = "//input[@id=\"username\"]") WebElement USERNAME_ELEMENT;
	@FindBy (how = How.XPATH, using = "//input[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy (how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_ELEMENT;
	
	//Individual Elements
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
		
	}
 
	
	public void insertPassWord(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSignin() {
		SIGNIN_ELEMENT.click();
		
	}
	//Combined Elements
	public void performLogin(String username, String password) {
		USERNAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_ELEMENT.click();
		
		
	}

 }
 
