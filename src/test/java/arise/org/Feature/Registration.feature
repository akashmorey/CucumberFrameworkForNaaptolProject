@registration
Feature: registration functionality

  Scenario: register functionality via email

    Given launch the browser and navigates to login page

    When user should be enter in_valid email and in_valid password

    Then verify the account status