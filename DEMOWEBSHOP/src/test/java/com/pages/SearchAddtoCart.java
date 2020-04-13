package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchAddtoCart {

protected WebDriver driver;
	
	@FindBy(name="q")  WebElement searchbar;
	@FindBy(xpath="//*[@value='Search']") WebElement searchbtn;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/h2/a")
	WebElement product;
    @FindBy(name="addtocart_28.EnteredQuantity")
    WebElement qty;
    @FindBy(id="add-to-cart-button-28") 
    WebElement cart;
    
    public SearchAddtoCart(WebDriver driver) {
    	
    	PageFactory.initElements(driver,this);
    	this.driver=driver;
    }
    
   public void Search() { //searching product in demowebshop page
	   
	   searchbar.sendKeys("Blue and green Sneaker");
	   searchbtn.click();
	   product.click();
   }
   
   public void specifications() {
	   Select sizeSelect=new Select(driver.findElement(By.id("product_attribute_28_7_10")));
	   //selecting the size from the given options
	  sizeSelect.selectByVisibleText("10");
	   qty.sendKeys("4");
	   
   } 
   
   public void addtocart() { //adding product to cart
	   
	   cart.click();
	   
	   
   }
   
 } 

