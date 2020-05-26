package com.usa.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions

(features="Features",
glue="com.usa.stepdefinition"

)

public class MyRunner extends AbstractTestNGCucumberTests   {
	
	

}
