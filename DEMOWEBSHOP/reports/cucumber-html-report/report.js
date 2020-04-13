$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/DemoWebShop/DemoWebShop.feature");
formatter.feature({
  "name": "DemoWebShop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "name": "TC01 User launches webshop page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinition.Test_Register.user_launches_webshop_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC01 User enters valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinition.Test_Register.user_enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC01 User Registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.Test_Register.user_Registered_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC02"
    }
  ]
});
formatter.step({
  "name": "TC02 User launches webshop page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinition.Test_Login.user_launches_webshop_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC02 User enters valid credentials \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinition.Test_Login.user_enters_valid_credentials(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC02 User Login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.Test_Login.user_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successfully Added to cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC03"
    }
  ]
});
formatter.step({
  "name": "TC03 User launches the webshop page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinition.Test_Searchcart.User_launches_the_webshop_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC03 User logged to the  home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinition.Test_Searchcart.User_logged_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC03 User search the product",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.Test_Searchcart.User_search_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC03 User gives the specifications",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.Test_Searchcart.User_gives_the_specifications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC03 User add product to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.Test_Searchcart.User_add_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add to wishlist and recently viewed products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC04"
    }
  ]
});
formatter.step({
  "name": "TC04 User launches chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinition.Test_Wishlist.the_user_launches_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC04 User navigated into the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinition.Test_Wishlist.the_user_navigated_into_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC04 User adds some products to wishlist",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.Test_Wishlist.the_user_adds_some_products_to_wishlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC04 User checks the recently viewed products",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.Test_Wishlist.the_user_checks_the_recently_viewed_products()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Address",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC05"
    }
  ]
});
formatter.step({
  "name": "TC05 User launches to chrome page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinition.Test_Address.user_launches_to_chrome_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC05 User logged into the home page",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinition.Test_Address.user_logged_into_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TC05 User can add the address",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.Test_Address.the_user_can_add_the_address()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Change Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC06"
    }
  ]
});
formatter.step({
  "name": "The user launches  the firefox",
  "keyword": "Given "
});
formatter.step({
  "name": "The user login  to the site",
  "keyword": "When "
});
formatter.step({
  "name": "The user enters \"\u003cold password\u003e\" and \"\u003cnew password\u003e\" and \"\u003cconfirm password\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "old password",
        "new password",
        "confirm password"
      ]
    },
    {
      "cells": [
        "12345678",
        "23245890",
        "23245890"
      ]
    },
    {
      "cells": [
        "23245890",
        "demonew",
        "demonew"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Change Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC06"
    }
  ]
});
formatter.step({
  "name": "The user launches  the firefox",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinition.Test_changepswd.the_user_launches_the_firefox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user login  to the site",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinition.Test_changepswd.the_user_login_to_the_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \"12345678\" and \"23245890\" and \"23245890\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.Test_changepswd.the_user_enters_and_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Change Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC06"
    }
  ]
});
formatter.step({
  "name": "The user launches  the firefox",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefinition.Test_changepswd.the_user_launches_the_firefox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user login  to the site",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinition.Test_changepswd.the_user_login_to_the_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \"23245890\" and \"demonew\" and \"demonew\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinition.Test_changepswd.the_user_enters_and_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});