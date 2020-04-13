package com.testRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
     features="src/main/resources/DemoWebShop/DemoWebShop.feature",
     plugin = {"pretty", "html:reports/cucumber-html-report",
    		 "json:target/cucumber.json",
    		 "junit:target/cucumber.xml"},
    		 
     glue= {"com.stepdefinition"},
     strict=true
    )

@SuiteClasses({})
public class testRunner {  
	
	
	}



	