package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.excel.ExcelLogin;
    //logging into webpage
    public class Demo_Login {
	 protected WebDriver driver;
	 @FindBy(xpath="//a[text()='Log in']")
	 WebElement Login;
	 @FindBy(id="Email")
		WebElement email;
		@FindBy(name="Password")
		WebElement password;
		@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
		WebElement loginbtn;
		
		public   Demo_Login(WebDriver driver) {  
			PageFactory.initElements(driver,this);//used to initiate the webelements
		this.driver=driver;   
		}
    public void Login() {
			
			Login.click();
  }
    public void email(String excel_email) {   //data given through excel page
	this.email.sendKeys(excel_email);
  }
    public void password(String excel_password) {
	this.password.sendKeys(excel_password);
 }	

    public void login() {			
			
		loginbtn.click();		
 }

 }