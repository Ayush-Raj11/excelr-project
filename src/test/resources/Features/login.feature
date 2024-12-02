Feature: ORANGEHRM HOMEPAGE

Scenario: Login

    Given Open Browser
    #Then Enter username (or instead of that we can)
    Then Enter username "<username>"
    #Then Enter password (or instead of that we can)
    Then Enter password "<password>"
    And Click login button
    And verify login data
    Then close the broswer
    
    Examples:
    |username|password|
     |Admin|admin123|
     |Ayush|ayush123|
     |Rahul|rahul123|
     
# note:-->we can do for other functions also in the same feature file or in diffrent feature one.
# and in further we can like taking the (scenarios) and all the other steps.
   
