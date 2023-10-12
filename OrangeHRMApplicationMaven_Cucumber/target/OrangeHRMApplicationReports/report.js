$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrangeHRMApplication.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHRM Application Functionalities Testing",
  "description": "",
  "id": "orangehrm-application-functionalities-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2333716300,
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
  "duration": 144799000,
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
  "duration": 825755500,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 45466700,
  "status": "passed"
});
formatter.after({
  "duration": 110730600,
  "status": "passed"
});
formatter.before({
  "duration": 1461227100,
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
  "duration": 214200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#Then User should close the Chrome Browser along with OrangeHRM Application"
    }
  ],
  "line": 13,
  "name": "Validating OrangeHRM Application LogIn Functionality Test",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@ReTesting"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 15,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 16,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User should enter userName and password and click on logIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 581284200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 65367100,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_userName_and_password_and_click_on_logIn_button()"
});
formatter.result({
  "duration": 1830872900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "duration": 79651700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logOut_from_the_OrangeHRM_Application()"
});
formatter.result({
  "duration": 875629400,
  "status": "passed"
});
formatter.after({
  "duration": 183133700,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 21,
      "value": "#Then User should close the Chrome Browser along with OrangeHRM Application"
    }
  ],
  "line": 23,
  "name": "Validating OrangeHRM Application LogIn Functionality Test with Test Data",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@ReTesting"
    },
    {
      "line": 22,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 26,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User should enter \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\" and click on logIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 31,
      "value": "#Then User should close the Chrome Browser along with OrangeHRM Application"
    }
  ],
  "line": 33,
  "name": "",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 34,
      "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;1"
    },
    {
      "cells": [
        "Admin",
        "Livetech@123"
      ],
      "line": 35,
      "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;2"
    },
    {
      "cells": [
        "Admin",
        "Testing"
      ],
      "line": 36,
      "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;3"
    },
    {
      "cells": [
        "Hello",
        "Livetech@123"
      ],
      "line": 37,
      "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;4"
    },
    {
      "cells": [
        "Admin",
        "Livetech@123"
      ],
      "line": 38,
      "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1366038400,
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
  "duration": 161500,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Validating OrangeHRM Application LogIn Functionality Test with Test Data",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@ReTesting"
    },
    {
      "line": 22,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 26,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User should enter \"Admin\" and \"Livetech@123\" and click on logIn button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 802826100,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 37343400,
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
  "duration": 2000471500,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "duration": 58926200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logOut_from_the_OrangeHRM_Application()"
});
formatter.result({
  "duration": 842483700,
  "status": "passed"
});
formatter.after({
  "duration": 158135300,
  "status": "passed"
});
formatter.before({
  "duration": 1447181000,
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
  "duration": 93900,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Validating OrangeHRM Application LogIn Functionality Test with Test Data",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@ReTesting"
    },
    {
      "line": 22,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 26,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User should enter \"Admin\" and \"Testing\" and click on logIn button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 621753900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 58061500,
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
  "duration": 1349535900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "duration": 10050083700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#welcome\"}\n  (Session info: chrome\u003d117.0.5938.150)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-1KAEUVT\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 117.0.5938.150, chrome: {chromedriverVersion: 117.0.5938.88 (be6afae47212..., userDataDir: C:\\Users\\dell\\AppData\\Local...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:56620}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 72df3fdb6a7a42cbe1e0b2ce964a4d2d\n*** Element info: {Using\u003did, value\u003dwelcome}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat com.StepDefination.OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage(OrangeHRMApplicationMethods.java:134)\r\n\tat ✽.Then User should be navigated to OrangeHRM Application HomePage(OrangeHRMApplication.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logOut_from_the_OrangeHRM_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 128418000,
  "status": "passed"
});
formatter.before({
  "duration": 1415291800,
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
  "duration": 202900,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Validating OrangeHRM Application LogIn Functionality Test with Test Data",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@ReTesting"
    },
    {
      "line": 22,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 26,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User should enter \"Hello\" and \"Livetech@123\" and click on logIn button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 655742100,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 56277700,
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
  "duration": 501060700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "duration": 10051561800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#welcome\"}\n  (Session info: chrome\u003d117.0.5938.150)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-1KAEUVT\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 117.0.5938.150, chrome: {chromedriverVersion: 117.0.5938.88 (be6afae47212..., userDataDir: C:\\Users\\dell\\AppData\\Local...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:56643}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 6cbfb58388c388897ba083a284235de8\n*** Element info: {Using\u003did, value\u003dwelcome}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat com.StepDefination.OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage(OrangeHRMApplicationMethods.java:134)\r\n\tat ✽.Then User should be navigated to OrangeHRM Application HomePage(OrangeHRMApplication.feature:29)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logOut_from_the_OrangeHRM_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 125590200,
  "status": "passed"
});
formatter.before({
  "duration": 1402299000,
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
  "duration": 189400,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Validating OrangeHRM Application LogIn Functionality Test with Test Data",
  "description": "",
  "id": "orangehrm-application-functionalities-testing;validating-orangehrm-application-login-functionality-test-with-test-data;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@ReTesting"
    },
    {
      "line": 22,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#Given User should open Chrome Browser in the System"
    }
  ],
  "line": 26,
  "name": "User should enter the OrangeHRM Application Url Address",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User should be navigated to OrangeHRM Application LogIn WebPage",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User should enter \"Admin\" and \"Livetech@123\" and click on logIn button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User should be navigated to OrangeHRM Application HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User should logOut from the OrangeHRM Application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_enter_the_OrangeHRM_Application_Url_Address()"
});
formatter.result({
  "duration": 863839900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()"
});
formatter.result({
  "duration": 83508800,
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
  "duration": 1783410000,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_navigated_to_OrangeHRM_Application_HomePage()"
});
formatter.result({
  "duration": 61366600,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_logOut_from_the_OrangeHRM_Application()"
});
formatter.result({
  "duration": 884895300,
  "status": "passed"
});
formatter.after({
  "duration": 116983800,
  "status": "passed"
});
});