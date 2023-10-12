package com.OhrmTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	
	public void applicationLaunch() throws InterruptedException
	{
		//Automating the Chrome Browser
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
	   
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
	}
	
	public void applicationClose()
	{
		driver.quit();
	}
}
	





	

