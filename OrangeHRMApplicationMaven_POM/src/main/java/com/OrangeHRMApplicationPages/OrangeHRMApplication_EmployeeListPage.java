package com.OrangeHRMApplicationPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class OrangeHRMApplication_EmployeeListPage extends BaseTest {
public OrangeHRMApplication_EmployeeListPage()
	{
		PageFactory.initElements(driver,this);
	}

@FindBy(id="menu_pim_viewPimModule")
WebElement PIMmodule;
public void OrangeHRMApplicationHomePagePIMEmployeeList()
{ 
	PIMmodule.click();
}

@FindBy(id="menu_pim_viewEmployeeList")
WebElement Employeelist;
public void OrangeHrmEmployeelistPage()
{
	Employeelist.click();
}

@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/form/div[4]")
WebElement webTable;

////*[@id="resultTable"]
public void orangehrmapplicationEmployeelist_webtableproperty()
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
    }
