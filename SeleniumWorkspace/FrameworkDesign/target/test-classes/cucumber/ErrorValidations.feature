@tag
Feature: Error Validation
	I want to use this template for my feature file
	
	@ErrorValidation
	Scenario Outline: Title of your scenario title
	Given I landed on Ecommerce Page
	When  Logged in with userName <name> and UserPassword <password>
	Then "Incorrect email or password." message is displayed
	
	Examples:
			|name                     | password|
			|vidyarayudu668@gmail.com |Rahul$46| 