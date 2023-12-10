package com.OrangeHRMApplicationPages;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class OrangeHRMApplication_AddEmployeePage extends BaseTest {
	
 public OrangeHRMApplication_AddEmployeePage() //constructor - java
 {
	PageFactory.initElements(driver,this);
		
 }
 
 @FindBy(id="menu_pim_viewPimModule")
 WebElement PIMmodule;
 public void ValidatingOrangeHRMApplicationHomePagePIM()
 {
	 Actions action = new Actions(driver);
	 action.moveToElement(PIMmodule).build().perform();
 }
 
 @FindBy(id="menu_pim_addEmployee")
 WebElement pimAddEmployee;
 public void ValidatingOrangeHRMApplicationHomePagePIMAddEmployee()
 {
	 pimAddEmployee.click();
 }
 
 @FindBy(className ="hasTopFieldHelp")
 WebElement FullName;
 public void ValidatingAddEmployeeFullNameText()
 {
	 String Expected_AddEmployeePageFullName="Full Name";
	 System.out.println("Expected addemployee fullname text message is"+Expected_AddEmployeePageFullName);
	 String Actual_AddEmployeePageFullName=FullName.getText();
	 System.out.println("Expected addemployee full name text message is"+Actual_AddEmployeePageFullName);
 if (Actual_AddEmployeePageFullName.contains(Expected_AddEmployeePageFullName))
 {
	 System.out.println("The Actual and Expected addEmployee fullname text is matched - PASS");
 }
 else
 {
	 System.out.println("The Actual and Expected AddEmployee fullname text is matched - FAIL");
 }
 }
 
 @FindBy(id="firstName")
 WebElement firstNametextbox;
 
 @FindBy(id="middleName")
 WebElement middlenametextbox;
 
 @FindBy(id="lastName")
 WebElement lastnametextbox;
 
 public void ValidatingAddEmployeePersonalDetails(String firstNametestdata, String middlenametestdata, String lastnametestbox)
 {
	 	firstNametextbox.sendKeys(firstNametestdata);
		middlenametextbox.sendKeys(middlenametestdata);
	 	lastnametextbox.sendKeys(lastnametestbox);
 }
 /*
 @FindBy(id="employeeId")
 WebElement employeeidbox;
 public void ValidatingAddEmployeeEmployeeIdBox()
 {
	 employeeidbox.getAttribute("value");
 }
 */
 
@FindBy(id="btnSave")
WebElement buttonsave;
public void ValidatingAddEmployeebuttonproperty()
{
	buttonsave.click();
}

}
