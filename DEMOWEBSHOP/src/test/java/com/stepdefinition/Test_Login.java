package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.WrapperClass;
import com.excel.ExcelLogin;
import com.pages.Demo_Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Login extends WrapperClass{
	private static Logger logger=(Logger)LogManager.getLogger(Test_Login.class);
    ExcelLogin data=new ExcelLogin(); 
	Demo_Login lp;
	
	@Given("^TC02 User launches webshop page$")
	public void user_launches_webshop_page() throws Throwable{
	 // Write code here that turns the phrase above into concrete actions
		launchApp("chrome");
		logger.debug("chrome launched and website opened");
		lp=new Demo_Login(driver);
		  lp.Login();}
	
	@When("TC02 User enters valid credentials {string} and {string}")
	public void user_enters_valid_credentials(String Email,String Password){
		//credentials are given through excel
		ExcelLogin ExcelLogin=new ExcelLogin();
		try {
			lp.email(ExcelLogin.excel_email(1));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			lp.password(ExcelLogin.excel_password(1));
		} catch (IOException e) {
			e.printStackTrace();
		}
		lp=new Demo_Login(driver);
	    lp.login();
	    logger.info("credentials entered");  
	} 
	@Then("^TC02 User Login successfully$")
	public void user_login_successfully() throws Throwable {
		logger.info("login successfully");
		screenshot("src/main/resources/Screenshots/Login.png");
	   // driver.getTitle();
	}
}

