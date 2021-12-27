Feature: Price Slider function check
  Background:
    Given I am on Homepage

  @Smoke @Regression
  Scenario:As a User I can verify User Should See Price Change Result
    When I select 'Women' from menu by mouseHover
    And I select summer dress from it
    And I verify Summer dress text display
    Then I can set price
