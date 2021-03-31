package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB 
{
	public WebDriver driver;
	@Test
	public void Run() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromeDriver.exe");
		Reporter.log("This browser is Open now");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("This browser is maximized");
		driver.get("https://www.google.co.in");
		Reporter.log("The  google website is open");
		driver.findElement(By.name("q")).sendKeys("Bye");
		Reporter.log("The  data \"BYE\" is entered");
	}

}
