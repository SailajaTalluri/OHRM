package com.OhrmExcelFilePractice;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLogin_Validations_UsingExcelFile {

	public static void main(String[] args) throws IOException {
		//ChromeDriver driver;
		// WebDriver is an interface of Selenium

				WebDriver driver;
				String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

				// Automating the Chrome Browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\OHRMAutomation\\WebApplicationTestingProject\\browserDriverFiles\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(applicationUrlAddress);
				
		// Excel file - with Test Data
		FileInputStream PracticeLoginValidationsUsingExcelFiles = new FileInputStream("./src/com/OhrmExcelFiles/Practice_LoginValidations_ExcelFiles.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(PracticeLoginValidationsUsingExcelFiles);
		XSSFSheet TestDataSheet = workBook.getSheet("Sheet1");
	
		//Login Panel Text Validation

		Row testDataSheetRow = TestDataSheet.getRow(1);

		//Identify the row of cell in a row
		Cell testDataSheetRowOfCell = testDataSheetRow.getCell(0);

		//Get the data from a Row of cell
		String Expected_LoginPanelText = testDataSheetRowOfCell.getStringCellValue();

		System.out.println("Expected Login Panel Text is "+Expected_LoginPanelText);


		By LoginPanelProperty = By.id("logInPanelHeading");

        WebElement LoginPanelText = driver.findElement(LoginPanelProperty);

        String Actual_LoginPanelText = LoginPanelText.getText();

		System.out.println("Actual login panel text is " + Actual_LoginPanelText);

		Row testDataSheetRow1 = TestDataSheet.getRow(1);

		Cell testDataSheetRowOfCell1= testDataSheetRow1.createCell(1);

		testDataSheetRowOfCell1.setCellValue(Actual_LoginPanelText);

		if(Actual_LoginPanelText.equals(Expected_LoginPanelText))
		{
			
		System.out.println("Successfully navigated to Login Panel page :- Pass");
		
		Row testDataSheetRow1Result = TestDataSheet.getRow(1);

		Cell testDataSheetRowOfCell1Result= testDataSheetRow1Result.createCell(2);

		testDataSheetRowOfCell1Result.setCellValue("Pass");

		}
		else 
		{
		
	    Row testDataSheetRow1Result = TestDataSheet.getRow(1);

		Cell testDataSheetRowOfCell1Result= testDataSheetRow1Result.createCell(2);

		testDataSheetRowOfCell1Result.setCellValue("Fail");
		
		}
		 FileOutputStream file=new FileOutputStream("./src/com/OhrmExcelFiles/Practice_LoginValidations_ExcelFiles.xlsx");
		 workBook.write(file);
		
		 
	}
}

	



