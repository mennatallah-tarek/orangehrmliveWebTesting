Feature: Delete a user

  Scenario: Successfully delete a user
    Given I am logged in as "Admin"
    When I navigate to Admin page
    And  I search for the new user
    And I delete the new user
    Then I get the number of records found on the Admin page after deleting user

