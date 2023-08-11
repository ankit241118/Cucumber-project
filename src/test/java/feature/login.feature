#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login funcionality






Scenario: User login
Given User is on landing page
When User logins with valid usernamen and password
Then Dashboard page is displayed
    
@MobileTest
Scenario: User login app
Given App is open
When User logins with valid usernamen and password
Then Dashboard screen is displayed on app
    


Scenario: User login
Given User is on landing page
When User logins with "Rishi" and "Kayasth"
Then Dashboard page is displayed
   
@para
Scenario Outline:
Given User is on landing page
When User logins with multiple username and password <username> and <password>
Then Dashboard page is displayed
Examples:
|username|password|
|Ankit|2333|
|Rahul|35435|
|Rishi|434|
|Pushkar|34354|
    
    



    