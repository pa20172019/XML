package test;

 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

  
 
 

public class LoginTest {
	 
	WebDriver driver;
	String username = "demo@techfios.com";
    String password = "abc123";

	
  @Test
  public void validUserShouldBeAbleToLogIn() {
		
		driver = BrowserFactory.init();
	     
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(username);
		loginPage.insertPassWord(password);
		loginPage.clickSignin();
	}

}
