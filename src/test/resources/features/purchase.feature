Feature: Purchase Feature
  User Story: As a user, I should be able to place order from the WebSite

  Background: home page
    Given User is on the Home Page
  @wip
    Scenario: User adds or deletes products from the Cart
      When User navigates to "Sony vaio i5" in "Laptops" category
      And User adds the product
      Then Cart should have the product included