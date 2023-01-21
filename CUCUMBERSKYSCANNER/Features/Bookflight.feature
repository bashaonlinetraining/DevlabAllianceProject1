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

@FlightFeature
Feature: Validate all flighbooking feature


  @scenario1
  Scenario: Search a flight and select a specific flight filter
    Given User lauch the url
    When User click flight tab
    And User enter from and city names
    And User clicks searh button
    Then user should see the flight result page and select flight filter
    
  @scenario2
  Scenario: Search a flight and select a specific flight filter
    Given User lauch the url
    When User click flight tab
    And User enter from value "Mumbai" and to city "Delhi"
    And User clicks searh button 
    Then user should see the flight result page and select flight filter "Vistara"
    
   @scenario3
  Scenario Outline: Search a flight and select a specific flight filter
    Given User lauch the url
    When User click flight tab
    And User enter from value "<FromCity>" and to city "<ToCity>"
    And User clicks searh button 
    Then user should see the flight result page and select flight filter "<FlightName>"
    
    Examples:
    
    |FromCity | ToCity| FlightName |
    |Mumbai| Delhi| Vistara|
    |Bengaluru| Chennai | Indigo|
    |Hyderabad| Chennai | Vistara|
