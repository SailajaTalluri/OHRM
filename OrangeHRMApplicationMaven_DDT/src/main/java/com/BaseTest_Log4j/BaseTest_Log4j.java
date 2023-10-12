package com.BaseTest_Log4j;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.Utility.Log;

public class BaseTest_Log4j {

	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
    
	@BeforeTest
	public void setUp()
	{
	// Automating the ChromeBrowser
	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	// System.out.println(" ********* ChromeBrowser Launched Successfully ******** ");

	Log.info("********* ChromeBrowser Launched Successfully ******** ");

	driver.get(applicationUrlAddress);
	//System.out.println(" Successfully Navigated to OrangeHRM Application ");
	Log.info("Successfully Navigated to OrangeHRM Application ");

	driver.manage().window().maximize();

	// its a WebPage wait time - webDriver to wait for the Application to be loaded on the Browser
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	// implicitlyWait - is a smart wait and is a global wait
	// the wait time is applicable for the driver
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@AfterTest
	public void tearDown()
	{
	driver.quit();
	// System.out.println(" **** ChormeBrowser Closed with the OrangeHRM Application Successfully ********");
	Log.info(" **** ChormeBrowser Closed with the OrangeHRM Application Successfully ********");
	}
	}


