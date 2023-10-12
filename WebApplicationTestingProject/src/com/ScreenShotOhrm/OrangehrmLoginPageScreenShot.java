package com.ScreenShotOhrm;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmLoginPageScreenShot {

		WebDriver driver;
		
		public void applicationLaunch()
		{
			String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			
			//Automating the Chrome Browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\OHRMAutomation\\WebApplicationTestingProject\\browserDriverFiles\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.get(applicationUrlAddress);		
		}
		
		public void applicationClose()
		{
			driver.quit();
		}
		
		public static void main(String[] args) throws Exception  {
			
			OrangehrmLoginPageScreenShot OrangehrmLoginPage=new OrangehrmLoginPageScreenShot();
			OrangehrmLoginPage.applicationLaunch();
			OrangehrmLoginPage.capturingOrangehrmLoginPageScreenShot();
			OrangehrmLoginPage.applicationClose();	
		}
		public void capturingOrangehrmLoginPageScreenShot() throws IOException, Exception {
			
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("Livetech@123");
			driver.findElement(By.className("button")).click();	
			Thread.sleep(5000);
		// TakesScreenshot - is an interface of Selenium
		// OutputType - is an interface of Selenium
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("./ScreenShot/Ohrm1.png"));
		
		}

		
	}


