package com.OrangeHRMApplicationPageTests;
import org.testng.annotations.Test;
import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplication_HomePage;
import com.OrangeHRMApplicationPages.OrangeHRMApplication_LogInPage;

public class OrangeHRMApplication_HomePageTest extends BaseTest 
{
	@Test(priority=1,description="OrangeHrmApplicationLoginPageTest - Test")
	public void ValidatingOrangeHRMApllicationLoginPageTest() throws InterruptedException {
	
		OrangeHRMApplication_LogInPage orangehrm= new OrangeHRMApplication_LogInPage();
		orangehrm.validatingLogInPanelText();
		orangehrm.validatingOrangeHRMApplicationLogInPageLogo();
		orangehrm.orangeHRMApplicationLogInPage_logIn("Admin", "Livetech@123");
		
	}

@Test(priority=2,description="Validating OrangeHRM Application Homepage Text - Test")
public void ValidatingorangeHRMApplicationHomepageTextTest() 
{
	OrangeHRMApplication_HomePage orangeHRM= new OrangeHRMApplication_HomePage();
	orangeHRM.ValidatingOrangeHRMApplicationHomePageText();	
}
@Test(priority=3,description="Validating orangehrm application homepage text - Test")
public void validatingorangehrmapplicationhomepagelogoutTest() throws InterruptedException 
{
	OrangeHRMApplication_HomePage orangehrm=new OrangeHRMApplication_HomePage();
	orangehrm.orangeHRMApplication_Logout();
}
}

	



	






