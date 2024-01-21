
@login
Feature: verify the login functionality

  Scenario: verify the login functionality by entering valid credentials
    Given launch the browser and navigates to login page
    When user should be enter valid username and valid password
      | username | password    |
      | student  | Password123 |
    Then user should be navigates to homepage

  Scenario: verify the login functionality by entering invalid username and valid password
    Given launch the browser and navigates to login page
    When user should be enter In_valid username and valid password
      | username | password    |
      | akash    | Password123 |
    Then user should be get error massage

  Scenario: verify the login functionality by entering valid username and in_valid password
    Given launch the browser and navigates to login page
    When user should be enter valid username and in_valid password
      | username | password |
      | student  | akash    |
    Then user should be get error massage

  Scenario: verify the login functionality by entering In_valid username and in_valid password
    Given launch the browser and navigates to login page
    When user should be enter in_valid username and in_valid password
      | username | password |
      | akash    | akash    |
    Then user should be get error massage
