package com.OHRMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRMS_Validation_AddEmployee {
public static void main(String[] args) throws Exception {	
	WebDriver driver;
    String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
 System.out.println("Actual Current url address is" +applicationUrlAddress);
//Automating the browser
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\OHRMAutomation\\WebApplicationTestingProject\\browserDriverFiles\\chromedriver.exe" );
driver = new ChromeDriver();
//Navigating to the application url address
driver.get(applicationUrlAddress);
//Validating the login web page
String actual_CurrentUrlAddress=driver.getCurrentUrl();
System.out.println("actual Current url address is  " +actual_CurrentUrlAddress);
if(actual_CurrentUrlAddress.equals(applicationUrlAddress))
{
System.out.println("Actual and expected url addresses are same:-Pass");
}
else
	System.out.println("Actual and expected url addresses are not same:-Fail`");

System.out.println();

//Login to the application
String ExpectedloginPanelText = "LOGIN Panel";
//<div id="logInPanelHeading">LOGIN Panel</div>
By LoginPanelProperty = By.id("logInPanelHeading");
WebElement ActualLoginPanelText = driver.findElement(LoginPanelProperty);
String LoginPanelText = ActualLoginPanelText.getText();
System.out.println("Actual login panel text is " + LoginPanelText);
if(ActualLoginPanelText.equals(ExpectedloginPanelText))
{
	System.out.println("Login panel message is correct:- Pass");
}
else
	System.out.println("Login panel message is not correct :- Fail");

System.out.println();

String UserNameTestData = "Admin";
By UserNameProperty = By.id("txtUsername");
WebElement userName = driver.findElement(UserNameProperty);
userName.sendKeys(UserNameTestData);
String PasswordTestData = "Livetech@123";
By PasswordProperty = By.id("txtPassword");
WebElement password = driver.findElement(PasswordProperty);
password.sendKeys(PasswordTestData);
By LoginButtonProperty = By.id("btnLogin");
WebElement LoginButton = driver.findElement(LoginButtonProperty);
LoginButton.click();

System.out.println();

//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
String ExpectedWelcomeAdmin = "Welcome Admin";
System.out.println("Expected welcome message is " +ExpectedWelcomeAdmin);
By WelcomeAdminProperty = By.id("welcome");
WebElement WelcomeAdminText = driver.findElement(WelcomeAdminProperty);
String ActualWelcomeAdmin = WelcomeAdminText.getText();
System.out.println("Actual Welcome Admin message is " +ActualWelcomeAdmin);
if(ActualWelcomeAdmin.equals(ExpectedWelcomeAdmin))
{
	 System.out.println("Welcome admin message displayed: - Pass");
}
else
	 System.out.println("Welcome admin message not displayed: - Fail");
System.out.println();
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
By PIMProperty = By.id("menu_pim_viewPimModule");
WebElement PIMmodule = driver.findElement(PIMProperty);
Actions PIMactions = new Actions(driver);
PIMactions.moveToElement(PIMmodule).build().perform();
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
By AddEmployeeProperty = By.id("menu_pim_addEmployee");
WebElement AddEmployee = driver.findElement(AddEmployeeProperty);
AddEmployee.click();

System.out.println();

//<label class="hasTopFieldHelp">Full Name</label>
String Expected_FullNameText = "Full Name";
System.out.println("Expected text is Full Name");
By FullNameProperty = By.className("hasTopFieldHelp");
WebElement FullName = driver.findElement(FullNameProperty);
String ActualFullName = FullName.getText();
System.out.println("Actual text is "+ActualFullName);
if(ActualFullName.equals(Expected_FullNameText))
		 {

	 System.out.println("Page succefully navigated to Add Employee details Page :- Pass");
		 }
else 
{
	 System.out.println("Failed to navigate to Add Employee Details page :- Fail");
}
System.out.println();

//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
 String FullNameValue = "Admin";
 By FullNameTextboxProperty = By.id("firstName");
 WebElement FullNameTextBox = driver.findElement(FullNameTextboxProperty);
 FullNameTextBox.sendKeys(FullNameValue);
 //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
 String MiddleNameValue = "Live";
 By MiddleNameTextboxProperty = By.id("middleName");
 WebElement MiddleNameTextBox = driver.findElement(MiddleNameTextboxProperty);
 MiddleNameTextBox.sendKeys(MiddleNameValue);
 //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
 String LastNameValue = "Tech";
 By LastNameTextboxProperty = By.id("lastName");
 WebElement LastNameTextBox = driver.findElement(LastNameTextboxProperty);
 LastNameTextBox.sendKeys(LastNameValue);
 //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0002" id="employeeId">
 By ExpectedEmployeeIdProperty = By.id("employeeId");
 WebElement ExpectedEmployeeId = driver.findElement(ExpectedEmployeeIdProperty);
 String ExpectedEmployeeIdValue = ExpectedEmployeeId.getAttribute("value");
 System.out.println("Expected employee Id is "+ExpectedEmployeeIdValue);
 
 System.out.println();
 
 //<input type="button" class="" id="btnSave" value="Save">
 By SaveButtonProperty = By.id("btnSave");
 WebElement SaveButton = driver.findElement(SaveButtonProperty);
 SaveButton.click();
 
 System.out.println();
 
 //<h1>Personal Details</h1>
 String ExpectedPage = "Personal Details";
 By PersonalDetailesPageProperty = By.id("pdMainContainer");
 WebElement PersonalDetailsPage = driver.findElement(PersonalDetailesPageProperty);
 String ActualPersonalDetailsPage = PersonalDetailsPage.getText();		
 System.out.println("Actual Page title is  "+ActualPersonalDetailsPage);
 if(ActualPersonalDetailsPage.equals(ExpectedPage))
 {
	  System.out.println("Page succefully navigated Personal Details Page :- Pass");
 }
 else
 {
	  System.out.println("Failed to navigate to the Personal Details Page :- Fail");	  
 }
 
 System.out.println();
 //<div class="fieldDescription"><em>*</em> First Name</div>
   By ActualFullnameProperty = By.id("personal_txtEmpFirstName");
   WebElement ActualFullNamePersonalDetailsPage = driver.findElement(ActualFullnameProperty);
   String ActualFullNameValue = ActualFullNamePersonalDetailsPage.getAttribute("value");
   System.out.println("Actual Full Name is "+ActualFullNameValue);
   if(ActualFullNameValue.equals(FullNameValue))
   {
   	System.out.println("Actual and Expected names matched");
   }
   else
   {
   	System.out.println("Actual and Expected names not matched");
   }
   System.out.println();
   
   //personal_txtEmpMiddleName
   By ActualMiddlenameProperty = By.id("personal_txtEmpMiddleName");
   WebElement ActualMiddleNamePersonalDetailsPage = driver.findElement(ActualMiddlenameProperty);
   String ActualMiddleNameValue = ActualMiddleNamePersonalDetailsPage.getAttribute("value");
   System.out.println("Actual Middle Name is "+ActualMiddleNameValue);
   if(ActualMiddleNameValue.equals(MiddleNameValue))
   {
   	System.out.println("Actual and Expected Middle names matched");
   }
   else
   {
   	System.out.println("Actual and Expected Middle names not matched");
   }
   
   System.out.println();

   By LastnameProperty = By.id("personal_txtEmpLastName");
   WebElement ActualLastNamePersonalDetailsPage = driver.findElement(LastnameProperty);
   String ActualLastNameValue = ActualLastNamePersonalDetailsPage.getAttribute("value");
   System.out.println("Actual Middle Name is "+ActualLastNameValue);  
   if(ActualLastNameValue.equals(LastNameValue))
   {
   	System.out.println("Actual and Expected Last names matched");
   }
   else
   {
   	System.out.println("Actual and Expected Last names not matched");
   }
   
   System.out.println();

   By WelcomeAdminPropertyAfter = By.id("welcome");
	 WebElement WelcomeAdminTextAfter = driver.findElement(WelcomeAdminPropertyAfter);
	// String ActualWelcomeAdminAfter = WelcomeAdminTextAfter.getText();
	WelcomeAdminTextAfter.click();
   Thread.sleep(5000);
	 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	  By logoutButtonPtoperty = By.linkText("Logout");
	  WebElement LogoutButton = driver.findElement(logoutButtonPtoperty);
	  LogoutButton.click();
	  By LoginPanelafterLogoutProperty = By.id("logInPanelHeading");
	    WebElement ActualLoginPanelAfterLogout = driver.findElement(LoginPanelafterLogoutProperty);
		String LoginPanelAfterLogoutText = ActualLoginPanelAfterLogout.getText();
		System.out.println("Actual login panel text is " + LoginPanelAfterLogoutText);
		if(LoginPanelAfterLogoutText.equals(ExpectedloginPanelText))
		{
			System.out.println("Successfully navigated back to Login Panel Page:- Pass");
		}

		else

			System.out.println("Failed to Navigate back to Login Panel Page:- Fail");
	 driver.quit();
	}

}







