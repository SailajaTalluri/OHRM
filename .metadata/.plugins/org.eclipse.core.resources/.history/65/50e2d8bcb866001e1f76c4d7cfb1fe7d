package com.OHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest_Updated {

public static void main(String[] args)   throws InterruptedException{
	
	
//ChromeDriver driver;
// WebDriver is an interface of Selenium


String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

// Automating the Chrome Browser
System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\OHRMAutomation\\WebApplicationTestingProject\\browserDriverFiles\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get(applicationUrlAddress);

/*
<input name="txtUserName" type="text" class="loginText" tabindex="1">
 
  < - tag
  <input - input is the tag name

  name       - attribute / locator
 txtUsername - value / selector

 id          - attribute / locator
 txtUsername - value / selector
 
 type  - attribute
 text  - value

 The inspected elements properties contains attributes and their corresponding values

*/

// driver.findElement(By.id("txtUsername")).sendKeys("admin");

String userNameTestData="Admin";
// Test Data
By userNameProperty=By.id("txtUsername");
//identifying the property of an element - userName

// Identifying the Element(userName) on the Current WebPage
WebElement userName=driver.findElement(userNameProperty);

// Performing Operation on the UserName WebElement
userName.sendKeys(userNameTestData);

//<input name="txtPassword" type="password" class="loginText" tabindex="2">
// name="txtPassword" - password element property

String passwordTestData="Livetech@123";
By passwordProperty=By.name("txtPassword");
WebElement password=driver.findElement(passwordProperty);
password.sendKeys(passwordTestData);

//<input type="Submit" name="Submit" value="Login" class="button" tabindex="3">
// class="button" -property of LogIn Button
By loginButtonProperty=By.className("button");
WebElement loginButton=driver.findElement(loginButtonProperty);
loginButton.click();

By WelcomeAdmin=By.id("welcome");
WebElement WelcomeAdminProperty=driver.findElement(WelcomeAdmin);
WelcomeAdminProperty.click();

//7)Automate Logout
Thread.sleep(5000);
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
 By logoutButtonPtoperty = By.linkText("Logout");
 WebElement LogoutButton = driver.findElement(logoutButtonPtoperty);
 LogoutButton.click();

driver.quit();

}

}



