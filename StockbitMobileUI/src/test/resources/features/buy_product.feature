Feature: Buy product on Sauce Labs demo app
  Scenario: Buy Sauce Lab Back Packs with Blue color and quantity 2
    Given user opens the app
    When user selects product "Sauce Lab Back Packs"
    And user chooses color "Blue"
    And user sets quantity to 2
    And user adds the item to cart
    Then cart should show product "Sauce Lab Back Packs" with color "Blue" and quantity 2
