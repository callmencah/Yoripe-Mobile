Feature: Login
  As a user
  I want to be able to login to the system with account google
  Scenario: TCM0001 Login with account google
    Given I am on the login page
    When I click Masuk
    And I click button masuk dengan google
    And I select account google
    And I click no thank and I click Okay
    Then successfully logged in I am now on the home page