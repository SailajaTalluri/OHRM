package com.StepDefination;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import com.Utility.Log;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
public static WebDriver driver;
@Before
public static void setUp()
{
	System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	Log.info("*****Chrome Browser Launched Successfully*****");
}
@After
public static void tearDown()
{
	driver.close();
	//System.out.println("***** Successfully Closed Orange HRM Application *****");
	Log.info("******* Successfully Closed Orange HRM Application *******");
}
}

