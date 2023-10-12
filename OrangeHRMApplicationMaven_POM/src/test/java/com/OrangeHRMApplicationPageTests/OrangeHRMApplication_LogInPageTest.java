package com.OrangeHRMApplicationPageTests;

import org.testng.annotations.Test;
import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplication_LogInPage;

public class OrangeHRMApplication_LogInPageTest extends BaseTest{

	@Test(priority=1,description="Validating OrangeHRM Application LogIn Page Text - Test")
	public void ValidatingLogInPanelTextTest()
	{
		OrangeHRMApplication_LogInPage orangeHRM=new OrangeHRMApplication_LogInPage();
		orangeHRM.validatingLogInPanelText();
	}
	
	@Test(priority=2,description="Validating OrangeHRM Application LogIn Test")
	public void ValidatingOrangeHRMApplicationLogInPageLogoTest()
	{
		OrangeHRMApplication_LogInPage orangeHRM=new OrangeHRMApplication_LogInPage();
		orangeHRM.validatingOrangeHRMApplicationLogInPageLogo();
	}
	
	@Test(priority=3,description="Validating OrangeHRM Application LogIn Functionality - Test")
	public void OrangeHRMApplicationLogInPage_LogInTest()
	{
		OrangeHRMApplication_LogInPage orangeHRM=new OrangeHRMApplication_LogInPage();
		orangeHRM.orangeHRMApplicationLogInPage_logIn("Admin", "Livetech@123");
	}
	
   }
