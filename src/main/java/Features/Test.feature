Feature: Test LOGIN
@Groupe
  Scenario Outline: Login with Scenario outline 2

    Given Im in the home page "<url>"
    And I click the login button
    And I enter my "<user_name>" username
    And I enter my"<password>" password
    Then I enter the submite button

    Examples:
      |url                            |user_name  |password      |
      |http://webdriveruniversity.com/|"webdriver"|"webdriver"   |
      |http://webdriveruniversity.com/|"webdriver"|"webdriver123"|
