package com.postalert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PropertyAlertTest {
	

	int i;
	public WebDriver driver;
	
	@Test
	public void Run() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromeDriver.exe");
		Reporter.log("This browser is Open now");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("This browser is maximized");
		driver.get("https://www.magicbricks.com/property-requirement-to-buy-rent/residential-commercial");
		driver.navigate().refresh();
		Reporter.log("PostAlert page is open");
				
		WebElement element = driver.findElement(By.id("listTypeB"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		
		
		WebElement element1 = driver.findElement(By.id("textPropertySell"));
		executor.executeScript("arguments[0].click();", element1);
		Thread.sleep(4000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='divPro']//div//div"));
		Thread.sleep(4000);
		System.out.println("Property Type List dropdown :  " + list);
		System.out.println("Property Type List size : " +list.size());
		for(i=0;i < list.size();i++) {
		System.out.println("Property Type List : " + list.get(i).getText());
		if(list.get(i).getText().contains("Multistorey Apartment")) {
		list.get(i).click();
				break;				
          }
		}
		driver.findElement(By.xpath("//div[@class='formLabel'][contains(text(),'Budget')]")).click();
	//// Select Budget for property type
		
		WebElement element2 = driver.findElement(By.id("budgetBuyDDList"));
		executor.executeScript("arguments[0].click();", element2);
		//Thread.sleep(4000);
		//executor.executeScript("document.getElementById('budgetBuyDDList').click()");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@id='budgetBuyDDList']")).click();
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@id='budgetRentDiv']//ul[@class='multiCheck']"));
		Thread.sleep(4000);
		System.out.println("Budget Type List dropdown :	 " + list1);
		System.out.println("Budget Type List size : " +list1.size());
		for(i=0;i < list1.size();i++) {
		System.out.println("Budget List : " + list1.get(i).getText());
		if(list1.get(i).getText().contains("10,000 - 15,000")) {
			Thread.sleep(4000);
		list1.get(i).click();
				  break;					
	     }
	   }
		driver.findElement(By.xpath("//div[contains(text(),'Bedroom')]")).click();
		/// Select Bedroom			
		executor.executeScript("document.getElementById('textBedRoom').click()");
		//driver.findElement(By.xpath("//input[@id='budgetBuyDDList']")).click();
		Thread.sleep(4000);
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@id='budgetBuyDiv']//div[@class='dropDownlist']"));
		Thread.sleep(4000);
		System.out.println("abdddddddddddddddd " + list2);
		System.out.println("abckdkkkkkkkkkk " +list2.size());
		for(i=0;i < list2.size();i++) {
		System.out.println("abkkkkkkklllllllllll " + list2.get(i).getText());
		if(list2.get(i).getText().contains("2")) {
		list2.get(i).click();
				break;					
          }
	}
  }

}		
	
	
