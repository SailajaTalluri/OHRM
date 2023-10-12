package com.OHRM;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplicationLogInTest_ExcelTestData {

	public static void main(String[] args) throws IOException, InterruptedException {
		//ChromeDriver driver;
		// WebDriver is an interface of Selenium

		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

		// Automating the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\OHRMAutomation\\WebApplicationTestingProject\\browserDriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);

		// Excel file - with Test Data
		FileInputStream orangeHRMApplicationLogInTestDataFile = new FileInputStream("./src/com/OrangeHRMApplicationLoginTestDataFiles/OrangeHRMApplicationLoginTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile);
		XSSFSheet logInTestDataSheet = workBook.getSheet("logInTestData");

		Row testDataRow=logInTestDataSheet.getRow(1);
		Cell testDataRowOfCell_UserName=testDataRow.getCell(0);
		String userNameTestData=testDataRowOfCell_UserName.getStringCellValue();
		//String userNameTestData="Admin"; // Test Data

		System.out.println(" The UserName is :- "+userNameTestData);

		By userNameProperty=By.id("txtUsername");//identifying the property of an element - userName
		// Identifying the Element(userName) on the Current WebPage
		WebElement userName=driver.findElement(userNameProperty);
		// Performing Operation on the UserName WebElement
		userName.sendKeys(userNameTestData);

		// name="txtPassword" - password element property
		//String passwordTestData="Livetech@123";
		Cell testDataRowOfCell_Password=testDataRow.getCell(1);
		String passwordTestData=testDataRowOfCell_Password.getStringCellValue();
		System.out.println(" The password is :- "+passwordTestData);
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);

		// class="button" -property of LogIn Button
		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();

		By welComeAdminProperty=By.id("welcome");
		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);

		String expected_OrangeHRMApplicationHomePageText="Admin";
		System.out.println(" The expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS");
		 // Row testResultRow=logInTestDataSheet.createRow(1);
		  Cell testResultRowOfCell=testDataRow.createCell(2);
		  testResultRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application HomePage - PASS");
		}
		else
		{
		System.out.println(" Failed to navigated to OrangeHRM Application HomePage - FAIL ");
		// Row testResultRow=logInTestDataSheet.createRow(1);
		  Cell testResultRowOfCell=testDataRow.createCell(2);
		  testResultRowOfCell.setCellValue("Failed to navigate to OrangeHRM Application HomePage - FAIL");
		}

		// Test Results exporting to another Excel File - along with Test Data
		  FileOutputStream orangeHRMApplicationTestResultFile=new
		         FileOutputStream("./src/com/OrangeHRMApplicationLoginTestDataFiles/OrangeHRMApplicationLoginTestData.xlsx");
		  workBook.write(orangeHRMApplicationTestResultFile);
		 
		welComeAdmin.click();

		// Synchronization
		Thread.sleep(5000); // Java Wait

		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

		By logoutProperty=By.linkText("Logout");
		WebElement logout=driver.findElement(logoutProperty);
		logout.click();
		 
		driver.quit();

		}	
	}




