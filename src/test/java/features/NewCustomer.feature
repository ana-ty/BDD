@NewAccLogin
Feature: Validate new customer account

Background: 
            Given User is on the Techfios login page    

@Scenario
Scenario Outline: User should be able to login with valid credentilas
             When User enters "<username>" and "<password>"    
             Then User clicks on Signin button     
             Then User should land on Dashboard page  
             Then User move to Bank & Cash  
             Then User clicks 
             Then User click on New Account   
             Then User enters details "<Name>" and "<description>" and "<initialBalance>" and "<accountNumber>" and "<contactPerson>" and "<phone>" and "<InternetBankingURL>"     
             And User clicks on submit button   
             Then User should be able to validate new account     
  Examples: 
 |username          |password| Name | description  |  initialBalance | accountNumber | contactPerson | phone |  InternetBankingURL |
 |demo@techfios.com |abc123 |  Random        | My Savings         |  500 | 10345 |    Jerry   |  1234561809 | abc123@gmail.com |
 
 
 
 