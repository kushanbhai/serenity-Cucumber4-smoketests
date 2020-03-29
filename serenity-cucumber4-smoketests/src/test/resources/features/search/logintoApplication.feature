Feature: Login to HRM

  Scenario: Login with valid credentials
    Given user is on Home Page
    When user enter Admin as data
    And user enter admin123 as password
    Then user should be able to login