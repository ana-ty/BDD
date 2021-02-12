@NewLogin
Feature: Validate Techfios Login Functionality

Background:
     Given User is on the Techfios login page     
       
     
@Scenario @Smoke
 Scenario Outline:  User should be able to login with valid credentials 
     When User enters "<username>" and "<password>" 
      And User clicks on Signin button   
      Then User should land on Dashboard page    
  Examples: 
 |username          |password|
 | demo@techfios.com | abc123 |
 |demo2@techfios.com | abc123 |