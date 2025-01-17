@staging
Feature: Login Feature - Staging
     In order to perform successful login
     As a User
     I have to enter correct username and password

  Background: 
    Given user navigates to the facebook website
    When user validates the homepage title
@staging
  Scenario: Login to the Facebook Website as a valid user on Staging
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user clicks on the signin button

  Scenario: Login to the Facebook Website as a Invalid user on Staging
    Then user enters "Invalid" username
    And user enters "Invalid" password
    And user validates captcha image
    And user clicks on the signin button
