package com.stepdefinition;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.WrapperClass;
import com.pages.Demo_Login;
import com.pages.SearchAddtoCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Searchcart extends WrapperClass {
	private static Logger Logger=(Logger)LogManager.getLogger(Test_Searchcart.class);
	Demo_Login lp;
	SearchAddtoCart pac;
	
	@Given("^TC03 User launches the webshop page$")
	public void User_launches_the_webshop_page() {
		//user launches the webpage in chrome
		launchApp("chrome");
		Logger.debug("chrome Launched and navigated to website");

	}

	@When("^TC03 User logged to the  home page$")
	public void User_logged_to_the_home_page() {
	    
		lp=new Demo_Login(driver);
    	lp.Login();
    	lp.email("akhila.setty6@gmail.com");
    	lp.password("123A456");
    	lp.login();
    	Logger.info("login successfully");
	}

	@Then("^TC03 User search the product$")
	public void User_search_the_product() {
		//user search the product
		pac=new SearchAddtoCart(driver);
		pac.Search();
		Logger.info("the products  were searched ");
	}

	@Then("^TC03 User gives the specifications$")
	public void User_gives_the_specifications() {
		pac=new SearchAddtoCart(driver);
		pac.specifications();

		Logger.info("Requird specifications were entered");
	}

	@Then("^TC03 User add product to cart$")
	public void User_add_product_to_cart() {
        //user add product to cart
		pac=new SearchAddtoCart(driver);
		pac.addtocart();
		Logger.info("Products added to cart successfully");
		driver.quit();
	}



}

