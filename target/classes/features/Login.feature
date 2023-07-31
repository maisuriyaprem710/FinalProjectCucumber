
Feature: Free CRM website feature

Scenario Outline: Free CRM login test scenario
    Given user is on login page
    When title of page is Cogmento CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on Login button
    Then user is on home page
    Then close browser
    
Examples:
    | username | password |
    | ppremm710@gmail.com | Prem@710 |
    | Maisu@gmail.com | kjsxiuhijn |
    


  
