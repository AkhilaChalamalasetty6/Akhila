package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_Register {   //adding account in webpage
	protected WebDriver driver;
	@FindBy(xpath = "//*[@class='ico-register']")
	WebElement Register;
	@FindBy(id = "gender-female")
	WebElement Gender;
	@FindBy(name = "FirstName")
	WebElement FirstName;
	@FindBy(name = "LastName")
	WebElement LastName;
	@FindBy(id = "Email")
	WebElement Email;
	@FindBy(name = "Password")
	WebElement Password;
	@FindBy(name = "ConfirmPassword")
	WebElement ConfirmPassword;
	@FindBy(id = "register-button")
	WebElement register;

	public Demo_Register(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void Register() {

		Register.click();
		Gender.click();
		FirstName.sendKeys("Akhila");
		LastName.sendKeys("Chalamalasetty");
		Email.sendKeys("akhila.setty6@gmail.com");
		Password.sendKeys("123A456");
		WebElement confirmPassword;
		ConfirmPassword.sendKeys("123A456");
		register.click();

	}
}
