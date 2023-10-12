package com.OrangeHRMApplicationPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.BaseTest.BaseTest;

public class OrangeHRMApplication_HomePage extends BaseTest {
		
	//This Class is referred to as an "Object Repository class"
	public OrangeHRMApplication_HomePage() // Constuctor - of Java
	//Whenever a class name is similar to Method Name then it is called as Constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	//id="welcome"
  // WebElement welComeAdminProperty=driver.findElement(By.id("welComeAdminProperty"));
	
	//Identification of the WebElements
	@FindBy(id="welcome")
	WebElement welComeAdmin;
	
	//Business Logics - Performing Operation on the WebElement
	public void ValidatingOrangeHRMApplicationHomePageText()
	{
		String expected_OrangeHRMApplicationHomePageText="Admin";
		System.out.println("The expected Text of OrangeHRM Application Home Page is :-"+expected_OrangeHRMApplicationHomePageText);
		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		System.out.println("The Actual Text of OrangeHRM Application Home Page is :-"+actual_OrangeHRMApplicationHomePageText);
		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
			System.out.println("Successfully Navigated to OrangeHRM Application HomePage is - PASS");
		
	    }
		else
		{
			System.out.println("Failed to Navigat to OrangeHRM Application HomePage - FAIL");

		}
	
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	    //linkText="Logout"
		welComeAdmin.click();
		System.out.println("Successfully Clicked on welCome Admin");
		
		
		
	}
	}	
        
