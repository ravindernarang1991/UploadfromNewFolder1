package NewFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TryFacebook {
@Test
public void login()
{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
//driver.manage().window().fullscreen();


driver.get("https://www.facebook.com/login/");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ravindernarang1991@gmail.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("nokia3110@");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
//driver.close();
	}
}
