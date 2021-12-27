Feature: Shopping cart delete
  Background:
    Given I am on Homepage
  @Regression
  Scenario: As a user I can verify that user should Create account successfully
    When I select 'Women' from menu
    And I select Product from it
    And I click on Add to cart button
    And I click Proceed to checkout button
    And I click Delete button
    Then I verify empty cart message


