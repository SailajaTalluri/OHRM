package com.OrangeHRMApplicationTestCases_Log4j;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.BaseTest_Log4j.BaseTest_Log4j;
import com.Utility.Log;

public class OrangeHRMApplication_AddEmployeeTest_Log4j extends BaseTest_Log4j {

	FileInputStream orangeHRMApplicationLogInTestDataFile;
	XSSFWorkbook workBook;
	XSSFSheet logInTestDataSheet;
	Row testDataRow;
	FileInputStream orangeHRMApplicationPropertiesFile;
	Properties properties;
	WebElement welComeAdmin;

	@Test(priority=1,description="Validating LogIn Functionality of OrangeHRM Application")
	public void orangeHRMApplication_LogInTest() throws IOException
	{
		//Excel file-with TestData
		orangeHRMApplicationLogInTestDataFile=new FileInputStream("./src/main/java/com/OrangeHRMApplicationTestResultFiles/OrangeHRMApplicationLoginTestResultFile.xlsx");
		workBook=new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile);
		logInTestDataSheet=workBook.getSheet("Sheet1");
	
	
	//Identify the File in the System-properties file
	orangeHRMApplicationPropertiesFile=new FileInputStream("./src/main/java/com/config/OrangeHRMApplication.properties");
	//creating an object for properties class
	properties=new Properties();
	properties.load(orangeHRMApplicationPropertiesFile);
	
	//Loading the Properties File
	
	testDataRow=logInTestDataSheet.getRow(1);
	Cell testDataRowOfCell_UserName=testDataRow.getCell(0);
	String userNameTestData=testDataRowOfCell_UserName.getStringCellValue();
	//String userNameTestData="Admin"; //Test Data

		//System.out.println(" The UserName is :- "+userNameTestData);
        Log.info("The UserName is :- "+userNameTestData);
		//<input name="txtUsername" id="txtUsername" type="text">
	    By userNameProperty=By.id(properties.getProperty("orangeHRMApplicationLogInPage_UserNameProperty"));//identifying the property of an element - userName
	    //identifying the Element(userName) on the Current webpage
	    WebElement userName=driver.findElement(userNameProperty);
	    //Performing Operation on the UserName WebElement
	    userName.sendKeys(userNameTestData);
	    
	    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	    //String passwordTestData="Livetch@123";
	    Cell testDataRowOfCell_Password=testDataRow.getCell(1);
	    String passwordTestData=testDataRowOfCell_Password.getStringCellValue();
	    //System.out.println(" The password is :- "+passwordTestData);
		Log.info(" The password is :- "+passwordTestData);
	    
	    By passwordProperty=By.name(properties.getProperty("orangeHRMApplicationLogInPage_PasswordProperty"));
	    WebElement password=driver.findElement(passwordProperty);
	    password.sendKeys(passwordTestData);
	    
