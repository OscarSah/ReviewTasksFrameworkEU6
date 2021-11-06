Feature: User navigates through product categories
  Agile Story: As a user, I should be able to navigate through different product categories

  Background: Go to home page
    Given User is on the Home Page

  Scenario: User navigates through different product categories
    When User navigates to "Sony vaio i5" in "Laptops" category
    Then User should be able to see "Sony vaio i5" product

  @wip
  Scenario Outline: User navigates to <expectedProduct>
    When User navigates to "<expectedProduct>" in "<category>" category
    Then User should be able to see "<actualProduct>" product

    Examples:
      | category | expectedProduct   | actualProduct     |
      | Laptops  | Sony vaio i5      | Sony vaio i5      |
      | Monitors | Apple monitor 24  | Apple monitor 24  |
      | Phones   | Samsung galaxy s6 | Samsung galaxy s6 |
