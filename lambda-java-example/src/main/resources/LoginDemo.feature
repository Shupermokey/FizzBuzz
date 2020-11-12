Feature: Test ogin functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And user is on the login page
    When user enters their <username> and <password>
    Then the user is navigated to the home page

    Examples: 
      | username  | password |
      | Sobieraj  |    12345 |
      #| Alexander |    12345 |
