Feature: Order Product

  Scenario: User is able to order a product
    Given user is logged in and on the home page
      | username          | password    |
      | standard_user     | secret_sauce|
    When user adds a product to the cart
    And user goes to the cart
    And user proceeds to checkout
    And user enters their details
      | firstName | lastName | postalCode |
      | John      | Doe      | 12345      |
    And user clicks continue
    And user clicks finish
    Then order should be placed successfully
