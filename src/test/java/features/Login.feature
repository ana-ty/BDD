@Login
Feature: Validate Techfios Login Functionality

Background:
     Given User is on the Techfios login page     
       
     
@Scenario1 @Smoke
 Scenario: 1 User should be able to login with valid credentials 
      When User enters username as "demo@techfios.com"       
      When User enters password as "abc123" 
      And User clicks on Signin button   
      Then User should land on Dashboard page    

@Scenario2
 Scenario: 2 User should be able to login with valid credentials 
      When User enters username as "demo2@techfios.com"       
      When User enters password as "abc123" 
      And User clicks on Signin button   
      Then User should land on Dashboard page  
  
  @Scenario3    
  Scenario: 3 User should be able to login with valid credentials 
      When User enters username as "demo@techfios.com"       
      When User enters password as "abc124" 
      And User clicks on Signin button   
      Then User should land on Dashboard page      