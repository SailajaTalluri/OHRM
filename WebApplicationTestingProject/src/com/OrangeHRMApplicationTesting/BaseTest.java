package com.OrangeHRMApplicationTesting;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setUp() 
	{
		//Automating the ChromeBrowser
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
	   
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
		//its a WebPage wait time - webDriver to wait for the Application to be loaded on the Browser
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		//implicity Wait - is a smart wait and is a global wait 
		//the wait time is applicable for the driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
    }
	


