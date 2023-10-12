package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void applicationLaunch() throws InterruptedException
	{
		//Automating the ChromeBrowser
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
	   
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);		
	}
	@AfterTest
	public void applicationClose()
	{
		driver.quit();
	}
}
	

