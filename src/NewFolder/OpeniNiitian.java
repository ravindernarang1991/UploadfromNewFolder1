package NewFolder;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import CUSTOMLIBRARIES.fUCTIONS;
import com.thoughtworks.selenium.webdriven.Windows;

public class OpeniNiitian extends fUCTIONS{
@Test
	public void iniitian(){
		WebDriver driver;
		
		driver= new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*
		//WebDriver webDriver1 = null;
		Set<String> winSet = driver.getWindowHandles();
		java.util.List<String> winList = new ArrayList<String>(winSet);
		String newTab = winList.get(winList.size() - 1);
		driver.close(); // close the original tab
		driver.switchTo().window(newTab);
		*/
		
		driver.get("https://iniitian.niit-tech.com/ntless/");
		driver.findElement(By.xpath("//input[@name='empcode']")).sendKeys("59795");
		driver.findElement(By.xpath("//input[@name='emppassNTL']")).sendKeys("nokia3110&");
		driver.findElement(By.xpath("//input[@id='image1']")).click();
		waitforelement(8000);
		driver.findElement(By.xpath("//span[@id='__tab_tabCustomized_ctl02']")).click();
		driver.findElement(By.xpath("//img[@name='imgRight'])[4]")).click();
		driver.findElement(By.xpath("//a[@id='tabCustomized_ctl02_ctl18_lnkClick1']")).click();
		
	}
}
