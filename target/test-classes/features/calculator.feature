Feature: Calculator Tests

  Background:
    Given User is on calculator page

  Scenario: Test Adding
    When user cliks "5" on calculator
    And user cliks "+" on calculator
    And user cliks "5" on calculator
    Then result "10" should be displayed

  @calc
  Scenario: Test Suctracking
    When user cliks "9" on calculator
    And user cliks "–" on calculator
    And user cliks "5" on calculator
    Then result "4" should be displayed