@tag
Feature: Purchase the order from Ecommerce WebSite
	I want to use this template for my feature file
	
	Background:
	Given I landed on Ecommerce Page
	
	@Regression
	Scenario Outline: Positive Test of Submitting the order
		Given Logged in with userName <name> and UserPassword <password>
		When I add product <productName> from cart
		And Checkout <productName> and submit the order
		Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage
		
		Examples:
			|name                     | password| productName |
			|vidyarayudu668@gmail.com |Rahul$469| ZARA COAT 3|
