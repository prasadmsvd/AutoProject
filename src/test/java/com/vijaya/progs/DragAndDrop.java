package com.vijaya.progs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

public static void main(String[] args) {

	 System.setProperty("webdriver.gecko.driver", ".\\jars\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();

driver.get("F:\\Vijaya\\html\\drag_drop.html");

// Create object of actions class
Actions act=new Actions(driver);

// Find element xpath which we need to drag
WebElement drag=driver.findElement(By.tagName("img"));

// Find element xpath where we need to drop
WebElement drop=driver.findElement(By.id("div1"));

// Drag element to destination
act.dragAndDrop(drag, drop).build().perform();

}

}