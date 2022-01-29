package com.vijaya.progs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void test1() throws InterruptedException
	{
		 System.setProperty("webdriver.gecko.driver", ".\\jars\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
	    driver.navigate().to("http://www.google.com/");  
	    Thread.sleep(2000);
        System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Google");
		driver.close();
		
	}
	
}
