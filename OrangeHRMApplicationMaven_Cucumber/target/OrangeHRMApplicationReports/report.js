$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrangeHRMApplication.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHRM Application Functionalities Testing",
  "description": "",
  "id": "orangehrm-application-functionalities-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1956051300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Chrome Browser in the System",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_Chrome_Browser_in_the_System()"
});
formatter.result({
  "duration": 186251500,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validating OrangeHRM Application LogIn WebPage",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-webpage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 734435800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 49106600,
  "status": "passed"
});
formatter.after({
  "duration": 274470300,
  "status": "passed"
});
formatter.before({
  "duration": 1217801300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Chrome Browser in the System",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_Chrome_Browser_in_the_System()"
});
formatter.result({
  "duration": 187700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#Then User should close the Chrome Browser along with OrangeHRM Application"
    }
  ],
  "line": 14,
  "name": "Validating OrangeHRM Application LogIn Functionality Test",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@ReTesting"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 17,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User should enter userName and password and click on logIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 765742800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 52835300,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_userName_and_password_and_click_on_logIn_button()"
});
formatter.result({
  "duration": 1961506200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "duration": 41225800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logOut_from_the_OrangeHRM_Application()"
});
formatter.result({
  "duration": 917902800,
  "status": "passed"
});
formatter.after({
  "duration": 190833800,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 22,
      "value": "#Then User should close the Chrome Browser along with OrangeHRM Application"
    }
  ],
  "line": 25,
  "name": "Validating OrangeHRM Application LogIn Functionality Test with Test Data",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@ReTesting"
    },
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 28,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should enter \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\" and click on logIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 33,
      "value": "#Then User should close the Chrome Browser along with OrangeHRM Application"
    }
  ],
  "line": 35,
  "name": "",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 36,
      "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;1"
    },
    {
      "cells": [
        "Admin",
        "Livetech@123"
      ],
      "line": 37,
      "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;2"
    },
    {
      "cells": [
        "Admin",
        "Testing"
      ],
      "line": 38,
      "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;3"
    },
    {
      "cells": [
        "Hello",
        "Livetech@123"
      ],
      "line": 39,
      "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;4"
    },
    {
      "cells": [
        "Admin",
        "Livetech@123"
      ],
      "line": 40,
      "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1267986900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Chrome Browser in the System",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_Chrome_Browser_in_the_System()"
});
formatter.result({
  "duration": 164000,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Validating OrangeHRM Application LogIn Functionality Test with Test Data",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@ReTesting"
    },
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 28,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should enter \"Admin\" and \"Livetech@123\" and click on logIn button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 692027200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 38842900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 19
    },
    {
      "val": "Livetech@123",
      "offset": 31
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_should_enter_and_and_click_on_logIn_button(String,String)"
});
formatter.result({
  "duration": 1964903200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "duration": 35852900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logOut_from_the_OrangeHRM_Application()"
});
formatter.result({
  "duration": 892162600,
  "status": "passed"
});
formatter.after({
  "duration": 148201800,
  "status": "passed"
});
formatter.before({
  "duration": 1214550500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Chrome Browser in the System",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_Chrome_Browser_in_the_System()"
});
formatter.result({
  "duration": 138800,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Validating OrangeHRM Application LogIn Functionality Test with Test Data",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@ReTesting"
    },
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 28,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should enter \"Admin\" and \"Testing\" and click on logIn button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 732196900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 39928600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 19
    },
    {
      "val": "Testing",
      "offset": 31
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_should_enter_and_and_click_on_logIn_button(String,String)"
});
formatter.result({
  "duration": 1278159900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "duration": 10094427800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#welcome\"}\n  (Session info: chrome\u003d120.0.6099.71)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-1KAEUVT\u0027, ip: \u0027192.168.0.107\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 120.0.6099.71, chrome: {chromedriverVersion: 119.0.6045.159 (eaa767197fa..., userDataDir: C:\\Users\\dell\\AppData\\Local...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:56738}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 31bfbf754654bc4898fdb13bb31a0482\n*** Element info: {Using\u003did, value\u003dwelcome}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat com.StepDefination.OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage(OrangeHRMApplicationMethods.java:135)\r\n\tat ✽.Then User should be navigated to OrangeHRM Application HomePage(OrangeHRMApplication.feature:31)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logOut_from_the_OrangeHRM_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 170844800,
  "status": "passed"
});
formatter.before({
  "duration": 1264137100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Chrome Browser in the System",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_Chrome_Browser_in_the_System()"
});
formatter.result({
  "duration": 203700,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Validating OrangeHRM Application LogIn Functionality Test with Test Data",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@ReTesting"
    },
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 28,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should enter \"Hello\" and \"Livetech@123\" and click on logIn button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 529333200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 74676000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello",
      "offset": 19
    },
    {
      "val": "Livetech@123",
      "offset": 31
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_should_enter_and_and_click_on_logIn_button(String,String)"
});
formatter.result({
  "duration": 524069500,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "duration": 10049828300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#welcome\"}\n  (Session info: chrome\u003d120.0.6099.71)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-1KAEUVT\u0027, ip: \u0027192.168.0.107\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 120.0.6099.71, chrome: {chromedriverVersion: 119.0.6045.159 (eaa767197fa..., userDataDir: C:\\Users\\dell\\AppData\\Local...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:56760}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 3013e18476b8af2e4c717e4846d578c1\n*** Element info: {Using\u003did, value\u003dwelcome}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat com.StepDefination.OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage(OrangeHRMApplicationMethods.java:135)\r\n\tat ✽.Then User should be navigated to OrangeHRM Application HomePage(OrangeHRMApplication.feature:31)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logOut_from_the_OrangeHRM_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 247685400,
  "status": "passed"
});
formatter.before({
  "duration": 1352920800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User should open Chrome Browser in the System",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_Chrome_Browser_in_the_System()"
});
formatter.result({
  "duration": 268300,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Validating OrangeHRM Application LogIn Functionality Test with Test Data",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@ReTesting"
    },
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 28,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should enter \"Admin\" and \"Livetech@123\" and click on logIn button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 625787800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 45091000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 19
    },
    {
      "val": "Livetech@123",
      "offset": 31
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_should_enter_and_and_click_on_logIn_button(String,String)"
});
formatter.result({
  "duration": 1883958000,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "duration": 49607300,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logOut_from_the_OrangeHRM_Application()"
});
formatter.result({
  "duration": 1118186000,
  "status": "passed"
});
formatter.after({
  "duration": 191187200,
  "status": "passed"
});
});