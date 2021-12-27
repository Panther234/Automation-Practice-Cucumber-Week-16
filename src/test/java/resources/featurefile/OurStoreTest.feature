Feature: Our store map functionality
  Background:
    Given I am on Homepage
  @Regression
  Scenario:As a user I can verify that user can browse our store on Map
    When I click on Our Stores link
    And I can click on Map
    Then I can see stores from West Palm Beach