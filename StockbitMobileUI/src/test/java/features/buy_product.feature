Feature: Buy product from Sauce Demo App

  Scenario: Purchase Sauce Lab Back Packs
    Given user opens the demo app
    When user logs in with valid credentials
    And user selects "Sauce Labs Backpack"
    And user selects color "Blue"
    And user adds 2 items to the cart
    Then user should see 2 "Sauce Labs Backpack" items in the checkout summary
