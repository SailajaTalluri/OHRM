package com.OrangeHRMApplicationPageTests;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplication_HomePage;


public class OrangeHRMApplication_HomePageTest extends BaseTest {

	@Test(priority=1,description="Validating OrangeHRM Application HomePage - Test")
	public void validatingOrangeHRMApplicationHomePageTextTest()
	{
		OrangeHRMApplication_HomePage orangeHRM=new OrangeHRMApplication_HomePage();
		orangeHRM.ValidatingOrangeHRMApplicationHomePageText();
		
	}


	



	
}




