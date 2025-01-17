@login
Feature: Login

  Scenario: User enters valid username and password
    Given user is on login page
    When user enters valid username and password
      | username      | password     |
      | standard_user | secret_sauce |
    Then user should be logged in

  Scenario: User enters invalid username and password
    Given user is on login page
    When user enters invalid username and password
      | username     | password     |
      | invalid_user | invalid_pass |
    Then user should not be logged in

  Scenario: User enters valid username and invalid password
    Given user is on login page
    When user enters valid username and invalid password
      | username      | password     |
      | standard_user | invalid_pass |
    Then user should not be logged in
