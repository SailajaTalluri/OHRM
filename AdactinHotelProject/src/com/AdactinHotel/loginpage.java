package com.AdactinHotel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","./BROWSERDRIVERFILES/chromedriver.exe");
	//creating a new instance of the chromeDriver	    
	WebDriver driver=new ChromeDriver();
	String applicationurladdress="https://adactinhotelapp.com";
	driver.get(applicationurladdress);
    //<input type="text" name="username" id="username" class="login_input" value="">
	FileInputStream datafile=new FileInputStream("./src/com/DataExcelDetails/AdactinhotelDataExcelFile.xlsx");
	//identify the workbook of the file
	XSSFWorkbook workbook=new XSSFWorkbook(datafile);
	//identify a particular sheet in the workbook
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	//login page test
	XSSFRow row=sheet.getRow(1);
	XSSFCell cell=row.getCell(0);
	String usernametestdata=cell.getStringCellValue();
	By loginproperty=By.id("username");
	WebElement login=driver.findElement(loginproperty);
	login.sendKeys("sailaja123");
    System.out.println("username");
	//<input type="password" name="password" id="password" class="login_input" value="">
	XSSFRow passwordrow=sheet.getRow(1);
	XSSFCell passwordcell=row.getCell(1);
	String passwordtestdata=cell.getStringCellValue();
	By passwordproperty=By.id("password");
	WebElement password=driver.findElement(passwordproperty);
	password.sendKeys("sailaja123");
	System.out.println("password");
    //<input type="Submit" name="login" id="login" class="login_button" value="Login">
	By loginbuttonproperty=By.id("login");
	WebElement loginbutton=driver.findElement(loginbuttonproperty);
	loginbutton.click();
	
	}	
		
		
	}




























