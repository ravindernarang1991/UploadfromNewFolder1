package NewFolder;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import CUSTOMLIBRARIES.fUCTIONS;



public class ChromeTest extends fUCTIONS{
	
  @Test
  public void f() {
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  
	  driver.get("https://accounts.google.com");
	  driver.findElement(input_Email).sendKeys("ravindernarang1991@gmail.com");
	  driver.findElement(button_next).click();
	 
	  waitforelement(4000); 
	  driver.findElement(input_password).sendKeys("nokia3110@");
	  driver.findElement(button_SignIn).click();
	   waitforelement(4000);
	   driver.findElement(img_account).click();
	   waitforelement(4000); 
	   driver.findElement(button_signout).click();
	   driver.quit();
			
			
  }
}
