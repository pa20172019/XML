package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	
	 static WebDriver driver;
	 String username = "demo@techfios.com";
	 String password = "abc123";
	 
	 
	 public static WebDriver init(){
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		return driver;
	}
	
    public static void teardown() { 
	   driver.close();
	   driver.quit(); 
	}

}
