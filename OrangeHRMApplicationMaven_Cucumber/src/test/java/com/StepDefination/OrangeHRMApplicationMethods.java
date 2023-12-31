package com.StepDefination;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Utility.Log;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationMethods {
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	public OrangeHRMApplicationMethods(Hooks hook) //Its a Constructor
	{
		driver=hook.driver;
	}
	
	@Given("^User should open Chrome Browser in the System$")
	public void user_should_open_Chrome_Browser_in_the_System() 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\OHRMAutomation\\OrangeHRMApplicationMaven_Cucumber\\browserDriverFiles\\chromedriver.exe");
		//driver = new ChromeDriver();
		//Log.info("***** Chrome Browser Launched Successfully ************ ");	
	}

	@When("^User should enter the OrangeHRM Application Url Address$")
	public void user_should_enter_the_OrangeHRM_Application_Url_Address()  
	{
	   driver.get(applicationUrlAddress);
	   Log.info("Successfully Navigated to OrangeHRM Application");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^User should be navigated to OrangeHRM Application LogIn WebPage$")
	public void user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()  
	{
		// id="logInPanelHeading"//<div id="logInPanelHeading">LOGIN Panel</div>
		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		//System.out.println(" The expected OrangeHRM Application LogIn Page Text is :- "+expected_OrangeHRMApplicationLogInPageText);
       Log.info("The expected OrangeHRM Application LogIn Page Text is :-"+expected_OrangeHRMApplicationLogInPageText);
		
       By logInPageTextProperty=By.id("logInPanelHeading");
		WebElement logInPageText=driver.findElement(logInPageTextProperty);

		String actual_OrangeHRMApplicationLogInPageText=logInPageText.getText();
		// System.out.println(" The actual OrangeHRM Application LogIn Page Text is :- "+actual_OrangeHRMApplicationLogInPageText);

		Log.info(" The actual OrangeHRM Application LogIn Page Text is :- "+actual_OrangeHRMApplicationLogInPageText);

		if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
		//System.out.println(" Successfully Navigated to OrangeHRM Application Login Page - PASS ");
		Log.info(" Successfully Navigated to OrangeHRM Application Login Page - PASS ");

		}
		else
		{
		//System.out.println(" Failed to Navigate to OrangeHRM Application LogIN Page - FAIL ");
		Log.info("Failed to Navigate to OrangeHRM Application Login Page - FAIL ");
		}
	    }
	
	@Then("^User should close the Chrome Browser along with OrangeHRM Application$")
	public void user_should_close_the_Chrome_Browser_along_with_OrangeHRM_Application() 
	{
		driver.close();
		//System.out.println("****Successfully closed OrangeHRM Application*****");
	   Log.info("****Successfully closed OrangeHRM Application*****");
	}
	
	@Then("^User should enter userName and password and click on logIn button$")
	public void user_should_enter_userName_and_password_and_click_on_logIn_button() 
	{
		// driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtUsername" id="txtUsername" type="text">
		String userNameTestData="Admin"; // Test Data
		By userNameProperty=By.id("txtUsername");
		//identifying the property of an element - userName
		// Identifying the Element(userName) on the Current WebPage
		WebElement userName=driver.findElement(userNameProperty);
		// Performing Operation on the UserName WebElement
		userName.sendKeys(userNameTestData);
		
        //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		String passwordTestData="Livetech@123";
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
	
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By logInButtonProperty=By.className("button");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();
	}
	
	@Then("^User should enter \"([^\"]*)\" and \"([^\"]*)\" and click on logIn button$")
	public void user_should_enter_and_and_click_on_logIn_button(String UserName, String Password) 
	{
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
		//String userNameTestData="Admin"; //TestData
			By userNameProperty=By.id("txtUsername");
			//identifying the property of an element - userName
			// Identifying the Element(userName) on the Current WebPage
			WebElement userName=driver.findElement(userNameProperty);
			// Performing Operation on the UserName WebElement
			userName.sendKeys(UserName);
			
			//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

			// String passwordTestData="Livetech@123";
			By passwordProperty=By.name("txtPassword");
			WebElement password=driver.findElement(passwordProperty);
			password.sendKeys(Password);

			//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			By logInButtonProperty=By.className("button");
			WebElement logInButton=driver.findElement(logInButtonProperty);
			logInButton.click();
	}
	
     WebElement welComeAdmin;  //global variable
	
	@Then("^User should be navigated to OrangeHRM Application HomePage$")
	public void user_should_be_navigated_to_OrangeHRM_Application_HomePage()  
	{
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		By welComeAdminProperty=By.id("welcome");
		welComeAdmin=driver.findElement(welComeAdminProperty);
		String expected_OrangeHRMApplicationHomePageText="Admin";
		//System.out.println(" The expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);
		Log.info(" The expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);
		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		//System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);
		Log.info(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);
		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		// System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS");
		Log.info(" Successfully Navigated to OrangeHRM Application HomePage - PASS");
		}
		else
		{
		// System.out.println(" Failed to navigate to OrangeHRM Application HomePage - FAIL ");
		Log.info(" Failed to navigate to OrangeHRM Application HomePage - FAIL ");
		}
	    }
	
	@Then("^User should logOut from the OrangeHRM Application$")
	public void user_should_logOut_from_the_OrangeHRM_Application() 
	{
            welComeAdmin.click();
		
		    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
			By logOutProperty=By.linkText("Logout");
			WebElement logOut=driver.findElement(logOutProperty);
			logOut.click();
			// System.out.println(" Successfully LogOut from OrangeHRM Application");
			Log.info("Successfully LogOut from OrangeHRM Application");
	
	}
    }
	







