package com.OhrmTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class WebTableOhrm_DynamicDataHandling extends BaseTest {

	public void dynamicWebTable() throws InterruptedException
	{
		String userNameTestData="Admin";
    	By userNameProperty=By.id("txtUsername");	
    	WebElement userName=driver.findElement(userNameProperty);
    	userName.sendKeys(userNameTestData);
    	
    	String passwordTestData="Livetech@123";
    	By passwordProperty=By.name("txtPassword");
    	WebElement password=driver.findElement(passwordProperty);
    	password.sendKeys(passwordTestData);
    	
    	By loginButtonProperty=By.className("button");
    	WebElement loginButton=driver.findElement(loginButtonProperty);
    	loginButton.click();
		Thread.sleep(5000);
	    By EmployeeListProperty=By.id("menu_pim_viewPimModule");
	    WebElement EmployeeList=driver.findElement(EmployeeListProperty);
	    EmployeeList.click();
	// identifying the WebTable
	///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[3]/td[2]
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[4]
	    // /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[2]/td[5]
		//left
	By webTableProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]");
	WebElement webTable=driver.findElement(webTableProperty);
	// Identifying the Rows in the WebTable
	// Row Property
	By CheckrowProperty=By.tagName("tr");
	List<WebElement>Checkrows=webTable.findElements(CheckrowProperty);

	// To goto the WebTable - to all the Rows
	for(int rowIndex=0;rowIndex<Checkrows.size();rowIndex++)
	{

	// goto a Row in the WebTable
	WebElement row=Checkrows.get(rowIndex);

	// going to a Row and finding the Number of Row of Cells
	// Cell Property
	By rowOfCellProperty=By.tagName("td");
	List<WebElement>rowOfcells=row.findElements(rowOfCellProperty);

	// to goto a Row -  and to all its respective Cell's
	for(int rowOfCellIndex=0;rowOfCellIndex<rowOfcells.size();rowOfCellIndex++)
	{
	WebElement rowOfCell=rowOfcells.get(rowOfCellIndex);
	String webTableData=rowOfCell.getText();
	System.out.print(webTableData+" | ");
	}
	System.out.println();
	}
	}
	public static void main(String[] args) throws InterruptedException {
		WebTableOhrm_DynamicDataHandling webTableData=new WebTableOhrm_DynamicDataHandling();
		webTableData.applicationLaunch();
		webTableData.dynamicWebTable();
		webTableData.applicationClose();
	}
	}

	

