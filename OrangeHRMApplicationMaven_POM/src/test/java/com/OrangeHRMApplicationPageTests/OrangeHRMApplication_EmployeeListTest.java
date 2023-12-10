package com.OrangeHRMApplicationPageTests;
import org.testng.annotations.Test;
import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplication_EmployeeListPage;
import com.OrangeHRMApplicationPages.OrangeHRMApplication_LogInPage;

public class OrangeHRMApplication_EmployeeListTest extends BaseTest{
	
	@Test(priority=1,description="validating OrangeHRM Application LogIn Page")
	public void ValidatingOrangeHRMApllicationLoginPageTest() throws InterruptedException 
	{
	OrangeHRMApplication_LogInPage orangehrm= new OrangeHRMApplication_LogInPage();
	orangehrm.validatingLogInPanelText();	
	orangehrm.validatingOrangeHRMApplicationLogInPageLogo();
	orangehrm.orangeHRMApplicationLogInPage_logIn("Admin", "Livetech@123");
	}
	
	
@Test(priority=2,description="validating orange hrm application Employeelist page - Test")
public void ValidatingOrangeHrmApplicationEmployeeList_PIMModuleTest()
{
	OrangeHRMApplication_EmployeeListPage orangehrm=new OrangeHRMApplication_EmployeeListPage();
	orangehrm.OrangeHRMApplicationHomePagePIMEmployeeList();
	
}
	
@Test(priority=3,description="Validating orange hrm application employeelist webtable page - Test")
public void ValidatingOrangehrmapplicationEmployeelist_webtablepropertyTest()
{
	OrangeHRMApplication_EmployeeListPage Orangehrm=new OrangeHRMApplication_EmployeeListPage();
	Orangehrm.orangehrmapplicationEmployeelist_webtableproperty();
}
}
