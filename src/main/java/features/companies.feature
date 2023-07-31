Feature: Free CRM companies feature

Scenario Outline: Free CRM create companies test scenario
    Given user is on login page
    When title of page is Cogmento CRM
    Then user enters username and password
    | ppremm710@gmail.com | Prem@710 |
    
    Then user clicks on Login button
    Then user is on home page
    Then user opens Companies Page
    Then user creates Deals
    |   title  |      url                   |   city   |  industry   |
    | Facebook | https://www.facebook.com/  | Toronto  | Information |
    |Instagram |https://www.instagram.com/  |Hamilton  |Fun          |
    | Walmart | https://www.walmart.ca/en  | Etobicoke| shopping |
    | Wincon | https://wincon-security.com/| Toronto  | security |
    Then close browser
    
