Feature: OrangeHRM Application Functionalities Testing

Background:
Given User should open Chrome Browser in the System

@Smoke
Scenario: Validating OrangeHRM Application LogIn WebPage

When User should enter the OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
#Then User should close the Chrome Browser along with OrangeHRM Application

@ReTesting
Scenario: Validating OrangeHRM Application LogIn Functionality Test

#Given User should open Chrome Browser in the System
When User should enter the OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should enter userName and password and click on logIn button
Then User should be navigated to OrangeHRM Application HomePage
Then User should logOut from the OrangeHRM Application
#Then User should close the Chrome Browser along with OrangeHRM Application

@ReTesting @Regression
Scenario Outline: Validating OrangeHRM Application LogIn Functionality Test with Test Data

#Given User should open Chrome Browser in the System
When User should enter the OrangeHRM Application Url Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should enter "<UserName>" and "<Password>" and click on logIn button
Then User should be navigated to OrangeHRM Application HomePage
Then User should logOut from the OrangeHRM Application
#Then User should close the Chrome Browser along with OrangeHRM Application

Examples:
| UserName   |   Password      |
| Admin      |   Livetech@123  |
| Admin      |   Testing       |
| Hello      |   Livetech@123  |
| Admin      |   Livetech@123  |
