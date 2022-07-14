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
@Build
Feature: Testing PIM Page Functionalities

  Background: 
    Given User is on the login page
    When User enters the credentials <username> and <password>
      | usernaname | password |
      | Admin      | admin123 |
    And User Clicks on Login button
    Then User is redirected to the Home page
    

  @Normal
  Scenario: Testing the Search functionality with Employment Status DropDown Menu
    Given User is on PIM Page
    When User select an Element from Employment Status DropDown
    And User clicks on Saerch button
    Then A result is displayed
