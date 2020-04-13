package com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.WrapperClass;
import com.pages.Demo_Login;
import com.pages.Demo_changepswd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_changepswd extends WrapperClass {
	private static Logger logger=(Logger)LogManager.getLogger(Test_changepswd.class);
	Demo_Login lp;  
	Demo_changepswd cp;
	
	@Given("The user launches  the firefox")
	public void the_user_launches_the_firefox() throws Throwable{
	    launchApp("firefox");
	    logger.debug("firefox launched and webpage opened");
	}

	@When("The user login  to the site")
	public void the_user_login_to_the_site() throws Throwable{
		lp=new Demo_Login(driver);
		lp.Login();
		lp.email("akhila.setty6@gmail.com");
		lp.password("123A456");
		lp.login();
		logger.info("login successfully");
	}

	@Then("The user enters {string} and {string} and {string}")
	public void the_user_enters_and_and(String string, String string2, String string3) throws Throwable{
	    
		cp=new Demo_changepswd(driver);
    Thread.sleep(800);
		cp.changepassword(string,string2,string3);
    	logger.info("password changed succesfully");
    	screenshot("src/main/resources/Screenshots/Changepassword.png");
    	driver.quit();
	}
	
}





