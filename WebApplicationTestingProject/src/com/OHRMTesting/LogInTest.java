package com.OHRMTesting;
import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\OHRMAutomation\\WebApplicationTestingProject\\browserDriverFiles\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	//	<input name="txtUsername" id="txtUsername" type="text">
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">	
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Livetech@123");
		driver.findElement(By.className("button")).click();
		
		
		//driver.findElement(By.linkText("Logout")).click();
		
		
	}

}








