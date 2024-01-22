@contact
Feature: contact functionality

  Scenario: contact via email

    Given launch the browser and navigates to contact page

    When user should be enter valid inputs fot contact
      | firstname | lastname | email                   | inputtxt      |
      | akash     | morey    | akashmorey559@gmail.com | hello welcome |

    Then verify the status of contact