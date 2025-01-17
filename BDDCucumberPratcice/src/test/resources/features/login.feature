@prod
Feature: Login Feature
  			In Order to perform login
  			As user i have to login as valid user name and password

  Scenario Outline: Login to the Facebook website as a valid user
    Given user navigate to the facebook website
    When user validate the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on the signin button

    Examples: 
      | username | password |
      | valid    | valid    |
      | Invalid  | Invalid  |
      | valid    | Invalid  |
      | Invalid  | valid    |
