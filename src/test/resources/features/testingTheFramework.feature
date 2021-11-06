Feature: Testing the Framework

  Scenario: Running some simple print test

    Given User navigates to google homepage
    And Search for wooden spoon
    Then The results should contain wooden spoon
