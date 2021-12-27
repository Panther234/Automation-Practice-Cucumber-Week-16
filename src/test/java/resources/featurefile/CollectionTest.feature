Feature: Only selected items display
  Background:
    Given I am on Homepage

  @Sanity @Smoke @Regression
  Scenario:As a user I can verify User Should See Summer Collection
    When I select 'Women' from menu by mouseHover
    And I select summer dress from it
    Then I verify Summer dress text display

