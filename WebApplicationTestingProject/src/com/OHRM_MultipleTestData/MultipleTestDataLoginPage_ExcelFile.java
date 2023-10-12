package com.OHRM_MultipleTestData;

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

public class MultipleTestDataLoginPage_ExcelFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\OHRMAutomation\\WebApplicationTestingProject\\browserDriverFiles\\chromedriver.exe");
		//ChromeDriver driver;
				// WebDriver is an interface of Selenium

				WebDriver driver;
				driver=new ChromeDriver();
				//Navigating to the application URL address
				String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

				// Excel file - with Test Data
				FileInputStream orangeHRMApplicationLogInTestDataFile = new FileInputStream("./src/com/OrangeHRMApplicationValid_InvalidDataExcelDetails/OrangeHRMApplicationValid_InvalidDataExcelFile.xlsx");
				XSSFWorkbook LoginTestDataworkBook = new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile);
				XSSFSheet LoginTestDataworkBookSheet = LoginTestDataworkBook.getSheet("Sheet1");
      
						//Identifying the number of Active Rows
						int Sheet_rowCount = LoginTestDataworkBookSheet.getLastRowNum();
						System.out.println("Sheet_rowCount");
						//Printing  Valid and Invalid Properties
						for (int rowIndex=0;rowIndex<=Sheet_rowCount;rowIndex++)
						{
			
							Row testDataSheet_LoginPage=LoginTestDataworkBookSheet.getRow(rowIndex);
							int testDataSheet_RowOfCell=testDataSheet_LoginPage.getLastCellNum();
							 {
								Row LoginTestDataRow=LoginTestDataworkBookSheet.getRow(rowIndex);
								Cell UserNameLoginTestData=LoginTestDataRow.getCell(0);
								String UserNameTestData=UserNameLoginTestData.getStringCellValue();
								System.out.println("The UserNametest data is"+UserNameTestData);
								
								//<input name="txtUsername" id="txtUsername" type="text">
								//<span class="form-hint" style="display: none;">Username</span>
								//String UserNameTestData="Admin";
								
								By UserNameTestDataProperty=By.id("txtUsername");
								WebElement UserNameTest=driver.findElement(UserNameTestDataProperty);
								UserNameTest.sendKeys(UserNameTestData);
								
								//From Excel Password Data
								Cell PasswordTestDataRowOfCell=LoginTestDataRow.getCell(1);
								String PasswordTestDatainRowOfCell=PasswordTestDataRowOfCell.getStringCellValue();
								System.out.println("The data for Password is "+PasswordTestDatainRowOfCell);
								
								//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
								//String PasswordTestData="Livetech@123";
								
								By PasswordProperty=By.id("txtPassword");
								WebElement PasswordTestData=driver.findElement(PasswordProperty);
								PasswordTestData.sendKeys(PasswordTestDatainRowOfCell);
								
								//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
								By LoginButtonProperty=By.className("button");
								WebElement LoginButton=driver.findElement(LoginButtonProperty);
								LoginButton.click();
								
								//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
								By HomePageWelcomeAdminProperty=By.id("welcome");
								WebElement HomePageWelcomeAdmin=driver.findElement(HomePageWelcomeAdminProperty);
								
								Cell expected_HomePageTextCell=LoginTestDataRow.getCell(2);
								String expected_HomePageAdminText=expected_HomePageTextCell.getStringCellValue();
								String expected_OrangeHRMApplicationHomePageText=expected_HomePageAdminText;
								
							   System.out.println("The Expected Text of OrangeHRM Application HomePage is"+expected_OrangeHRMApplicationHomePageText);
							  
							   String Actual_OrangeHRMApplicationHomePageText=HomePageWelcomeAdmin.getText();
							   System.out.println("The Actual Text of OrangeHRM Application HomePage is "+Actual_OrangeHRMApplicationHomePageText);
							   
							   if(Actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
							   {
								   
								   System.out.println("Sucessfully Navigated to HomePage - PASS");
								   Cell LoginHomePageResultTest=LoginTestDataRow.createCell(4);
								   LoginHomePageResultTest.setCellValue("Sucessfully Navigated to HomePage - PASS");
								   
							   }
							   else
							   {
								   System.out.println("Failed to Navigate to HomePage - FAIL");
								  // Row testResultRow=LoginTestDataworkBookSheet.createRow(1);
								   Cell LoginHomePageResultTest=LoginTestDataRow.createCell(4);
								   LoginHomePageResultTest.setCellValue("Failed to Navigated to OrangeHRM Application HomePage - FAIL");
								   
								   
							   }
								
							   FileOutputStream TestDataResultOfOHRM=new FileOutputStream("./src/com/OrangeHRMApplicationValid_InvalidDataExcelDetails/OrangeHRMApplicationValid_InvalidDataExcelFile.xlsx");
							   LoginTestDataworkBook.write(TestDataResultOfOHRM);
							   
							   //write Actual value also in excel sheet
							   Cell ActualTestDataofAdmin=LoginTestDataRow.createCell(3);
							   ActualTestDataofAdmin.setCellValue(Actual_OrangeHRMApplicationHomePageText);
							   
							   FileOutputStream ActualTestDataofHomePage=new FileOutputStream("./src/com/OrangeHRMApplicationValid_InvalidDataExcelDetails/OrangeHRMApplicationValid_InvalidDataExcelFile.xlsx");
							   LoginTestDataworkBook.write(ActualTestDataofHomePage);
							   HomePageWelcomeAdmin.click();
							   //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
							   By HomePageLogoutproperty=By.linkText("Logout");
							   Thread.sleep(5000);
							   
							   WebElement HomePageLogout=driver.findElement(HomePageLogoutproperty);
							   HomePageLogout.click();
								
							
							}
						}
	}
}
	                    
	                    
	

						
							
						
					
	

			