package com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.WrapperClass;
import com.pages.Demo_Login;
import com.pages.Demo_Wishlist;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Wishlist extends WrapperClass{
	private static Logger logger=(Logger)LogManager.getLogger(Test_Wishlist.class);
	Demo_Login lp;
	Demo_Wishlist ap;
	
@Given("^TC04 User launches chrome$")
public void the_user_launches_chrome() throws Throwable{
	launchApp("chrome");
	logger.debug("Chrome launched and website opened");

}
@When("^TC04 User navigated into the home page$")

public void the_user_navigated_into_the_home_page() throws Throwable {
	lp=new Demo_Login(driver);
	lp.Login();
	lp.email("akhila.setty6@gmail.com");
	lp.password("123A456");
	lp.login();
	logger.info("login successfully");

}
@Then("^TC04 User adds some products to wishlist$")
//adding products to wishlist
public void the_user_adds_some_products_to_wishlist() throws Throwable {
	ap= new Demo_Wishlist(driver);
	ap.wishlist();
	Thread.sleep(700);
	ap.chain();
	Thread.sleep(700);
	ap.wishlist2();
	logger.info("products added to wishlist");
}
@Then("^TC04 User checks the recently viewed products$")
//checking recently viewed products
public void the_user_checks_the_recently_viewed_products() throws Throwable {
	ap= new Demo_Wishlist(driver);
	ap.recently_viewed();
   logger.info("Recently viewed products shown in the window");
	screenshot("src/main/resources/Screenshots/Recently viewed.png");
	driver.quit();
}
 
}
