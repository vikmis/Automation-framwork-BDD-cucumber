Feature: Welcome Page

  Scenario: Verify home page title
    Given user is logged in
      | username          | password    |
      | standard_user     | secret_sauce|
    Then home page title should be "Swag Labs"

  Scenario: Verify all products listed on home page
    Given user is logged in
      | username          | password    |
      | standard_user     | secret_sauce|
    Then all products should be listed
