Feature: Free CRM contacts feature

Scenario Outline: Free CRM create contacts test scenario
    Given user is on login page
    When title of page is Cogmento CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on Login button
    Then user is on home page
    Then user opens Contacts Page
    Then user creates contacts with "<firstname>"&"<lastname>"&"<city>"
    Then close browser
    
   
   
   
   
    Examples:
    |            username | password   |firstname|lastname|city    |
    | ppremm710@gmail.com | Prem@710   |Roni     |Soni    |Bilimora|
    | ppremm710@gmail.com | Prem@710   |Mitesh   |Jani    |Navsari |      
    | ppremm710@gmail.com | Prem@710   |Dhaval   |Soni    |Surat   |
