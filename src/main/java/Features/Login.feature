#Feature: LeadFerret Login Feature
#Scenario: LeadFerret Login Test Scenario
#Given User is on login page
#When Title of login page is LeadFerret Login
#Then Enter user name and password
#Then User click on login button
#And  User is on HomePage
#Then Close browser

#********** 3 way to achive data driven in cucumber*************
#***** 1. Simple datadrive approch *******
#Feature: LeadFerret Login Feature with simple DataDriven
#Scenario: LeadFerret Login Test Scenario
#Given User is on login page
#When Title of login page is LeadFerret Login
#Then Enter user "varsha" and "test123"
#Then User click on login button
#And  User is on HomePage
#Then Close browser


#***** 2. With Examples keyword  *******
#Feature: LeadFerret Login Feature with Example keyword 
#Scenario Outline: LeadFerret Login Test Scenario
#Given User is on login page
#When Title of login page is LeadFerret Login
#Then Enter user "<userName>" and "<password>"
#Then User click on login button
#And  User is on HomePage
#Then Close browser


#Examples:
#|userName | password |
#|sam   | test123 |
#|tom      | test234 |


#***** 3.  Datatable With list  *******
#Feature: LeadFerret Login Feature with Example keyword 
#Scenario: LeadFerret Login Test Scenario
#Given User is on login page
#When Title of login page is LeadFerret Login
#Then Enter user userName and password
#| varsha | patil |
#Then User click on login button
#And  User is on HomePage
#Then Close browser


#***** 4.  Datatable With Map (parameterization you test cases with multiple set of data)  *******
Feature: LeadFerret Login Feature with Example keyword 
Scenario: LeadFerret Login Test Scenario
Given User is on login page
When Title of login page is LeadFerret Login
Then Enter user userName and password
	|Username | Password |
	| varsha  | test123  |
	| sam     | test234  |
#Then User click on login button
And  User is on HomePage
Then Close browser