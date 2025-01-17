Feature: Login Feature
  			In Order to perform login
  			As user i have to login as valid user name and password

  Scenario: Login to the Facebook website
    Given user navigate to the facebook website
    When user validate the homepage title
    Then user enters username
    And user enters password
    And user clicks on the signin button
