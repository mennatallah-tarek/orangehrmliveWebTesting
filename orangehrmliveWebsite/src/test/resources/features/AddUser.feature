Feature: Add a new user

  Scenario: Successfully add a new user
    Given I am logged in as "Admin"
    When I navigate to Admin page
    Then I click add Button
    Then I Add User Role
    Then I add Employee Name
    Then I add Status
    Then I add Username
    Then I add Password
    Then I confirm Password
    Then I click save
    Then I should see number of records is increased by 1