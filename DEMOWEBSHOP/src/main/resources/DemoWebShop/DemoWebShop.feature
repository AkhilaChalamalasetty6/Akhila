Feature: DemoWebShop
 
 @TC01
  Scenario: Successful Registration  
  Given TC01 User launches webshop page
  When  TC01 User enters valid credentials
  Then  TC01 User Registered successfully

@TC02  
  Scenario: Successful Login  
  Given TC02 User launches webshop page
  When  TC02 User enters valid credentials "<email>" and "<password>"
  Then  TC02 User Login successfully
    
 @TC03
  Scenario: Successfully Added to cart 
  Given TC03 User launches the webshop page
  When  TC03 User logged to the  home page
  Then  TC03 User search the product
  Then  TC03 User gives the specifications
  Then  TC03 User add product to cart
   
@TC04
  Scenario: Add to wishlist and recently viewed products
  Given TC04 User launches chrome
  When  TC04 User navigated into the home page
  Then  TC04 User adds some products to wishlist
  Then  TC04 User checks the recently viewed products  
    
@TC05
  Scenario: Add Address
  Given TC05 User launches to chrome page
  When  TC05 User logged into the home page
  Then  TC05 User can add the address
 
 @TC06
  Scenario Outline: Change Password
  Given The user launches  the firefox 
  When  The user login  to the site
  Then  The user enters "<old password>" and "<new password>" and "<confirm password>"
 
 Examples:
 |  old password  |  new password  |  confirm password  |
 |  12345678      |   23245890     |   23245890         |
 |  23245890      |   demonew      |   demonew          |



     #ooo
     
 #
 #
  