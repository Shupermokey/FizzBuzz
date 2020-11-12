Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given the browser is open
    And the user is on the google search page
    When the user enters a text in the search box
    And hits enter
    Then the user is navegated to the search results
