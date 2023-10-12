package com.OrangeHRMApplicationPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class OrangeHRMApplication_LogInPage extends BaseTest {

	//This class will contain information about the elements present in the webpage
	
	//And also the Operations performed on these elements
	
	//These class is referred to as an "Object Repository Class
	
	public OrangeHRMApplication_LogInPage() // Constuctor - of Java
	
	//Whenever a class name is similar to Method Name then it is called as Constuctor
	{
		PageFactory.initElements(driver,this);
	}
	//<div id="logInPanelHeading">LOGIN Panel</div>
	//WebElement logInPanel=driver.findElement("logInPanelHeading"));
	
	//Identification of the WebElements
	@FindBy(id="logInPanelHeading")
	WebElement logInPanel;
	
	//Business Logics - Performing Operation on the WebElement
	public void validatingLogInPanelText()
	{
		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		System.out.println("The Expected text of the OrangeHRM Application LogIn page is :-"+expected_OrangeHRMApplicationLogInPageText);
		
		String actual_OrangeHRMApplicationLogInPageText=logInPanel.getText();
		System.out.println("The actual Text of the OrangeHRM Application LogIn Page is :-"+actual_OrangeHRMApplicationLogInPageText);
		
		if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
		   System.out.println("OrangeHRM Application LogInPage Text Validation Successfull :- PASS");
		}
		else
		{
			System.out.println("OrangeHRM Application LogInPage Text Validation Successfull :- FAIL");
			
		}
	}
	
	//OrangeHRM Application Logo Validation 
	///html/body/div[1]/div/div[2]/div/img
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
	WebElement orangeHRMApplicationLogInPageLogo;
	
	public void validatingOrangeHRMApplicationLogInPageLogo()
	{
		boolean flag=orangeHRMApplicationLogInPageLogo.isDisplayed();
		
		if(flag)
		{
			System.out.println("OrangeHRM Application LogInPage Logo is displayed - PASS");
		}
		else
		{
			System.out.println("OrangeHRM Application LogInPage Logo is NOT displayed - FAIL");
			
		}
	}
	
	//<input name="txtUsername" id="txtUsername" type="text">
	@FindBy(id="txtUsername")
	WebElement userName;
	
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	@FindBy(id="txtPassword")
	WebElement password;
	
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	@FindBy(className="button")
	WebElement logInPageLogInButton;
	
	//using parameters
	public void orangeHRMApplicationLogInPage_logIn(String userNameTestData,String passwordTestData)
	{
		userName.sendKeys(userNameTestData);
		password.sendKeys(passwordTestData);
		logInPageLogInButton.click();
		
		//Validating HomePage
    }
}
