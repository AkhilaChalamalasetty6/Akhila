package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_Wishlist {
	protected WebDriver driver;
	//adding products to wishlist through their paths
	@FindBy(xpath="//a[contains(text(),'Books')]")
	WebElement Books;
	@FindBy(xpath="//a[text()='Health Book']")
	WebElement healthbook;
	@FindBy(id="add-to-wishlist-button-22")
	WebElement wishlist1;
	@FindBy(xpath="//a[contains(text(),'Jewelry')]")
	WebElement jewelry;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a")
	WebElement chain;
	@FindBy(id="add-to-wishlist-button-14")
	WebElement wishlist2;
	@FindBy(xpath="//a[text()='Recently viewed products']")
	WebElement rvp;
	
	
public  Demo_Wishlist(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	this.driver=driver;   
	}
	
	public void wishlist() {
		
		Books.click();
		healthbook.click();
		wishlist1.click();
		jewelry.click();
	}
	public void chain() {
		chain.click();
	}public void wishlist2() {
		wishlist2.click();
		
			
	}
	
	public void recently_viewed() {   //checking recently viewed products
		rvp.click();
		
	}

}
