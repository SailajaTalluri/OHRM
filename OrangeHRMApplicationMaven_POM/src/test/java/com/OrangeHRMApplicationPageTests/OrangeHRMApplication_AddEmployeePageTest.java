package com.OrangeHRMApplicationPageTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplication_AddEmployeePage;
import com.OrangeHRMApplicationPages.OrangeHRMApplication_LogInPage;
public class OrangeHRMApplication_AddEmployeePageTest extends BaseTest {
	@Test(priority=1,description="validating OrangeHRM Application LogIn Page")
	public void ValidatingOrangeHRMApllicationLoginPageTest() throws InterruptedException {
		OrangeHRMApplication_LogInPage orangehrm= new OrangeHRMApplication_LogInPage();
		orangehrm.validatingLogInPanelText();
		orangehrm.validatingOrangeHRMApplicationLogInPageLogo();
		orangehrm.orangeHRMApplicationLogInPage_logIn("Admin", "Livetech@123");
	}
	

		@Test(priority=2,description="Validating OrangeHRM Application HomePage PIM Text - Test")
		public void ValidatingOrangeHRMApplicationHomePagePIMTest()
		{
			OrangeHRMApplication_AddEmployeePage orangeHRM=new OrangeHRMApplication_AddEmployeePage();
			orangeHRM.ValidatingOrangeHRMApplicationHomePagePIM();
		}
		
	@Test(priority=3,description="Validating OrangeHRM Application HomePage PIM AddEmployee Text - Test")
	public void ValidatingOrangeHRMApplicationHomePagePIMAddEmployeeTest()
	{
		OrangeHRMApplication_AddEmployeePage orangehrm=new OrangeHRMApplication_AddEmployeePage();
		orangehrm.ValidatingOrangeHRMApplicationHomePagePIMAddEmployee();
	}
	@Test(priority=4,description="Validating AddEmployee FullNameText - Test")
	public void ValidatingAddEmployeeFullNameTextTest()
	{
		OrangeHRMApplication_AddEmployeePage orangehrm=new OrangeHRMApplication_AddEmployeePage();
		orangehrm.ValidatingAddEmployeeFullNameText();
	}
	@Test(priority=5,description="Validating AddEmployee firstname textbox")
	public void ValidatingAddEmployeePersonalDetails()
	{
		OrangeHRMApplication_AddEmployeePage orangehrm=new OrangeHRMApplication_AddEmployeePage();
		orangehrm.ValidatingAddEmployeePersonalDetails("rukmini", "malavarupu", "Anusha");
	}
	@Test(priority=6,description="ValidatingAddEmployeebuttonproperty")
	public void ValidatingAddEmployeebuttonpropertyTest()
	{
		OrangeHRMApplication_AddEmployeePage orangehrm=new OrangeHRMApplication_AddEmployeePage();
		orangehrm.ValidatingAddEmployeebuttonproperty();
	}
}


