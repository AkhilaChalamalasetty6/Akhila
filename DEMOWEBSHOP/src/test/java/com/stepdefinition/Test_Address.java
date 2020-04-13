package com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.WrapperClass;
import com.pages.Demo_Address;
import com.pages.Demo_Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Address extends WrapperClass{  //
     private static Logger Logger=(Logger)LogManager.getLogger(Test_Address.class);
     Demo_Login lp;  
     Demo_Address add;
	
	 @Given("^TC05 User launches to chrome page$")
	    public void user_launches_to_chrome_page() throws Throwable {
	        launchApp("chrome");
	        Logger.debug("chrome launched and website opened");
	    }

	    @When("^TC05 User logged into the home page$")
	    public void user_logged_into_the_home_page() throws Throwable {
	     //logging to wepage before adding address   
	    	lp=new Demo_Login(driver);
	    	lp.Login();
	    	lp.email("akhila.setty6@gmail.com"); 
	    	lp.password("123A456");
	    	lp.login();
			Logger.info("login successfully");

	    }

	    @Then("^TC05 User can add the address$")
	    public void the_user_can_add_the_address() throws Throwable {
	        
	    	add=new Demo_Address(driver);
	    	add.address();
	    	Logger.info("address added successfully");
	    	driver.quit();
	    }

}


