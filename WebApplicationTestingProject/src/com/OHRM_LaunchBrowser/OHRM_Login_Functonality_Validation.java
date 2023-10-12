package com.OHRM_LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_Login_Functonality_Validation {

public static void main(String[] args) throws Exception {
		
//1) Automating the ChromeBrowser
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\OHRMAutomation\\WebApplicationTestingProject\\browserDriverFiles\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();

//2)Navigating to OHRM UrlAddress
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(applicationUrlAddress);

//3)validating Login WebPage Title
//a)Validating the Title
String Expected_TileOfOHRM = "OrangeHRM";
String TitleOfTheOHRMLoginPage=driver.getTitle();
if(TitleOfTheOHRMLoginPage.equals(Expected_TileOfOHRM)) 
{
	System.out.println("The Expected Title and the Actual Title of the orangeHRM App is Similar");
}
else
{
	System.out.println("The Expected Title and the Actual title of the orangeHRM App is Not Similar");
	
}
System.out.println();

//b)Validating the URL of the OrangeHRM Application
String Expected_LoginURL="orangehrm-4.2.0.1";
String Actual_URL=driver.getCurrentUrl();
System.out.println("Actual URL of the orangeHRM login Page" +Actual_URL);
if(Actual_URL.contains(Expected_LoginURL)) {
	System.out.println("The Actual URL of the orangeHRM have the expected URL is Similar :- PASS");
	}else {
		System.out.println("The Actual URL of the orangeHRM does not having the expected URL is NOT Similar :- FAIL");
		
	}
System.out.println();

//c) The Text Should be_LoginPanel
//<div id="logInPanelHeading">LOGIN Panel</div>
String TextOfLoginPanel="LOGIN Panel";
By LoginPanelProperty=By.id("logInPanelHeading");
//using id Locator
WebElement ActualTextLoginPanel=driver.findElement(LoginPanelProperty);
String Text=ActualTextLoginPanel.getText();
System.out.println(Text);
if(Text.equals(TextOfLoginPanel)) {
	System.out.println("The Text of the Actual login panel and Expected login panel in the homepage of OHRM is Similar :- PASS");
}else {
	System.out.println("The Text of the Actual and Expected login panel in the homepage of OHRM is Not Similar :- FAIL");
}
System.out.println();


//4)Login the Application with Valid Details
//<input name="txtUsername" id="txtUsername" type="text">
By UserNameProperty=By.name("txtUsername");
//using name Locator
WebElement UserName=driver.findElement(UserNameProperty);
UserName.sendKeys("Admin");
//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
By PasswordProperty=By.name("txtPassword");
//Using name Locator
WebElement Password=driver.findElement(PasswordProperty);
Password.sendKeys("Livetech@123");
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By LoginButtonProperty=By.className("button");
// Using ClassName Locator
WebElement LoginButton=driver.findElement(LoginButtonProperty);
LoginButton.click();
System.out.println();


//5) Validating HomePage
//a)The Title of HomePage Should be_OrangeHRM
String Expected_TitleOfOHRMHomePage="OrangeHRM";
String Actual_TitleOfOHRMHomePage=driver.getTitle();
if(Actual_TitleOfOHRMHomePage.equals(Expected_TitleOfOHRMHomePage)) {
	System.out.println("The Actual and Expected Title of the OrangeHRM HomePage App is Similar :- PASS");
}else {
	System.out.println("The Actual and Expected Title of the OrangeHRM HomePage App is Not Similar :- FAIL");
}
System.out.println();


//b)Validate Admin Text
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
//Using Link Text Locator
String Expected_AdminText="Admin";
By AdminLinkTextProperty=By.linkText("Admin");
WebElement ActualAdminLinkTextProperty=driver.findElement(AdminLinkTextProperty);
String Actual_AdminText=ActualAdminLinkTextProperty.getText();
System.out.println("Actual_AdminText" +ActualAdminLinkTextProperty);
if(Actual_AdminText.equals(Expected_AdminText)) {
	System.out.println("The Actual and Expected of the OrangeHRM Admin Text is Similar :- PASS");
	
}else {
	System.out.println("The Actual and Expected of the OrangeHRM Admin Text is Not Similar :- FAIL");
	
}

System.out.println();


//6)Automate Welcome Admin
//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
By WelcomeAdmin=By.id("welcome");
WebElement WelcomeAdminProperty=driver.findElement(WelcomeAdmin);
WelcomeAdminProperty.click();

//7)Automate Logout
Thread.sleep(5000);
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
 By LogoutButtonProperty = By.linkText("Logout");
 WebElement LogoutButton = driver.findElement(LogoutButtonProperty);
 LogoutButton.click();
 System.out.println();
 
//8)Validating the Login Page after Logout
//a)validate the Title
String Expected_TitleAfterLogout="OrangeHRM";
String TitleOfLoginPageAfterLogout=driver.getTitle();
System.out.println(TitleOfLoginPageAfterLogout);
if(TitleOfLoginPageAfterLogout.equals(Expected_TitleAfterLogout)) {
	System.out.println("After Logout the Expected Title and the Actual title of the orangeHRM App After Logout is Similar :- PASS");
}else {
	System.out.println("After Logout the Expected Title and the Actual tilte of the orangeHRM App After Logout is Not Similar :- FAIL");
	
}
System.out.println();


//b)Validating text-LOGIN Panel after logout
//<div id="logInPanelHeading">LOGIN Panel</div>
String ExpectedTextAfterLogout="LOGINPanel";
By LoginPanelText=By.id("logInPanelHeading");
WebElement ActualLoginPanelTextProperty=driver.findElement(LoginPanelText);
System.out.println(ActualLoginPanelTextProperty);
String ActualLoginPanelText=ActualLoginPanelTextProperty.getText();
if(ActualLoginPanelText.equals(ExpectedTextAfterLogout)) {
	System.out.println("After Logout the Expected Text and the Actual text in the OrangeHRM App after logout is Similar :- PASS");
}else {
	System.out.println("After Logout the Expected Text and the Actual text in the OrangeHRM App after logout is Not Similar :- FAIL");
}

driver.close();
}
}






