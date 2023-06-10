Feature: Application Login

  Scenario: Home page default login
    Given user is on Netbanking landing page
    When user login into application with username and password
    Then Homepage is populated
    And cards are displayed

  Scenario: Invalid login
    Given user is not portal landing page
    When provided the wrong credentials
    Then shows the error message
