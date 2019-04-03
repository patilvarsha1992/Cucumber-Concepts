@FuntionalTest
Feature: LeadFerret Login Feature  

@SmokeTest
Scenario: Login with valid credentials
Given User enetrs valid credentials

@SmokeTest @RegressionTest
Scenario: Login with invalid credentials
Given User enetrs invalid credentials

@RegressionTest
Scenario: Search task
Given This is search task

@RegressionTest @EndToEnd
Scenario: Check title of search page
Given  Search page title is leadferretsearch

@EndToEnd
Scenario: Check title of login pahe
Given  Login page title is leadferretlogin