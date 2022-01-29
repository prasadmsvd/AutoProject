package com.vijaya.progs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	  //  System.setProperty("webdriver.chrome.driver", ".\\jars\\chromedriver.exe");  
	 //   WebDriver driver=new ChromeDriver();  
		
		 System.setProperty("webdriver.gecko.driver", ".\\jars\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 
        
	    driver.navigate().to("http://www.google.com/");  
      
	   driver.findElement(By.name("q")).sendKeys("gmail login site");  
	    Thread.sleep(3000);
	  //  driver.findElement(By.xpath("//[@title='Search']")).sendKeys("amazon shopping site");
	   driver.findElement(By.cssSelector("input[name='btnI']")).click();
	   driver.findElement(By.name("identifier")).sendKeys("v.deepya99@gmail.com");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();

//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();)
	    // Click on the search button  
	  //  driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
	    
	   // driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]")).click();
	   // driver.findElement(By.name("btnI")).click();  
	

	   
		
	}

}
