@datatable
Feature: Login Feature - datatble
     In order to perform successful login
     As a User
     I have to enter correct username and password

  Scenario: Login to the Facebook Website as a user on Production
    Given user navigate to the facebook website
    When user validate the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user enters firstname and lastname
      | FirstName | LastName |
      | [blank]    | Mishra   |
      | Vandana   | Pandey   |
    And user clicks on the signin button
