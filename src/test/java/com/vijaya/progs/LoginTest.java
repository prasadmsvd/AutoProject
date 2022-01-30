package com.vijaya.progs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	@Test
	public void test1() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();

		/* FirefoxOptions firefoxOptions = new FirefoxOptions();  
		firefoxOptions.addArguments("--display=0");
		RemoteWebDriver driver = new FirefoxDriver(firefoxOptions);  */
		
		 System.setProperty("webdriver.gecko.driver", ".\\jars\\geckodriver.exe");
		 RemoteWebDriver driver = new FirefoxDriver();
		 Thread.sleep(6000);
	    driver.navigate().to("http://www.google.com/");  
	    Thread.sleep(2000);
        System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Google");
		driver.close();
		
	}
	
}
