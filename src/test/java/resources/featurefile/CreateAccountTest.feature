Feature: Create account function check
  Background:
    Given I am on Homepage
  @Regression
  Scenario: As a user I can verify that user should Create account successfully
    When I Click on Sign In link
    And I Enter 'Email' in email address field
    And I click on 'Create an account' button
    And I enter 'FirstName' in customer first name field
    And I enter 'LastName' in customer last name field
    And I enter 'Password' in password field
    And I enter 'FirstName' in first name field
    And I enter 'LastName' in last name field
    And I enter 'Address' in address field
    And I enter 'City' in city field
    And I enter 'State' in state field
    And I enter 'ZipCode' in zipcode field
    And I enter 'Phone Number' in phone number field
    And I enter 'Reference' in reference field
    And I click on 'Register' button
    And I verify 'My Account' text displayed
    Then I can verify Account name on

