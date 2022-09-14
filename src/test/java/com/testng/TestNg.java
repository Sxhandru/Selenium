package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class TestNg {
		
@Test
public void main () {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Chandru\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	
	@BeforeTest
	WebElement Username =driver.findElement(By.xpath("//input[@name=\"username\"]"));
	Username.sendKeys("Chandrusrinivasan");
	
	@Test(priority = 1)
	driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
	
	@Test(priority = 0)
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("2ZRY7E");
		
	
	
	
		

		
		
}		
	

}
