Feature: Test LOGIN 2
@Groupe2
  Scenario: Login with Scenario outline 22

    Given Im in the home page
      |http://webdriveruniversity.com/|
    And I click the login button
    And I enter my username
      |"webdriver2"|
    And I enter my password
      |"webdriver2" |
  Then I enter the submite button




