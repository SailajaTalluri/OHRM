package com.StepDefination;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
	@CucumberOptions(features="OrangeHRMApplication",
	glue="com.StepDefination", //will connect the Feature file with
	//the User-defined methods class-which will
	//perform the actions related to statements of
	//the scenario
	monochrome=true, //will remove the Junk data from the TestResult-in Console
	//dryRun=true //Will compare the Feature file Scenarios with the Methods Class
	//- if the steps of the scenarios are not found in methods class
	//the it creates the methods without executing the steps of
	//all the Scenarios
	//tags="@ReTesting"
	//tags="@Smoke" //running a particular Scenario
	//tags="@Smoke,@ReTesting"
	//tags="@Smoke,@Regression"//running the respective Test Scenarios
	
	plugin= {"pretty",
			"html:target/OrangeHRMApplicationReports",
			"json:target/OrangeHRMApplicationJsonReport.json",
			"com.cucumber.listener.ExtentCucumberFormatter:target/OrangeHRMApplicationExtentReports.htm"

	}
	
	)
	public class TestRunner {
		
}