	    //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	    By logInButtonProperty=By.className(properties.getProperty("orangeHRMApplicationLogInPage_LogInButtonProperty"));
	    WebElement logInButton=driver.findElement(logInButtonProperty);
	    logInButton.click();
	    
	    }    
       
	@Test(priority=2,description="Validating OrangeHRM Application Home Page")
	public void validatingHomePage() throws IOException
	{
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		By welComeAdminProperty=By.id(properties.getProperty("orangeHRMApplicationHomePage_WelcomeAdminProperty"));
		welComeAdmin=driver.findElement(welComeAdminProperty);
		
		String expected_OrangeHRMApplicationHomePageText="Admin";
		//System.out.println("The expected Text of OrangeHRM Application Home Page is :-"+expected_OrangeHRMApplicationHomePageText);
		Log.info("The expected Text of OrangeHRM Application Home Page is :- "+expected_OrangeHRMApplicationHomePageText);
		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		//System.out.println("The Actual Text of OrangeHRM Application Home Page is :-"+actual_OrangeHRMApplicationHomePageText);
		Log.info("The Actual Text of OrangeHRM Application Home Page is :-"+actual_OrangeHRMApplicationHomePageText);
		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
			//System.out.println("Successfully Navigated to OrangeHRM Application HomePage is - PASS");
		     Log.info("Successfully Navigated to OrangeHRM Application HomePage is - PASS");
		    //Row testResultRow=logInTestDataSheet.createRow(1);
			Cell testResultRowOfCell=testDataRow.createCell(2);
			testResultRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application Home Page - PASS");
		}
		else
		{
			//System.out.println("Failed to Navigat to OrangeHRM Application HomePage - FAIL");
		    Log.info("Failed to Navigat to OrangeHRM Application HomePage - FAIL");
			//Row testResultRow=logInTestDataSheet.createRow(1);
			Cell testResultRowOfCell=testDataRow.createCell(2);
			testResultRowOfCell.setCellValue("Failed to navigate to OrangeHRM Application HomePage is :- FAIL");
		}
		 
		//Test Results exporting to another file - along with test data
		FileOutputStream orangeHRMApplicationTestResultFile=new FileOutputStream ("./src/main/java/com/OrangeHRMApplicationTestResultFiles/OrangeHRMApplicationLoginTestResultFile.xlsx");
		workBook.write(orangeHRMApplicationTestResultFile);
		}
	
	    @Test(priority=3,description=" Validating OrangeHRM Application HomePage PIM ")
	    public void pimTest()
	    {
	    //id="menu_pim_viewPimModule"
	    By pimProperty=By.id("menu_pim_viewPimModule");
	    WebElement pim=driver.findElement(pimProperty);

	    Actions action = new Actions(driver);
	    action.moveToElement(pim).build().perform();
	    }
	    
	    @Test(priority=4,description="Validating OrangeHRM Application HomePage PIM AddEmployee ")
	    public void addEmployeeTest()
	    {
	    By pimAddEmployeeProperty=By.id("menu_pim_addEmployee");
	    WebElement pimAddEmployee=driver.findElement(pimAddEmployeeProperty);
	    pimAddEmployee.click();
	     Log.info("Successfully Navigated to AddEmployee List");
	    }

	    @Test(priority=5,description=" Validating OrangeHRM Application HomePage Add New Employee ")
	    public void addNewEmployeeTest() throws InterruptedException, IOException
	    {
	    By firstNameProperty=By.id("firstName");
	    WebElement firstName=driver.findElement(firstNameProperty);
	    firstName.sendKeys("Srini001");

	    Actions keyBoardActions = new Actions(driver);
	    keyBoardActions.sendKeys(Keys.TAB).build().perform();

	    keyBoardActions.sendKeys("Hello001").build().perform();

	    keyBoardActions.sendKeys(Keys.TAB).build().perform();
	    keyBoardActions.sendKeys("Chello001").build().perform();

	    keyBoardActions.sendKeys(Keys.TAB).build().perform();

	    keyBoardActions.sendKeys(Keys.TAB).build().perform();
	    keyBoardActions.sendKeys(Keys.ENTER).build().perform();

	    Thread.sleep(10000);
	    
	    java.lang.Runtime.getRuntime().exec("C:\\Users\\dell\\Desktop\\OHRMAutomation\\OrangeHRMApplicationMaven_DDT\\src\\main\\java\\com\\AutoItTestScripts\\EmployeePhotograph1.exe");
	    
	    Thread.sleep(10000);
	    
	    //<input type="button" class="" id="btnSave" value="Save">
	    By saveButtonProperty=By.id("btnSave");
	    WebElement saveButton=driver.findElement(saveButtonProperty);
	    saveButton.click();
	    
	    //Validating Image
	    //id="empPic"
	    
	    By employeeImageLocationProperty=By.id("empPic");
	    WebElement employeeImageLocation=driver.findElement(employeeImageLocationProperty);
	    
	    boolean flag=employeeImageLocation.isDisplayed();
	    if(flag)
	    {
	    	//System.out.println("Employee Photograph Successfully Uploaded to the Application - PASS");
	        Log.info("Employee Photograph Successfully Uploaded to the Application - PASS");
	    }
	    else
	    {
	    	//System.out.println("Employee Photograph is not Identified - FAIL");
	    	Log.info("Employee Photograph is not Identified - FAIL");
	    }
	    }
	    
	    @Test(priority=6,description="Validating WelCome Admin of OrangeHRM Application")
	    public void welComeAdminTest()
	    {
	    	By welComeAdminProperty=By.id(properties.getProperty("orangeHRMApplicationHomePage_WelcomeAdminProperty"));
	        welComeAdmin=driver.findElement(welComeAdminProperty);
	        welComeAdmin.click();
	        Log.info("Successfully Clicked on WelCome Admin");   
	    }

@Test(priority=7,description=" Validating LogOut of OrangeHRM Application")
public void logOutTest()
{
	
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
//xpath=a[text]="Logout"
By logOutProperty=By.linkText(properties.getProperty("orangeHRMApplicationHomePage_LogOutProperty"));
WebElement logOut=driver.findElement(logOutProperty);
logOut.click();
Log.info("Successfully LogOut from OrangeHRM Application");
}
}


