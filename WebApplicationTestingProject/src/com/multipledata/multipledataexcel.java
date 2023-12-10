package com.multipledata;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class multipledataexcel 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
//set the path to your chromeDriver
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		//creating a new instance of the chromeDriver
		WebDriver driver=new ChromeDriver();
		String applicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationurladdress);
		//Load the Excel sheet
		FileInputStream file = new FileInputStream("./src/com/OrangeHRMApplicationValid_InvalidDataExcelDetails/OrangeHRMApplicationValid_InvalidDataExcelFile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		//for loop through rows
		for(int i=1;i<=3;i++) 
		{
		XSSFRow row=sheet.getRow(1);
		//get userName and password from excel sheet
		String username=row.getCell(0).getStringCellValue();
		String password=row.getCell(1).getStringCellValue();
		//Locate username and password feilds and enter data
		By usernameproperty=By.id("txtUsername");
		WebElement usernamefeild=driver.findElement(usernameproperty);
		usernamefeild.sendKeys(username);
		By passwordproperty=By.id("txtPassword");
		WebElement passwordfeild=driver.findElement(passwordproperty);
		passwordfeild.sendKeys(password);
		System.out.println("cleared feilds");
		FileOutputStream dataFile=new FileOutputStream("./src/com/OrangeHRMApplicationValid_InvalidDataExcelDetails/OrangeHRMApplicationValid_InvalidDataExcelFile.xlsx");
		workbook.write(dataFile);
		//usernamefeild.clear();
		//passwordfeild.clear();
		
		}	
		By Loginbutoonproperty=By.id("btnLogin");
		WebElement loginbutton=driver.findElement(Loginbutoonproperty);
		loginbutton.click();
		//driver.quit();
		}
	    }



