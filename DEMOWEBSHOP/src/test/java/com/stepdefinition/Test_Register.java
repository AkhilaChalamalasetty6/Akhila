package com.stepdefinition;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.LogManager;
import com.baseclass.WrapperClass;
import com.pages.Demo_Register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Register extends WrapperClass{

  private static Logger Logger=(Logger)LogManager.getLogger(Test_Register.class);
	Demo_Register lp;
	
	@Given("^TC01 User launches webshop page$")
	public void user_launches_webshop_page() throws Throwable{
		launchApp("chrome");
		//user launches the chrome
		Logger.debug("Chrome launched and navigated to website"); 
	}
	
	@When("^TC01 User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable{
		//user enters the valid credentials
		lp=new Demo_Register(driver);
	    lp.Register();
	    Logger.info("Required details for registration are entered");
	} 
	@Then("^TC01 User Registered successfully$")
	public void user_Registered_successfully() throws Throwable {
		Logger.warn("You entered an existed email id");
		Logger.error("The registration is not successful");
		//screenshot
		screenshot("src/main/resources/Screenshots/Changepassword.png");
    	driver.quit();
	   
	}
}