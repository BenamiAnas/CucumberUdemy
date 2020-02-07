Feature: Login into a account
  Background:
    Given User navigates into a webdriveruniversity website
    And User click LOGIN PORTAL
    And User enter a correct username
@ValidPassword
  Scenario: User enter a Valid password
    And User enter a "valid" password
    Then User click the button Submit
  @InValidPassword
  Scenario:  User enter invalid password
    And User enter a "invalid" password
    Then User click the button Submit
